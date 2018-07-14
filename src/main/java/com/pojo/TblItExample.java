package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblItExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblItExample() {
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

        public Criteria andGoodworkIsNull() {
            addCriterion("GOODWORK is null");
            return (Criteria) this;
        }

        public Criteria andGoodworkIsNotNull() {
            addCriterion("GOODWORK is not null");
            return (Criteria) this;
        }

        public Criteria andGoodworkEqualTo(String value) {
            addCriterion("GOODWORK =", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkNotEqualTo(String value) {
            addCriterion("GOODWORK <>", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkGreaterThan(String value) {
            addCriterion("GOODWORK >", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkGreaterThanOrEqualTo(String value) {
            addCriterion("GOODWORK >=", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkLessThan(String value) {
            addCriterion("GOODWORK <", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkLessThanOrEqualTo(String value) {
            addCriterion("GOODWORK <=", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkLike(String value) {
            addCriterion("GOODWORK like", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkNotLike(String value) {
            addCriterion("GOODWORK not like", value, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkIn(List<String> values) {
            addCriterion("GOODWORK in", values, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkNotIn(List<String> values) {
            addCriterion("GOODWORK not in", values, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkBetween(String value1, String value2) {
            addCriterion("GOODWORK between", value1, value2, "goodwork");
            return (Criteria) this;
        }

        public Criteria andGoodworkNotBetween(String value1, String value2) {
            addCriterion("GOODWORK not between", value1, value2, "goodwork");
            return (Criteria) this;
        }

        public Criteria andWorkageIsNull() {
            addCriterion("WORKAGE is null");
            return (Criteria) this;
        }

        public Criteria andWorkageIsNotNull() {
            addCriterion("WORKAGE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkageEqualTo(String value) {
            addCriterion("WORKAGE =", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotEqualTo(String value) {
            addCriterion("WORKAGE <>", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageGreaterThan(String value) {
            addCriterion("WORKAGE >", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageGreaterThanOrEqualTo(String value) {
            addCriterion("WORKAGE >=", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageLessThan(String value) {
            addCriterion("WORKAGE <", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageLessThanOrEqualTo(String value) {
            addCriterion("WORKAGE <=", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageLike(String value) {
            addCriterion("WORKAGE like", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotLike(String value) {
            addCriterion("WORKAGE not like", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageIn(List<String> values) {
            addCriterion("WORKAGE in", values, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotIn(List<String> values) {
            addCriterion("WORKAGE not in", values, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageBetween(String value1, String value2) {
            addCriterion("WORKAGE between", value1, value2, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotBetween(String value1, String value2) {
            addCriterion("WORKAGE not between", value1, value2, "workage");
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