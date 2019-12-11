package edu.cn.cpu.domain;

import java.util.List;

public class ChangeStatus {
    private Long programnumberId;
    private List<Long> volunteers;

    public Long getProgramnumberId() {
        return programnumberId;
    }

    public void setProgramnumberId(Long programnumberId) {
        this.programnumberId = programnumberId;
    }

    public List<Long> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(List<Long> volunteers) {
        this.volunteers = volunteers;
    }
}
