package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblBasicconfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblBasicconfigureExample() {
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

        public Criteria andBasicconfigureIsNull() {
            addCriterion("BASICCONFIGURE is null");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureIsNotNull() {
            addCriterion("BASICCONFIGURE is not null");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureEqualTo(String value) {
            addCriterion("BASICCONFIGURE =", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureNotEqualTo(String value) {
            addCriterion("BASICCONFIGURE <>", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureGreaterThan(String value) {
            addCriterion("BASICCONFIGURE >", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureGreaterThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGURE >=", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureLessThan(String value) {
            addCriterion("BASICCONFIGURE <", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureLessThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGURE <=", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureLike(String value) {
            addCriterion("BASICCONFIGURE like", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureNotLike(String value) {
            addCriterion("BASICCONFIGURE not like", value, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureIn(List<String> values) {
            addCriterion("BASICCONFIGURE in", values, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureNotIn(List<String> values) {
            addCriterion("BASICCONFIGURE not in", values, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureBetween(String value1, String value2) {
            addCriterion("BASICCONFIGURE between", value1, value2, "basicconfigure");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureNotBetween(String value1, String value2) {
            addCriterion("BASICCONFIGURE not between", value1, value2, "basicconfigure");
            return (Criteria) this;
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("DEPARTMENTID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("DEPARTMENTID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("DEPARTMENTID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("DEPARTMENTID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("DEPARTMENTID like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("DEPARTMENTID not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("DEPARTMENTID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("DEPARTMENTID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "departmentid");
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