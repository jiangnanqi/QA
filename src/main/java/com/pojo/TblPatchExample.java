package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblPatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPatchExample() {
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

        public Criteria andConfigureidIsNull() {
            addCriterion("CONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andConfigureidIsNotNull() {
            addCriterion("CONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureidEqualTo(String value) {
            addCriterion("CONFIGUREID =", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotEqualTo(String value) {
            addCriterion("CONFIGUREID <>", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidGreaterThan(String value) {
            addCriterion("CONFIGUREID >", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID >=", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLessThan(String value) {
            addCriterion("CONFIGUREID <", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID <=", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLike(String value) {
            addCriterion("CONFIGUREID like", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotLike(String value) {
            addCriterion("CONFIGUREID not like", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidIn(List<String> values) {
            addCriterion("CONFIGUREID in", values, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotIn(List<String> values) {
            addCriterion("CONFIGUREID not in", values, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidBetween(String value1, String value2) {
            addCriterion("CONFIGUREID between", value1, value2, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREID not between", value1, value2, "configureid");
            return (Criteria) this;
        }

        public Criteria andPatchnumberIsNull() {
            addCriterion("PATCHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPatchnumberIsNotNull() {
            addCriterion("PATCHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPatchnumberEqualTo(String value) {
            addCriterion("PATCHNUMBER =", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberNotEqualTo(String value) {
            addCriterion("PATCHNUMBER <>", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberGreaterThan(String value) {
            addCriterion("PATCHNUMBER >", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("PATCHNUMBER >=", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberLessThan(String value) {
            addCriterion("PATCHNUMBER <", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberLessThanOrEqualTo(String value) {
            addCriterion("PATCHNUMBER <=", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberLike(String value) {
            addCriterion("PATCHNUMBER like", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberNotLike(String value) {
            addCriterion("PATCHNUMBER not like", value, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberIn(List<String> values) {
            addCriterion("PATCHNUMBER in", values, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberNotIn(List<String> values) {
            addCriterion("PATCHNUMBER not in", values, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberBetween(String value1, String value2) {
            addCriterion("PATCHNUMBER between", value1, value2, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andPatchnumberNotBetween(String value1, String value2) {
            addCriterion("PATCHNUMBER not between", value1, value2, "patchnumber");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("LANGUAGE <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("LANGUAGE like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("LANGUAGE not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "language");
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