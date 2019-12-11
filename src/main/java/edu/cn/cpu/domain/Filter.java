package edu.cn.cpu.domain;

import edu.cn.cpu.domain.auto.Tblapply;
import edu.cn.cpu.domain.auto.Tblvolunteer;

public class Filter extends Tblapply {
    private Tblvolunteer tblvolunteer;

    public Tblvolunteer getTblvolunteer() {
        return tblvolunteer;
    }

    public void setTblvolunteer(Tblvolunteer tblvolunteer) {
        this.tblvolunteer = tblvolunteer;
    }
}
