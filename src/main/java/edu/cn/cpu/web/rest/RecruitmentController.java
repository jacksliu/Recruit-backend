package edu.cn.cpu.web.rest;


import edu.cn.cpu.domain.*;
import edu.cn.cpu.domain.auto.Tblapply;
import edu.cn.cpu.domain.auto.Tblprogram;
import edu.cn.cpu.domain.auto.Tbluser;
import edu.cn.cpu.service.RecruitmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecruitmentController {

    private final RecruitmentService recruitmentService;

    public RecruitmentController(RecruitmentService recruitmentService) {
        this.recruitmentService = recruitmentService;
    }

    /**
     * 通过用户名和密码登陆 post
     * @Param  json:{'userName': ,'userPwd'：}
     * @return json:{
     'res':(登陆成功与否 0不存在该用户 1存在该用户密码错误 2登陆成功),
     'type':(登录人员类型（如果登陆失败,type为空,否则type有值 其中 0病人 1健康人 2机构）)
    }
    */
//    @GetMapping("/login")
//    public ResponseEntity<Integer> getUser(@RequestParam(value = "UserName") String userName,
//                                           @RequestParam(value = "UserPwd") String userPwd){
//        Integer user = recruitmentService.getUser(userName,userPwd);
//        return ResponseEntity.ok().body(user);
//    }
    @PostMapping("/login")
    public ResponseEntity<Login> getUser(@RequestBody Tbluser tbluser){
        Login user = recruitmentService.getUser(tbluser.getUsername(),tbluser.getUserpwd());
        return ResponseEntity.ok().body(user);
    }


    /**
     * 志愿者注册
     * @param register
     * @return
     */
    @PostMapping("/register/volunteer")
    public ResponseEntity<Tbluser> registerVolunteer(@RequestBody Register register) {
        Tbluser res = recruitmentService.registerVolunteer(register);
        return ResponseEntity.ok().body(res);
    }


    /**
     * 志愿者获取所有项目
     * @return
     */
    @GetMapping("/project/getall")
    public ResponseEntity<List<Tblprogram>> getAllProgject() {
        List<Tblprogram> tblprograms = recruitmentService.getAllProgram();
        return ResponseEntity.ok().body(tblprograms);
    }


    /**
     *志愿者申请项目
     * @return
     */
    @PostMapping("/project/application")
    public ResponseEntity<Boolean> applyProject(@RequestBody Apply apply) {
        Boolean res = recruitmentService.applyProgram(apply);
        return ResponseEntity.ok().body(res);
    }


    /**
     * 志愿者查看项目状态
     * @return 0未审核  1已审核通过  2已审核未通过
     */
    @PostMapping("/project/status")
    public ResponseEntity<List<Status>> getSataus(@RequestBody Tbluser tbluser) {
        List<Status> res = recruitmentService.getStatusByVo(tbluser);
        return ResponseEntity.ok().body(res);
    }






    /**
     * 机构注册
     * @param register
     * @return
     */
    @PostMapping("/register/promulgator")
    public ResponseEntity<Tbluser> registerPromulgator(@RequestBody Register register){
        Tbluser res = recruitmentService.registerPromulgator(register);
        return ResponseEntity.ok().body(res);
    }


    /**
     *机构发布项目
     * @param publish
     * @return
     */
    @PostMapping("/project/publish")
    public ResponseEntity<Boolean> ProjectManage(@RequestBody Publish publish) {
        Boolean res = recruitmentService.publishProgram(publish);
        return ResponseEntity.ok().body(res);
    }


    /**
     * 机构查询已经发布项目
     * @param tbluser
     * @return
     */
    @PostMapping("/project/getprogrambypro")
    public ResponseEntity<List<Tblprogram>> getProgramByPro(@RequestBody Tbluser tbluser){
        List<Tblprogram> tblprograms = recruitmentService.getProgramByPro(tbluser);
        return ResponseEntity.ok().body(tblprograms);
    }


    @PostMapping("/project/manageVolunteers")
    public ResponseEntity<List<Filter>> getVolunteersByPID(@RequestBody Tblapply tblapply){
        List<Filter> filters = recruitmentService.getVolunnetsByPID(tblapply.getProgramnumberId());
        return ResponseEntity.ok().body(filters);
    }

    /**
     * 机构筛选项目志愿者
     * @param tblapply
     * @return
     */
    @PostMapping("/project/filter")
    public ResponseEntity<Boolean> filterVolunteer(@RequestBody Tblapply tblapply) {
        boolean res = recruitmentService.changeSatatus(tblapply);
        return ResponseEntity.ok().body(res);
    }


}
