package edu.cn.cpu.domain;

import edu.cn.cpu.domain.auto.Tblprogram;

public class Publish extends Tblprogram {
    //发布项目的项目数据项
    private Tblprogram tblprogram;
    private String username;

    public Tblprogram getTblprogram() {
        return tblprogram;
    }

    public void setTblprogram(Tblprogram tblprogram) {
        this.tblprogram = tblprogram;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
