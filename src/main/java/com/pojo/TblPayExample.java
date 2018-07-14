package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPayExample() {
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

        public Criteria andPayidIsNull() {
            addCriterion("PAYID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(String value) {
            addCriterion("PAYID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(String value) {
            addCriterion("PAYID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(String value) {
            addCriterion("PAYID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(String value) {
            addCriterion("PAYID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(String value) {
            addCriterion("PAYID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(String value) {
            addCriterion("PAYID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLike(String value) {
            addCriterion("PAYID like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotLike(String value) {
            addCriterion("PAYID not like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<String> values) {
            addCriterion("PAYID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<String> values) {
            addCriterion("PAYID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(String value1, String value2) {
            addCriterion("PAYID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(String value1, String value2) {
            addCriterion("PAYID not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayuseridIsNull() {
            addCriterion("PAYUSERID is null");
            return (Criteria) this;
        }

        public Criteria andPayuseridIsNotNull() {
            addCriterion("PAYUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andPayuseridEqualTo(String value) {
            addCriterion("PAYUSERID =", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotEqualTo(String value) {
            addCriterion("PAYUSERID <>", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridGreaterThan(String value) {
            addCriterion("PAYUSERID >", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridGreaterThanOrEqualTo(String value) {
            addCriterion("PAYUSERID >=", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridLessThan(String value) {
            addCriterion("PAYUSERID <", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridLessThanOrEqualTo(String value) {
            addCriterion("PAYUSERID <=", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridLike(String value) {
            addCriterion("PAYUSERID like", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotLike(String value) {
            addCriterion("PAYUSERID not like", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridIn(List<String> values) {
            addCriterion("PAYUSERID in", values, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotIn(List<String> values) {
            addCriterion("PAYUSERID not in", values, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridBetween(String value1, String value2) {
            addCriterion("PAYUSERID between", value1, value2, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotBetween(String value1, String value2) {
            addCriterion("PAYUSERID not between", value1, value2, "payuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridIsNull() {
            addCriterion("BEPAYUSERID is null");
            return (Criteria) this;
        }

        public Criteria andBepayuseridIsNotNull() {
            addCriterion("BEPAYUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andBepayuseridEqualTo(String value) {
            addCriterion("BEPAYUSERID =", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridNotEqualTo(String value) {
            addCriterion("BEPAYUSERID <>", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridGreaterThan(String value) {
            addCriterion("BEPAYUSERID >", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridGreaterThanOrEqualTo(String value) {
            addCriterion("BEPAYUSERID >=", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridLessThan(String value) {
            addCriterion("BEPAYUSERID <", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridLessThanOrEqualTo(String value) {
            addCriterion("BEPAYUSERID <=", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridLike(String value) {
            addCriterion("BEPAYUSERID like", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridNotLike(String value) {
            addCriterion("BEPAYUSERID not like", value, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridIn(List<String> values) {
            addCriterion("BEPAYUSERID in", values, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridNotIn(List<String> values) {
            addCriterion("BEPAYUSERID not in", values, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridBetween(String value1, String value2) {
            addCriterion("BEPAYUSERID between", value1, value2, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andBepayuseridNotBetween(String value1, String value2) {
            addCriterion("BEPAYUSERID not between", value1, value2, "bepayuserid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("TIME like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("TIME not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("TIME not between", value1, value2, "time");
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