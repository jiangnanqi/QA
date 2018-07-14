package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblAdviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAdviseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAdviseidIsNull() {
            addCriterion("ADVISEID is null");
            return (Criteria) this;
        }

        public Criteria andAdviseidIsNotNull() {
            addCriterion("ADVISEID is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseidEqualTo(String value) {
            addCriterion("ADVISEID =", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotEqualTo(String value) {
            addCriterion("ADVISEID <>", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidGreaterThan(String value) {
            addCriterion("ADVISEID >", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISEID >=", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidLessThan(String value) {
            addCriterion("ADVISEID <", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidLessThanOrEqualTo(String value) {
            addCriterion("ADVISEID <=", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidLike(String value) {
            addCriterion("ADVISEID like", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotLike(String value) {
            addCriterion("ADVISEID not like", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidIn(List<String> values) {
            addCriterion("ADVISEID in", values, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotIn(List<String> values) {
            addCriterion("ADVISEID not in", values, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidBetween(String value1, String value2) {
            addCriterion("ADVISEID between", value1, value2, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotBetween(String value1, String value2) {
            addCriterion("ADVISEID not between", value1, value2, "adviseid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("TEXT is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("TEXT =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("TEXT <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("TEXT >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("TEXT <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("TEXT <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("TEXT like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("TEXT not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("TEXT in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("TEXT not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("TEXT between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("TEXT not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andAnnexIsNull() {
            addCriterion("ANNEX is null");
            return (Criteria) this;
        }

        public Criteria andAnnexIsNotNull() {
            addCriterion("ANNEX is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexEqualTo(String value) {
            addCriterion("ANNEX =", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotEqualTo(String value) {
            addCriterion("ANNEX <>", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexGreaterThan(String value) {
            addCriterion("ANNEX >", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexGreaterThanOrEqualTo(String value) {
            addCriterion("ANNEX >=", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexLessThan(String value) {
            addCriterion("ANNEX <", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexLessThanOrEqualTo(String value) {
            addCriterion("ANNEX <=", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexLike(String value) {
            addCriterion("ANNEX like", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotLike(String value) {
            addCriterion("ANNEX not like", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexIn(List<String> values) {
            addCriterion("ANNEX in", values, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotIn(List<String> values) {
            addCriterion("ANNEX not in", values, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexBetween(String value1, String value2) {
            addCriterion("ANNEX between", value1, value2, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotBetween(String value1, String value2) {
            addCriterion("ANNEX not between", value1, value2, "annex");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("STATES is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("STATES is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(Integer value) {
            addCriterion("STATES =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(Integer value) {
            addCriterion("STATES <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(Integer value) {
            addCriterion("STATES >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATES >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(Integer value) {
            addCriterion("STATES <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(Integer value) {
            addCriterion("STATES <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<Integer> values) {
            addCriterion("STATES in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<Integer> values) {
            addCriterion("STATES not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(Integer value1, Integer value2) {
            addCriterion("STATES between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("STATES not between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeIsNull() {
            addCriterion("ADVISETIME is null");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeIsNotNull() {
            addCriterion("ADVISETIME is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeEqualTo(String value) {
            addCriterion("ADVISETIME =", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeNotEqualTo(String value) {
            addCriterion("ADVISETIME <>", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeGreaterThan(String value) {
            addCriterion("ADVISETIME >", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISETIME >=", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeLessThan(String value) {
            addCriterion("ADVISETIME <", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeLessThanOrEqualTo(String value) {
            addCriterion("ADVISETIME <=", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeLike(String value) {
            addCriterion("ADVISETIME like", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeNotLike(String value) {
            addCriterion("ADVISETIME not like", value, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeIn(List<String> values) {
            addCriterion("ADVISETIME in", values, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeNotIn(List<String> values) {
            addCriterion("ADVISETIME not in", values, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeBetween(String value1, String value2) {
            addCriterion("ADVISETIME between", value1, value2, "advisetime");
            return (Criteria) this;
        }

        public Criteria andAdvisetimeNotBetween(String value1, String value2) {
            addCriterion("ADVISETIME not between", value1, value2, "advisetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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