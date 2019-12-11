package edu.cn.cpu.service.impl;


import edu.cn.cpu.domain.*;
import edu.cn.cpu.domain.auto.*;
import edu.cn.cpu.repository.auto.*;
import edu.cn.cpu.service.RecruitmentService;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.Temperature;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RecruitmentServiceImpl implements RecruitmentService {
    private final TblapplyMapper tblapplyMapper;
    private final TblppMapper tblppMapper;
    private final TblprogramMapper tblprogramMapper;
    private final TbluserMapper tbluserMapper;
    private final TblvolunteerMapper tblvolunteerMapper;
    private final TblpromulgatorMapper tblpromulgatorMapper;
    private final TbldiseasetypeMapper tbldiseasetypeMapper;

    public RecruitmentServiceImpl(TblapplyMapper tblapplyMapper,
                                  TblppMapper tblppMapper,
                                  TblprogramMapper tblprogramMapper,
                                  TbluserMapper tbluserMapper,
                                  TblvolunteerMapper tblvolunteerMapper,
                                  TblpromulgatorMapper tblpromulgatorMapper,
                                  TbldiseasetypeMapper tbldiseasetypeMapper) {
        this.tblapplyMapper = tblapplyMapper;
        this.tblppMapper = tblppMapper;
        this.tblprogramMapper = tblprogramMapper;
        this.tbluserMapper = tbluserMapper;
        this.tblvolunteerMapper = tblvolunteerMapper;
        this.tblpromulgatorMapper = tblpromulgatorMapper;
        this.tbldiseasetypeMapper = tbldiseasetypeMapper;
    }


    /**
     * 通过用户命和密码   获取user 其它信息
     * @param tbluser
     * @return
     */
    @Override
    public Tbluser userToCustomer(Tbluser tbluser){
        Tbluser tbluser1 = new Tbluser();
        TbluserExample example = new TbluserExample();
        example.createCriteria().andUsernameEqualTo(tbluser.getUsername());
        List<Tbluser> tblusers = tbluserMapper.selectByExample(example);
        if (tblusers.size()==0){
            return tbluser1;
        }else return tblusers.get(0);
    }


    /**
     * 登陆名查找
     * @param userName
     * @return 0不存在该用户  1存在该用户但密码错误  2登陆成功
     */
    @Override
    public Login getUser(String userName, String userPwd){
        Login login = new Login();
        TbluserExample example = new TbluserExample();
        example.createCriteria().andUsernameEqualTo(userName);
        List<Tbluser> tblusers = tbluserMapper.selectByExample(example);
        //判断用户是否存在
        if (tblusers.size() == 0){
            login.setRes(0);
        }
        else{
            Tbluser tbluser = tblusers.get(0);
            //判断密码是否正确
            if (tbluser.getUserpwd().equals(userPwd)){
                login.setRes(2);
                //判断登陆类型
                if(tbluser.getVolunteernumberId()==null){
                    login.setType(2);
                }else {
                    Tblvolunteer tblvolunteer = tblvolunteerMapper
                            .selectByPrimaryKey(tbluser.getVolunteernumberId());
                    //判断志愿者类型
                    if(tblvolunteer.getDiseasetypeId().equals(0)){
                        login.setType(1);
                    }else {
                        login.setType(0);
                    }
                }
            }
            else login.setRes(1);
        }
        return login;

    }

    /**
     * 志愿者注册
     * @param register
     * @return
     */
    @Override
    @Transactional
    public Tbluser registerVolunteer(Register register){
        Tbluser tbluser = new Tbluser();
        Tblvolunteer tblvolunteer = register.getTblvolunteer();
        //构建志愿者编号
        TblvolunteerExample example = new TblvolunteerExample();
        Long num = tblvolunteerMapper.countByExample(example) + 1;
        //数字格式化
        DecimalFormat f = new DecimalFormat("0000");
        String num_format = f.format(num);
        String num_code = "ZY2019"+ num_format;
        tblvolunteer.setVolunteernumber(num_code);
        //插入volunteer
        tblvolunteerMapper.insert(tblvolunteer);
        //构造tbluser  获取返回的volunteer_id tbluser
        tbluser.setUsername(register.getUsername());
        tbluser.setUserpwd(register.getUserpwd());
        tbluser.setVolunteernumberId(tblvolunteer.getId());
        tbluserMapper.insert(tbluser);
        return  tbluser;
    }

    /**
     * 机构注册
     * @param register
     * @return
     */
    @Override
    @Transactional
    public Tbluser registerPromulgator(Register register){
        Tbluser tbluser = new Tbluser();
        Tblpromulgator tblpromulgator = register.getTblpromulgator();
        //构建机构编号
        TblpromulgatorExample example = new TblpromulgatorExample();
        Long num = tblpromulgatorMapper.countByExample(example) + 1;
        //格式化数字
        DecimalFormat f = new DecimalFormat("0000");
        String num_format = f.format(num);
        String num_code = "JG2019"+ num_format;
        tblpromulgator.setPromulgatornumber(num_code);
        //插入promulgator
        tblpromulgatorMapper.insert(tblpromulgator);
        //构造tbluser
        tbluser.setUsername(register.getUsername());
        tbluser.setUserpwd(register.getUserpwd());
        tbluser.setPromulgatornumberId(tblpromulgator.getId());
        tbluserMapper.insert(tbluser);
        return tbluser;
    }


    /**
     * 机构发布项目
     * @param publish
     * @return
     */

    @Override
    @Transactional
    public Boolean publishProgram(Publish publish){
        Tblpp tblpp = new Tblpp();
        //获取机构id
        TbluserExample example = new TbluserExample();
        example.createCriteria().andUsernameEqualTo(publish.getUsername());
        List<Tbluser> tblusers = tbluserMapper.selectByExample(example);
        tblpp.setPromulgatornumberId(tblusers.get(0).getPromulgatornumberId());
        //获取项目id
        TblprogramExample tblprogramExample =new TblprogramExample();
        Long num = tblprogramMapper.countByExample(tblprogramExample) + 1;
        //格式化数字
        DecimalFormat f = new DecimalFormat("0000");
        String num_format = f.format(num);
        String num_code = "XM2019"+num_format;
        publish.getTblprogram().setProgramnumber(num_code);
        Tblprogram tblprogram = publish.getTblprogram();
        tblprogramMapper.insert(tblprogram);
        tblpp.setProgramnumberId(tblprogram.getId());
        //插入pp
        int result = tblppMapper.insert(tblpp);

        return  result > 0;
    }

    /**
     * 获取所有项目
     * @return
     */
    @Override
    public List<Tblprogram> getAllProgram(){
        TblprogramExample example = new TblprogramExample();
        List<Tblprogram> list_program = tblprogramMapper.selectByExample(example);
        return list_program;
    }


    /**
     * 通过id获取项目
     * @param id
     * @return
     */
    @Override
    public Tblprogram getProgramById(Long id){
        Tblprogram tblprogram = tblprogramMapper.selectByPrimaryKey(id);
        return tblprogram;
    }


    /**
     * 志愿者申请项目
     * @param apply
     * @return
     */
    @Override
    public Boolean applyProgram(Apply apply){
        TbluserExample example = new TbluserExample();
        example.createCriteria().andUsernameEqualTo(apply.getUsername());
        List<Tbluser> tblusers = tbluserMapper.selectByExample(example);
        Tblapply tblapply = new Tblapply();
        tblapply.setVolunteernumberId(tblusers.get(0).getVolunteernumberId());
        tblapply.setApplystate(0);
        tblapply.setProgramnumberId(apply.getProgramnumber_id());
        int result = tblapplyMapper.insert(tblapply);
        return result > 0;
    }


    /**
     * 机构用户查询已经发布项目
     * @param tbluser
     * @return
     */
    @Override
    public List<Tblprogram> getProgramByPro(Tbluser tbluser){
        TblppExample example = new TblppExample();
        example.createCriteria().
                andPromulgatornumberIdEqualTo(userToCustomer(tbluser).
                        getPromulgatornumberId());
        List<Tblpp> tblpps = tblppMapper.selectByExample(example);
        //通过项目id获取项目所有情况/包括  项目本身的详情信息  以及   项目申请人信息
        List<Tblprogram> tblprograms = new ArrayList<>();
        for(int i = 0; i < tblpps.size(); i++){
            tblprograms.add(getProgramById(tblpps.get(i).getProgramnumberId()));
        }
        return tblprograms;
    }


    /**
     * 志愿者查看已申请项目状态
     * @param tbluser
     * @return
     */
    @Override
    public List<Status> getStatusByVo(Tbluser tbluser){
        Tbluser tbluser1 = userToCustomer(tbluser);
        TblapplyExample example = new TblapplyExample();
        example.createCriteria().
                andVolunteernumberIdEqualTo(tbluser1.getVolunteernumberId());
        List<Tblapply> tblapplies = tblapplyMapper.selectByExample(example);
        List<Status> statuses = new ArrayList<>();
        //如果tblapplies则返回空statues
        if(tblapplies.size()==0){
            return statuses;
        }
        else{
            for (int i = 0 ; i < tblapplies.size(); i++){
                Status status = new Status();
                status.setStatus(tblapplies.get(i).getApplystate());

                Tblprogram tblprogram = getProgramById(tblapplies.get(i).getProgramnumberId());
                status.setAdaptationdisease(tblprogram.getAdaptationdisease());
                status.setDiseasetypeId(tblprogram.getDiseasetypeId());
                status.setDrugname(tblprogram.getDrugname());
                status.setEndtime(tblprogram.getEndtime());
                status.setId(tblprogram.getId());
                status.setProgramdetail(tblprogram.getProgramdetail());
                status.setProgramname(tblprogram.getProgramname());
                status.setProgramnumber(tblprogram.getProgramnumber());
                status.setStarttime(tblprogram.getStarttime());
                status.setTotalnumberpeople(tblprogram.getTotalnumberpeople());
                status.setState(tblprogram.getState());

                statuses.add(status);
                status = null;
                tblprogram = null;
            }
            return statuses;
        }
    }


    @Override
    public Tblvolunteer getVolunteerByID(Long id){
        Tblvolunteer tblvolunteer = tblvolunteerMapper.selectByPrimaryKey(id);
        return tblvolunteer;
    }


    @Override
    public List<Filter> getVolunnetsByPID(Long id){
        TblapplyExample example = new TblapplyExample();
        example.createCriteria().andProgramnumberIdEqualTo(id);
        List<Tblapply> tblapplies = tblapplyMapper.selectByExample(example);

        List<Filter> filters = new ArrayList<>();
        if(tblapplies.size()==0){
            return filters;
        }else {
            for(int i = 0; i < tblapplies.size(); i++){
                Filter filter = new Filter();
                filter.setApplystate(tblapplies.get(i).getApplystate());
                filter.setTblvolunteer(getVolunteerByID(tblapplies.get(i).getVolunteernumberId()));

                filters.add(filter);
                filter = null;
            }
            return filters;
        }
    }


    /*
    @Override
    @Transactional
    public Boolean changeSatatus (ChangeStatus changeStatus){
       //1.把项目筛选的所有人的status都改成审核未通过；0未审核  1已审核通过  2已审核未通过
        TblapplyExample example = new TblapplyExample();
        example.createCriteria()
                .andProgramnumberIdEqualTo(changeStatus.getProgramnumberId());
        List<Tblapply> tblapplies = tblapplyMapper.selectByExample(example);
        if (tblapplies.size()==0){
            return true;
        }else{
            for(int i = 0; i<tblapplies.size();i++){
                Tblapply tblapply = new Tblapply();
                tblapply.setApplystate(2);
                tblapply.setProgramnumberId(tblapplies.get(i).getProgramnumberId());
                tblapply.setVolunteernumberId(tblapplies.get(i).getVolunteernumberId());
                tblapply.setId(tblapplies.get(i).getId());
                tblapplyMapper.updateByPrimaryKeySelective(tblapply);
            }
            for(int j = 0; j<changeStatus.getVolunteers().size(); j++){
                Tblapply tblapply = new Tblapply();
                //通过 项目di 和 志愿者id 查询申请
                TblapplyExample example1 = new TblapplyExample();
                //志愿者id
                example.createCriteria().
                        andVolunteernumberIdEqualTo(changeStatus.getVolunteers().get(j));
                //项目id
                example.createCriteria().
                        andProgramnumberIdEqualTo(changeStatus.getProgramnumberId());
                List<Tblapply> tblapplies1 = tblapplyMapper.selectByExample(example);
                tblapply.setId(tblapplies1.get(0).getId());
                tblapply.setVolunteernumberId(tblapplies1.get(0).getVolunteernumberId());
                tblapply.setProgramnumberId(tblapplies1.get(0).getProgramnumberId());
                tblapply.setApplystate(1);
                tblapplyMapper.updateByPrimaryKeySelective(tblapply);
            }
            return true;
        }

    }
    */


    @Override
    @Transactional
    public Boolean changeSatatus (Tblapply tblapply){
        Tblapply tblapply1 = new Tblapply();
        TblapplyExample example = new TblapplyExample();
        example.createCriteria()
                .andProgramnumberIdEqualTo(tblapply.getProgramnumberId())
                .andVolunteernumberIdEqualTo(tblapply.getVolunteernumberId());
        List<Tblapply> tblapplies = tblapplyMapper.selectByExample(example);
        tblapply1.setId(tblapplies.get(0).getId());
        tblapply1.setProgramnumberId(tblapply.getProgramnumberId());
        tblapply1.setVolunteernumberId(tblapply.getVolunteernumberId());
        tblapply1.setApplystate(tblapply.getApplystate());
        int result = tblapplyMapper.updateByPrimaryKeySelective(tblapply1);
        return result>0;

    }
}
