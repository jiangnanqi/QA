package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblMessagehistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblMessagehistoryExample() {
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

        public Criteria andMessagehistoryidIsNull() {
            addCriterion("MESSAGEHISTORYID is null");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidIsNotNull() {
            addCriterion("MESSAGEHISTORYID is not null");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID =", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidNotEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID <>", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidGreaterThan(String value) {
            addCriterion("MESSAGEHISTORYID >", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID >=", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidLessThan(String value) {
            addCriterion("MESSAGEHISTORYID <", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidLessThanOrEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID <=", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidLike(String value) {
            addCriterion("MESSAGEHISTORYID like", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidNotLike(String value) {
            addCriterion("MESSAGEHISTORYID not like", value, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidIn(List<String> values) {
            addCriterion("MESSAGEHISTORYID in", values, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidNotIn(List<String> values) {
            addCriterion("MESSAGEHISTORYID not in", values, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidBetween(String value1, String value2) {
            addCriterion("MESSAGEHISTORYID between", value1, value2, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andMessagehistoryidNotBetween(String value1, String value2) {
            addCriterion("MESSAGEHISTORYID not between", value1, value2, "messagehistoryid");
            return (Criteria) this;
        }

        public Criteria andPostuseridIsNull() {
            addCriterion("POSTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andPostuseridIsNotNull() {
            addCriterion("POSTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andPostuseridEqualTo(String value) {
            addCriterion("POSTUSERID =", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotEqualTo(String value) {
            addCriterion("POSTUSERID <>", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridGreaterThan(String value) {
            addCriterion("POSTUSERID >", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridGreaterThanOrEqualTo(String value) {
            addCriterion("POSTUSERID >=", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridLessThan(String value) {
            addCriterion("POSTUSERID <", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridLessThanOrEqualTo(String value) {
            addCriterion("POSTUSERID <=", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridLike(String value) {
            addCriterion("POSTUSERID like", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotLike(String value) {
            addCriterion("POSTUSERID not like", value, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridIn(List<String> values) {
            addCriterion("POSTUSERID in", values, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotIn(List<String> values) {
            addCriterion("POSTUSERID not in", values, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridBetween(String value1, String value2) {
            addCriterion("POSTUSERID between", value1, value2, "postuserid");
            return (Criteria) this;
        }

        public Criteria andPostuseridNotBetween(String value1, String value2) {
            addCriterion("POSTUSERID not between", value1, value2, "postuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridIsNull() {
            addCriterion("GETUSERID is null");
            return (Criteria) this;
        }

        public Criteria andGetuseridIsNotNull() {
            addCriterion("GETUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andGetuseridEqualTo(String value) {
            addCriterion("GETUSERID =", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridNotEqualTo(String value) {
            addCriterion("GETUSERID <>", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridGreaterThan(String value) {
            addCriterion("GETUSERID >", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridGreaterThanOrEqualTo(String value) {
            addCriterion("GETUSERID >=", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridLessThan(String value) {
            addCriterion("GETUSERID <", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridLessThanOrEqualTo(String value) {
            addCriterion("GETUSERID <=", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridLike(String value) {
            addCriterion("GETUSERID like", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridNotLike(String value) {
            addCriterion("GETUSERID not like", value, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridIn(List<String> values) {
            addCriterion("GETUSERID in", values, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridNotIn(List<String> values) {
            addCriterion("GETUSERID not in", values, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridBetween(String value1, String value2) {
            addCriterion("GETUSERID between", value1, value2, "getuserid");
            return (Criteria) this;
        }

        public Criteria andGetuseridNotBetween(String value1, String value2) {
            addCriterion("GETUSERID not between", value1, value2, "getuserid");
            return (Criteria) this;
        }

        public Criteria andTimemarkIsNull() {
            addCriterion("TIMEMARK is null");
            return (Criteria) this;
        }

        public Criteria andTimemarkIsNotNull() {
            addCriterion("TIMEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTimemarkEqualTo(String value) {
            addCriterion("TIMEMARK =", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkNotEqualTo(String value) {
            addCriterion("TIMEMARK <>", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkGreaterThan(String value) {
            addCriterion("TIMEMARK >", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEMARK >=", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkLessThan(String value) {
            addCriterion("TIMEMARK <", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkLessThanOrEqualTo(String value) {
            addCriterion("TIMEMARK <=", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkLike(String value) {
            addCriterion("TIMEMARK like", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkNotLike(String value) {
            addCriterion("TIMEMARK not like", value, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkIn(List<String> values) {
            addCriterion("TIMEMARK in", values, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkNotIn(List<String> values) {
            addCriterion("TIMEMARK not in", values, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkBetween(String value1, String value2) {
            addCriterion("TIMEMARK between", value1, value2, "timemark");
            return (Criteria) this;
        }

        public Criteria andTimemarkNotBetween(String value1, String value2) {
            addCriterion("TIMEMARK not between", value1, value2, "timemark");
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