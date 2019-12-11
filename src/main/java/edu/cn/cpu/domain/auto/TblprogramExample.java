package edu.cn.cpu.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblprogramExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public TblprogramExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProgramnumberIsNull() {
            addCriterion("ProgramNumber is null");
            return (Criteria) this;
        }

        public Criteria andProgramnumberIsNotNull() {
            addCriterion("ProgramNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProgramnumberEqualTo(String value) {
            addCriterion("ProgramNumber =", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberNotEqualTo(String value) {
            addCriterion("ProgramNumber <>", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberGreaterThan(String value) {
            addCriterion("ProgramNumber >", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProgramNumber >=", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberLessThan(String value) {
            addCriterion("ProgramNumber <", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberLessThanOrEqualTo(String value) {
            addCriterion("ProgramNumber <=", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberLike(String value) {
            addCriterion("ProgramNumber like", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberNotLike(String value) {
            addCriterion("ProgramNumber not like", value, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberIn(List<String> values) {
            addCriterion("ProgramNumber in", values, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberNotIn(List<String> values) {
            addCriterion("ProgramNumber not in", values, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberBetween(String value1, String value2) {
            addCriterion("ProgramNumber between", value1, value2, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnumberNotBetween(String value1, String value2) {
            addCriterion("ProgramNumber not between", value1, value2, "programnumber");
            return (Criteria) this;
        }

        public Criteria andProgramnameIsNull() {
            addCriterion("ProgramName is null");
            return (Criteria) this;
        }

        public Criteria andProgramnameIsNotNull() {
            addCriterion("ProgramName is not null");
            return (Criteria) this;
        }

        public Criteria andProgramnameEqualTo(String value) {
            addCriterion("ProgramName =", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotEqualTo(String value) {
            addCriterion("ProgramName <>", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameGreaterThan(String value) {
            addCriterion("ProgramName >", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProgramName >=", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLessThan(String value) {
            addCriterion("ProgramName <", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLessThanOrEqualTo(String value) {
            addCriterion("ProgramName <=", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLike(String value) {
            addCriterion("ProgramName like", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotLike(String value) {
            addCriterion("ProgramName not like", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameIn(List<String> values) {
            addCriterion("ProgramName in", values, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotIn(List<String> values) {
            addCriterion("ProgramName not in", values, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameBetween(String value1, String value2) {
            addCriterion("ProgramName between", value1, value2, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotBetween(String value1, String value2) {
            addCriterion("ProgramName not between", value1, value2, "programname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNull() {
            addCriterion("DrugName is null");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNotNull() {
            addCriterion("DrugName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnameEqualTo(String value) {
            addCriterion("DrugName =", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotEqualTo(String value) {
            addCriterion("DrugName <>", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThan(String value) {
            addCriterion("DrugName >", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThanOrEqualTo(String value) {
            addCriterion("DrugName >=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThan(String value) {
            addCriterion("DrugName <", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThanOrEqualTo(String value) {
            addCriterion("DrugName <=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLike(String value) {
            addCriterion("DrugName like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotLike(String value) {
            addCriterion("DrugName not like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameIn(List<String> values) {
            addCriterion("DrugName in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotIn(List<String> values) {
            addCriterion("DrugName not in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameBetween(String value1, String value2) {
            addCriterion("DrugName between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotBetween(String value1, String value2) {
            addCriterion("DrugName not between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleIsNull() {
            addCriterion("TotalNumberPeople is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleIsNotNull() {
            addCriterion("TotalNumberPeople is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleEqualTo(Integer value) {
            addCriterion("TotalNumberPeople =", value, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleNotEqualTo(Integer value) {
            addCriterion("TotalNumberPeople <>", value, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleGreaterThan(Integer value) {
            addCriterion("TotalNumberPeople >", value, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("TotalNumberPeople >=", value, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleLessThan(Integer value) {
            addCriterion("TotalNumberPeople <", value, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("TotalNumberPeople <=", value, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleIn(List<Integer> values) {
            addCriterion("TotalNumberPeople in", values, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleNotIn(List<Integer> values) {
            addCriterion("TotalNumberPeople not in", values, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleBetween(Integer value1, Integer value2) {
            addCriterion("TotalNumberPeople between", value1, value2, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andTotalnumberpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("TotalNumberPeople not between", value1, value2, "totalnumberpeople");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdIsNull() {
            addCriterion("DiseaseType_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdIsNotNull() {
            addCriterion("DiseaseType_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdEqualTo(Long value) {
            addCriterion("DiseaseType_id =", value, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdNotEqualTo(Long value) {
            addCriterion("DiseaseType_id <>", value, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdGreaterThan(Long value) {
            addCriterion("DiseaseType_id >", value, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DiseaseType_id >=", value, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdLessThan(Long value) {
            addCriterion("DiseaseType_id <", value, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdLessThanOrEqualTo(Long value) {
            addCriterion("DiseaseType_id <=", value, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdIn(List<Long> values) {
            addCriterion("DiseaseType_id in", values, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdNotIn(List<Long> values) {
            addCriterion("DiseaseType_id not in", values, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdBetween(Long value1, Long value2) {
            addCriterion("DiseaseType_id between", value1, value2, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andDiseasetypeIdNotBetween(Long value1, Long value2) {
            addCriterion("DiseaseType_id not between", value1, value2, "diseasetypeId");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseIsNull() {
            addCriterion("AdaptationDisease is null");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseIsNotNull() {
            addCriterion("AdaptationDisease is not null");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseEqualTo(String value) {
            addCriterion("AdaptationDisease =", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseNotEqualTo(String value) {
            addCriterion("AdaptationDisease <>", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseGreaterThan(String value) {
            addCriterion("AdaptationDisease >", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("AdaptationDisease >=", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseLessThan(String value) {
            addCriterion("AdaptationDisease <", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseLessThanOrEqualTo(String value) {
            addCriterion("AdaptationDisease <=", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseLike(String value) {
            addCriterion("AdaptationDisease like", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseNotLike(String value) {
            addCriterion("AdaptationDisease not like", value, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseIn(List<String> values) {
            addCriterion("AdaptationDisease in", values, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseNotIn(List<String> values) {
            addCriterion("AdaptationDisease not in", values, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseBetween(String value1, String value2) {
            addCriterion("AdaptationDisease between", value1, value2, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andAdaptationdiseaseNotBetween(String value1, String value2) {
            addCriterion("AdaptationDisease not between", value1, value2, "adaptationdisease");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andProgramdetailIsNull() {
            addCriterion("ProgramDetail is null");
            return (Criteria) this;
        }

        public Criteria andProgramdetailIsNotNull() {
            addCriterion("ProgramDetail is not null");
            return (Criteria) this;
        }

        public Criteria andProgramdetailEqualTo(String value) {
            addCriterion("ProgramDetail =", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailNotEqualTo(String value) {
            addCriterion("ProgramDetail <>", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailGreaterThan(String value) {
            addCriterion("ProgramDetail >", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailGreaterThanOrEqualTo(String value) {
            addCriterion("ProgramDetail >=", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailLessThan(String value) {
            addCriterion("ProgramDetail <", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailLessThanOrEqualTo(String value) {
            addCriterion("ProgramDetail <=", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailLike(String value) {
            addCriterion("ProgramDetail like", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailNotLike(String value) {
            addCriterion("ProgramDetail not like", value, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailIn(List<String> values) {
            addCriterion("ProgramDetail in", values, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailNotIn(List<String> values) {
            addCriterion("ProgramDetail not in", values, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailBetween(String value1, String value2) {
            addCriterion("ProgramDetail between", value1, value2, "programdetail");
            return (Criteria) this;
        }

        public Criteria andProgramdetailNotBetween(String value1, String value2) {
            addCriterion("ProgramDetail not between", value1, value2, "programdetail");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tblProgram
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 05 14:02:57 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tblProgram
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}