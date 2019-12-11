package edu.cn.cpu.domain.auto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Tblprogram {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.ProgramNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String programnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.ProgramName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String programname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.State
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.DrugName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String drugname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.TotalNumberPeople
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Integer totalnumberpeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.DiseaseType_id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Long diseasetypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.AdaptationDisease
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String adaptationdisease;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.StartTime
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.EndTime
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblProgram.ProgramDetail
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String programdetail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.id
     *
     * @return the value of tblProgram.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.id
     *
     * @param id the value for tblProgram.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.ProgramNumber
     *
     * @return the value of tblProgram.ProgramNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getProgramnumber() {
        return programnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.ProgramNumber
     *
     * @param programnumber the value for tblProgram.ProgramNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setProgramnumber(String programnumber) {
        this.programnumber = programnumber == null ? null : programnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.ProgramName
     *
     * @return the value of tblProgram.ProgramName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getProgramname() {
        return programname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.ProgramName
     *
     * @param programname the value for tblProgram.ProgramName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setProgramname(String programname) {
        this.programname = programname == null ? null : programname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.State
     *
     * @return the value of tblProgram.State
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.State
     *
     * @param state the value for tblProgram.State
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.DrugName
     *
     * @return the value of tblProgram.DrugName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getDrugname() {
        return drugname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.DrugName
     *
     * @param drugname the value for tblProgram.DrugName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.TotalNumberPeople
     *
     * @return the value of tblProgram.TotalNumberPeople
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Integer getTotalnumberpeople() {
        return totalnumberpeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.TotalNumberPeople
     *
     * @param totalnumberpeople the value for tblProgram.TotalNumberPeople
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setTotalnumberpeople(Integer totalnumberpeople) {
        this.totalnumberpeople = totalnumberpeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.DiseaseType_id
     *
     * @return the value of tblProgram.DiseaseType_id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Long getDiseasetypeId() {
        return diseasetypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.DiseaseType_id
     *
     * @param diseasetypeId the value for tblProgram.DiseaseType_id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setDiseasetypeId(Long diseasetypeId) {
        this.diseasetypeId = diseasetypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.AdaptationDisease
     *
     * @return the value of tblProgram.AdaptationDisease
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getAdaptationdisease() {
        return adaptationdisease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.AdaptationDisease
     *
     * @param adaptationdisease the value for tblProgram.AdaptationDisease
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setAdaptationdisease(String adaptationdisease) {
        this.adaptationdisease = adaptationdisease == null ? null : adaptationdisease.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.StartTime
     *
     * @return the value of tblProgram.StartTime
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.StartTime
     *
     * @param starttime the value for tblProgram.StartTime
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.EndTime
     *
     * @return the value of tblProgram.EndTime
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.EndTime
     *
     * @param endtime the value for tblProgram.EndTime
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblProgram.ProgramDetail
     *
     * @return the value of tblProgram.ProgramDetail
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getProgramdetail() {
        return programdetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblProgram.ProgramDetail
     *
     * @param programdetail the value for tblProgram.ProgramDetail
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setProgramdetail(String programdetail) {
        this.programdetail = programdetail == null ? null : programdetail.trim();
    }
}