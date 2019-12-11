package edu.cn.cpu.domain;

import edu.cn.cpu.domain.auto.Tblpromulgator;
import edu.cn.cpu.domain.auto.Tbluser;
import edu.cn.cpu.domain.auto.Tblvolunteer;

public class Register extends Tbluser {
    //注册类 包括患者 健康人 机构
    private Tblvolunteer tblvolunteer;
    private Tblpromulgator tblpromulgator;

    public Tblvolunteer getTblvolunteer() {
        return tblvolunteer;
    }

    public void setTblvolunteer(Tblvolunteer tblvolunteer) {
        this.tblvolunteer = tblvolunteer;
    }

    public Tblpromulgator getTblpromulgator() {
        return tblpromulgator;
    }

    public void setTblpromulgator(Tblpromulgator tblpromulgator) {
        this.tblpromulgator = tblpromulgator;
    }
}
