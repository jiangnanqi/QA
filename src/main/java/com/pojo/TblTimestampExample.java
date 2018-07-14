package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblTimestampExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTimestampExample() {
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

        public Criteria andTimeidIsNull() {
            addCriterion("TIMEID is null");
            return (Criteria) this;
        }

        public Criteria andTimeidIsNotNull() {
            addCriterion("TIMEID is not null");
            return (Criteria) this;
        }

        public Criteria andTimeidEqualTo(String value) {
            addCriterion("TIMEID =", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotEqualTo(String value) {
            addCriterion("TIMEID <>", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidGreaterThan(String value) {
            addCriterion("TIMEID >", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEID >=", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLessThan(String value) {
            addCriterion("TIMEID <", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLessThanOrEqualTo(String value) {
            addCriterion("TIMEID <=", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLike(String value) {
            addCriterion("TIMEID like", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotLike(String value) {
            addCriterion("TIMEID not like", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidIn(List<String> values) {
            addCriterion("TIMEID in", values, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotIn(List<String> values) {
            addCriterion("TIMEID not in", values, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidBetween(String value1, String value2) {
            addCriterion("TIMEID between", value1, value2, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotBetween(String value1, String value2) {
            addCriterion("TIMEID not between", value1, value2, "timeid");
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

        public Criteria andBegintimeIsNull() {
            addCriterion("BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(String value) {
            addCriterion("BEGINTIME =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(String value) {
            addCriterion("BEGINTIME <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(String value) {
            addCriterion("BEGINTIME >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("BEGINTIME >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(String value) {
            addCriterion("BEGINTIME <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(String value) {
            addCriterion("BEGINTIME <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLike(String value) {
            addCriterion("BEGINTIME like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotLike(String value) {
            addCriterion("BEGINTIME not like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<String> values) {
            addCriterion("BEGINTIME in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<String> values) {
            addCriterion("BEGINTIME not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(String value1, String value2) {
            addCriterion("BEGINTIME between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(String value1, String value2) {
            addCriterion("BEGINTIME not between", value1, value2, "begintime");
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