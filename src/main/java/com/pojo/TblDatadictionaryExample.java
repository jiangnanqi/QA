package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblDatadictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblDatadictionaryExample() {
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

        public Criteria andDatadictionaryidIsNull() {
            addCriterion("DATADICTIONARYID is null");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidIsNotNull() {
            addCriterion("DATADICTIONARYID is not null");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidEqualTo(String value) {
            addCriterion("DATADICTIONARYID =", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidNotEqualTo(String value) {
            addCriterion("DATADICTIONARYID <>", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidGreaterThan(String value) {
            addCriterion("DATADICTIONARYID >", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidGreaterThanOrEqualTo(String value) {
            addCriterion("DATADICTIONARYID >=", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidLessThan(String value) {
            addCriterion("DATADICTIONARYID <", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidLessThanOrEqualTo(String value) {
            addCriterion("DATADICTIONARYID <=", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidLike(String value) {
            addCriterion("DATADICTIONARYID like", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidNotLike(String value) {
            addCriterion("DATADICTIONARYID not like", value, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidIn(List<String> values) {
            addCriterion("DATADICTIONARYID in", values, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidNotIn(List<String> values) {
            addCriterion("DATADICTIONARYID not in", values, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidBetween(String value1, String value2) {
            addCriterion("DATADICTIONARYID between", value1, value2, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatadictionaryidNotBetween(String value1, String value2) {
            addCriterion("DATADICTIONARYID not between", value1, value2, "datadictionaryid");
            return (Criteria) this;
        }

        public Criteria andDatanameIsNull() {
            addCriterion("DATANAME is null");
            return (Criteria) this;
        }

        public Criteria andDatanameIsNotNull() {
            addCriterion("DATANAME is not null");
            return (Criteria) this;
        }

        public Criteria andDatanameEqualTo(String value) {
            addCriterion("DATANAME =", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotEqualTo(String value) {
            addCriterion("DATANAME <>", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameGreaterThan(String value) {
            addCriterion("DATANAME >", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameGreaterThanOrEqualTo(String value) {
            addCriterion("DATANAME >=", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameLessThan(String value) {
            addCriterion("DATANAME <", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameLessThanOrEqualTo(String value) {
            addCriterion("DATANAME <=", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameLike(String value) {
            addCriterion("DATANAME like", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotLike(String value) {
            addCriterion("DATANAME not like", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameIn(List<String> values) {
            addCriterion("DATANAME in", values, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotIn(List<String> values) {
            addCriterion("DATANAME not in", values, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameBetween(String value1, String value2) {
            addCriterion("DATANAME between", value1, value2, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotBetween(String value1, String value2) {
            addCriterion("DATANAME not between", value1, value2, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatavalueIsNull() {
            addCriterion("DATAVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDatavalueIsNotNull() {
            addCriterion("DATAVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDatavalueEqualTo(String value) {
            addCriterion("DATAVALUE =", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotEqualTo(String value) {
            addCriterion("DATAVALUE <>", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueGreaterThan(String value) {
            addCriterion("DATAVALUE >", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueGreaterThanOrEqualTo(String value) {
            addCriterion("DATAVALUE >=", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueLessThan(String value) {
            addCriterion("DATAVALUE <", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueLessThanOrEqualTo(String value) {
            addCriterion("DATAVALUE <=", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueLike(String value) {
            addCriterion("DATAVALUE like", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotLike(String value) {
            addCriterion("DATAVALUE not like", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueIn(List<String> values) {
            addCriterion("DATAVALUE in", values, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotIn(List<String> values) {
            addCriterion("DATAVALUE not in", values, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueBetween(String value1, String value2) {
            addCriterion("DATAVALUE between", value1, value2, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotBetween(String value1, String value2) {
            addCriterion("DATAVALUE not between", value1, value2, "datavalue");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("DATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("DATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(Integer value) {
            addCriterion("DATATYPE =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(Integer value) {
            addCriterion("DATATYPE <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(Integer value) {
            addCriterion("DATATYPE >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATATYPE >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(Integer value) {
            addCriterion("DATATYPE <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(Integer value) {
            addCriterion("DATATYPE <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<Integer> values) {
            addCriterion("DATATYPE in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<Integer> values) {
            addCriterion("DATATYPE not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(Integer value1, Integer value2) {
            addCriterion("DATATYPE between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DATATYPE not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatarangeIsNull() {
            addCriterion("DATARANGE is null");
            return (Criteria) this;
        }

        public Criteria andDatarangeIsNotNull() {
            addCriterion("DATARANGE is not null");
            return (Criteria) this;
        }

        public Criteria andDatarangeEqualTo(String value) {
            addCriterion("DATARANGE =", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeNotEqualTo(String value) {
            addCriterion("DATARANGE <>", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeGreaterThan(String value) {
            addCriterion("DATARANGE >", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeGreaterThanOrEqualTo(String value) {
            addCriterion("DATARANGE >=", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeLessThan(String value) {
            addCriterion("DATARANGE <", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeLessThanOrEqualTo(String value) {
            addCriterion("DATARANGE <=", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeLike(String value) {
            addCriterion("DATARANGE like", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeNotLike(String value) {
            addCriterion("DATARANGE not like", value, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeIn(List<String> values) {
            addCriterion("DATARANGE in", values, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeNotIn(List<String> values) {
            addCriterion("DATARANGE not in", values, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeBetween(String value1, String value2) {
            addCriterion("DATARANGE between", value1, value2, "datarange");
            return (Criteria) this;
        }

        public Criteria andDatarangeNotBetween(String value1, String value2) {
            addCriterion("DATARANGE not between", value1, value2, "datarange");
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