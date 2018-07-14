package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblDriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblDriverExample() {
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

        public Criteria andOsIsNull() {
            addCriterion("OS is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("OS is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("OS =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("OS <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("OS >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("OS >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("OS <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("OS <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("OS like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("OS not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("OS in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("OS not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("OS between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("OS not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andDrivertypeIsNull() {
            addCriterion("DRIVERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDrivertypeIsNotNull() {
            addCriterion("DRIVERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDrivertypeEqualTo(String value) {
            addCriterion("DRIVERTYPE =", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotEqualTo(String value) {
            addCriterion("DRIVERTYPE <>", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeGreaterThan(String value) {
            addCriterion("DRIVERTYPE >", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVERTYPE >=", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeLessThan(String value) {
            addCriterion("DRIVERTYPE <", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeLessThanOrEqualTo(String value) {
            addCriterion("DRIVERTYPE <=", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeLike(String value) {
            addCriterion("DRIVERTYPE like", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotLike(String value) {
            addCriterion("DRIVERTYPE not like", value, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeIn(List<String> values) {
            addCriterion("DRIVERTYPE in", values, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotIn(List<String> values) {
            addCriterion("DRIVERTYPE not in", values, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeBetween(String value1, String value2) {
            addCriterion("DRIVERTYPE between", value1, value2, "drivertype");
            return (Criteria) this;
        }

        public Criteria andDrivertypeNotBetween(String value1, String value2) {
            addCriterion("DRIVERTYPE not between", value1, value2, "drivertype");
            return (Criteria) this;
        }

        public Criteria andFitnessIsNull() {
            addCriterion("FITNESS is null");
            return (Criteria) this;
        }

        public Criteria andFitnessIsNotNull() {
            addCriterion("FITNESS is not null");
            return (Criteria) this;
        }

        public Criteria andFitnessEqualTo(String value) {
            addCriterion("FITNESS =", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessNotEqualTo(String value) {
            addCriterion("FITNESS <>", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessGreaterThan(String value) {
            addCriterion("FITNESS >", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessGreaterThanOrEqualTo(String value) {
            addCriterion("FITNESS >=", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessLessThan(String value) {
            addCriterion("FITNESS <", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessLessThanOrEqualTo(String value) {
            addCriterion("FITNESS <=", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessLike(String value) {
            addCriterion("FITNESS like", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessNotLike(String value) {
            addCriterion("FITNESS not like", value, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessIn(List<String> values) {
            addCriterion("FITNESS in", values, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessNotIn(List<String> values) {
            addCriterion("FITNESS not in", values, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessBetween(String value1, String value2) {
            addCriterion("FITNESS between", value1, value2, "fitness");
            return (Criteria) this;
        }

        public Criteria andFitnessNotBetween(String value1, String value2) {
            addCriterion("FITNESS not between", value1, value2, "fitness");
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