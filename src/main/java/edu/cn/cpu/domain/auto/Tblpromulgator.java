package edu.cn.cpu.domain.auto;

public class Tblpromulgator {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblPromulgator.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblPromulgator.PromulgatorNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String promulgatornumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblPromulgator.Organization
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String organization;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tblPromulgator.Tel
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblPromulgator.id
     *
     * @return the value of tblPromulgator.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblPromulgator.id
     *
     * @param id the value for tblPromulgator.id
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblPromulgator.PromulgatorNumber
     *
     * @return the value of tblPromulgator.PromulgatorNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getPromulgatornumber() {
        return promulgatornumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblPromulgator.PromulgatorNumber
     *
     * @param promulgatornumber the value for tblPromulgator.PromulgatorNumber
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setPromulgatornumber(String promulgatornumber) {
        this.promulgatornumber = promulgatornumber == null ? null : promulgatornumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblPromulgator.Organization
     *
     * @return the value of tblPromulgator.Organization
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblPromulgator.Organization
     *
     * @param organization the value for tblPromulgator.Organization
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tblPromulgator.Tel
     *
     * @return the value of tblPromulgator.Tel
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tblPromulgator.Tel
     *
     * @param tel the value for tblPromulgator.Tel
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}