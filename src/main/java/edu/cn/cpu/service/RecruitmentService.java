package edu.cn.cpu.service;

import edu.cn.cpu.domain.*;
import edu.cn.cpu.domain.auto.Tblapply;
import edu.cn.cpu.domain.auto.Tblprogram;
import edu.cn.cpu.domain.auto.Tbluser;
import edu.cn.cpu.domain.auto.Tblvolunteer;

import java.util.List;


public interface RecruitmentService {
    /**
     * 通过用户命和密码   获取user 其它信息
     * @param tbluser
     * @return
     */
    Tbluser userToCustomer(Tbluser tbluser);

    /**
     * 通过用户名和密码登陆
     * @param userName
     * @param userPwd
     * @return 0不存在该用户  1存在该用户但密码错误  2登陆成功
     */
    Login getUser(String userName, String userPwd);


    /**
     * 志愿者注册
     * @param register
     * @return
     */
    Tbluser registerVolunteer(Register register);


    /**
     * 志愿者获取所有项目
     * @return
     */
    List<Tblprogram> getAllProgram();


    /**
     * 志愿者通过项目id获取项目详情信息
     * @param id
     * @return
     */
    Tblprogram getProgramById(Long id);


    /**
     * 志愿者申请项目
     * @param apply
     * @return
     */
    Boolean applyProgram(Apply apply);


    /**
     * 志愿者查看已申请项目状态
     * @param tbluser
     * @return
     */
    List<Status> getStatusByVo(Tbluser tbluser);






    /**
     * 机构注册
     * @param register
     * @return
     */
    Tbluser registerPromulgator(Register register);


    /**
     * 机构发布项目
     * @param publish
     * @return
     */
    Boolean publishProgram(Publish publish);


    /**
     * 机构查询已经发布项目
     * @return
     */
    List<Tblprogram> getProgramByPro(Tbluser tbluser);

    /**
     * 机构通过志愿者id查询志愿者详情信息
     * @param id
     * @return
     */
    Tblvolunteer getVolunteerByID(Long id);


    /**
     * 机构通过项目id号查询某一项目申请人
     * @param id
     * @return
     */
    List<Filter> getVolunnetsByPID(Long id);


    /**
     * 机构改变项目申请人的申请状态;
     * @param tblapply
     * @return
     */
    Boolean changeSatatus (Tblapply tblapply);


}
