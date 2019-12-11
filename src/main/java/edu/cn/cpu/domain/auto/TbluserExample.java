package edu.cn.cpu.domain.auto;

import java.util.ArrayList;
import java.util.List;

public class TbluserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public TbluserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
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
     * This method corresponds to the database table tblUser
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
     * This method corresponds to the database table tblUser
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblUser
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
     * This class corresponds to the database table tblUser
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("UserPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("UserPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("UserPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("UserPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("UserPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UserPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("UserPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("UserPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("UserPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("UserPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("UserPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("UserPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("UserPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("UserPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdIsNull() {
            addCriterion("VolunteerNumber_id is null");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdIsNotNull() {
            addCriterion("VolunteerNumber_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdEqualTo(Long value) {
            addCriterion("VolunteerNumber_id =", value, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdNotEqualTo(Long value) {
            addCriterion("VolunteerNumber_id <>", value, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdGreaterThan(Long value) {
            addCriterion("VolunteerNumber_id >", value, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VolunteerNumber_id >=", value, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdLessThan(Long value) {
            addCriterion("VolunteerNumber_id <", value, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdLessThanOrEqualTo(Long value) {
            addCriterion("VolunteerNumber_id <=", value, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdIn(List<Long> values) {
            addCriterion("VolunteerNumber_id in", values, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdNotIn(List<Long> values) {
            addCriterion("VolunteerNumber_id not in", values, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdBetween(Long value1, Long value2) {
            addCriterion("VolunteerNumber_id between", value1, value2, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andVolunteernumberIdNotBetween(Long value1, Long value2) {
            addCriterion("VolunteerNumber_id not between", value1, value2, "volunteernumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdIsNull() {
            addCriterion("PromulgatorNumber_id is null");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdIsNotNull() {
            addCriterion("PromulgatorNumber_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdEqualTo(Long value) {
            addCriterion("PromulgatorNumber_id =", value, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdNotEqualTo(Long value) {
            addCriterion("PromulgatorNumber_id <>", value, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdGreaterThan(Long value) {
            addCriterion("PromulgatorNumber_id >", value, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PromulgatorNumber_id >=", value, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdLessThan(Long value) {
            addCriterion("PromulgatorNumber_id <", value, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdLessThanOrEqualTo(Long value) {
            addCriterion("PromulgatorNumber_id <=", value, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdIn(List<Long> values) {
            addCriterion("PromulgatorNumber_id in", values, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdNotIn(List<Long> values) {
            addCriterion("PromulgatorNumber_id not in", values, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdBetween(Long value1, Long value2) {
            addCriterion("PromulgatorNumber_id between", value1, value2, "promulgatornumberId");
            return (Criteria) this;
        }

        public Criteria andPromulgatornumberIdNotBetween(Long value1, Long value2) {
            addCriterion("PromulgatorNumber_id not between", value1, value2, "promulgatornumberId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tblUser
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
     * This class corresponds to the database table tblUser
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