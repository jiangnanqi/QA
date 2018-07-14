package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblMessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("MESSAGEID is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("MESSAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(String value) {
            addCriterion("MESSAGEID =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(String value) {
            addCriterion("MESSAGEID <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(String value) {
            addCriterion("MESSAGEID >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGEID >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(String value) {
            addCriterion("MESSAGEID <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(String value) {
            addCriterion("MESSAGEID <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLike(String value) {
            addCriterion("MESSAGEID like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotLike(String value) {
            addCriterion("MESSAGEID not like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<String> values) {
            addCriterion("MESSAGEID in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<String> values) {
            addCriterion("MESSAGEID not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(String value1, String value2) {
            addCriterion("MESSAGEID between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(String value1, String value2) {
            addCriterion("MESSAGEID not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNull() {
            addCriterion("MESSAGECONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNotNull() {
            addCriterion("MESSAGECONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentEqualTo(String value) {
            addCriterion("MESSAGECONTENT =", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotEqualTo(String value) {
            addCriterion("MESSAGECONTENT <>", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThan(String value) {
            addCriterion("MESSAGECONTENT >", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGECONTENT >=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThan(String value) {
            addCriterion("MESSAGECONTENT <", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThanOrEqualTo(String value) {
            addCriterion("MESSAGECONTENT <=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLike(String value) {
            addCriterion("MESSAGECONTENT like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotLike(String value) {
            addCriterion("MESSAGECONTENT not like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIn(List<String> values) {
            addCriterion("MESSAGECONTENT in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotIn(List<String> values) {
            addCriterion("MESSAGECONTENT not in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentBetween(String value1, String value2) {
            addCriterion("MESSAGECONTENT between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotBetween(String value1, String value2) {
            addCriterion("MESSAGECONTENT not between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNull() {
            addCriterion("MESSAGETIME is null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNotNull() {
            addCriterion("MESSAGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeEqualTo(String value) {
            addCriterion("MESSAGETIME =", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotEqualTo(String value) {
            addCriterion("MESSAGETIME <>", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThan(String value) {
            addCriterion("MESSAGETIME >", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGETIME >=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThan(String value) {
            addCriterion("MESSAGETIME <", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThanOrEqualTo(String value) {
            addCriterion("MESSAGETIME <=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLike(String value) {
            addCriterion("MESSAGETIME like", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotLike(String value) {
            addCriterion("MESSAGETIME not like", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIn(List<String> values) {
            addCriterion("MESSAGETIME in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotIn(List<String> values) {
            addCriterion("MESSAGETIME not in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeBetween(String value1, String value2) {
            addCriterion("MESSAGETIME between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotBetween(String value1, String value2) {
            addCriterion("MESSAGETIME not between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagestateIsNull() {
            addCriterion("MESSAGESTATE is null");
            return (Criteria) this;
        }

        public Criteria andMessagestateIsNotNull() {
            addCriterion("MESSAGESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMessagestateEqualTo(Integer value) {
            addCriterion("MESSAGESTATE =", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotEqualTo(Integer value) {
            addCriterion("MESSAGESTATE <>", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateGreaterThan(Integer value) {
            addCriterion("MESSAGESTATE >", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MESSAGESTATE >=", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLessThan(Integer value) {
            addCriterion("MESSAGESTATE <", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateLessThanOrEqualTo(Integer value) {
            addCriterion("MESSAGESTATE <=", value, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateIn(List<Integer> values) {
            addCriterion("MESSAGESTATE in", values, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotIn(List<Integer> values) {
            addCriterion("MESSAGESTATE not in", values, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGESTATE between", value1, value2, "messagestate");
            return (Criteria) this;
        }

        public Criteria andMessagestateNotBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGESTATE not between", value1, value2, "messagestate");
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