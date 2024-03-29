package edu.cn.cpu.domain.auto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Tblvolunteer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.VolunteerNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String volunteernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.VolunteerName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String volunteername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.Sex
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.Birthday
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.DiseaseType_id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Long diseasetypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.DiseaseDetail
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String diseasedetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.Tel
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblVolunteer.Address
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.id
     *
     * @return the value of tblVolunteer.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.id
     *
     * @param id the value for tblVolunteer.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.VolunteerNumber
     *
     * @return the value of tblVolunteer.VolunteerNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getVolunteernumber() {
        return volunteernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.VolunteerNumber
     *
     * @param volunteernumber the value for tblVolunteer.VolunteerNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setVolunteernumber(String volunteernumber) {
        this.volunteernumber = volunteernumber == null ? null : volunteernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.VolunteerName
     *
     * @return the value of tblVolunteer.VolunteerName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getVolunteername() {
        return volunteername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.VolunteerName
     *
     * @param volunteername the value for tblVolunteer.VolunteerName
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setVolunteername(String volunteername) {
        this.volunteername = volunteername == null ? null : volunteername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.Sex
     *
     * @return the value of tblVolunteer.Sex
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.Sex
     *
     * @param sex the value for tblVolunteer.Sex
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.Birthday
     *
     * @return the value of tblVolunteer.Birthday
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.Birthday
     *
     * @param birthday the value for tblVolunteer.Birthday
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.DiseaseType_id
     *
     * @return the value of tblVolunteer.DiseaseType_id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Long getDiseasetypeId() {
        return diseasetypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.DiseaseType_id
     *
     * @param diseasetypeId the value for tblVolunteer.DiseaseType_id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setDiseasetypeId(Long diseasetypeId) {
        this.diseasetypeId = diseasetypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.DiseaseDetail
     *
     * @return the value of tblVolunteer.DiseaseDetail
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getDiseasedetail() {
        return diseasedetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.DiseaseDetail
     *
     * @param diseasedetail the value for tblVolunteer.DiseaseDetail
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setDiseasedetail(String diseasedetail) {
        this.diseasedetail = diseasedetail == null ? null : diseasedetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.Tel
     *
     * @return the value of tblVolunteer.Tel
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.Tel
     *
     * @param tel the value for tblVolunteer.Tel
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblVolunteer.Address
     *
     * @return the value of tblVolunteer.Address
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblVolunteer.Address
     *
     * @param address the value for tblVolunteer.Address
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}