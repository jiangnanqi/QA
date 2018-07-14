package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblEquipmentBasicconfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblEquipmentBasicconfigureExample() {
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

        public Criteria andEquipmentbasicconfigureidIsNull() {
            addCriterion("EQUIPMENTBASICCONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidIsNotNull() {
            addCriterion("EQUIPMENTBASICCONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID =", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidNotEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID <>", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidGreaterThan(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID >", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID >=", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidLessThan(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID <", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID <=", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidLike(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID like", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidNotLike(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID not like", value, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidIn(List<String> values) {
            addCriterion("EQUIPMENTBASICCONFIGUREID in", values, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidNotIn(List<String> values) {
            addCriterion("EQUIPMENTBASICCONFIGUREID not in", values, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidBetween(String value1, String value2) {
            addCriterion("EQUIPMENTBASICCONFIGUREID between", value1, value2, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentbasicconfigureidNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTBASICCONFIGUREID not between", value1, value2, "equipmentbasicconfigureid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNull() {
            addCriterion("EQUIPMENTID is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNotNull() {
            addCriterion("EQUIPMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidEqualTo(String value) {
            addCriterion("EQUIPMENTID =", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotEqualTo(String value) {
            addCriterion("EQUIPMENTID <>", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThan(String value) {
            addCriterion("EQUIPMENTID >", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTID >=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThan(String value) {
            addCriterion("EQUIPMENTID <", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTID <=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLike(String value) {
            addCriterion("EQUIPMENTID like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotLike(String value) {
            addCriterion("EQUIPMENTID not like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIn(List<String> values) {
            addCriterion("EQUIPMENTID in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotIn(List<String> values) {
            addCriterion("EQUIPMENTID not in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidBetween(String value1, String value2) {
            addCriterion("EQUIPMENTID between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTID not between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidIsNull() {
            addCriterion("BASICCONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidIsNotNull() {
            addCriterion("BASICCONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidEqualTo(String value) {
            addCriterion("BASICCONFIGUREID =", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidNotEqualTo(String value) {
            addCriterion("BASICCONFIGUREID <>", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidGreaterThan(String value) {
            addCriterion("BASICCONFIGUREID >", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidGreaterThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGUREID >=", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidLessThan(String value) {
            addCriterion("BASICCONFIGUREID <", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidLessThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGUREID <=", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidLike(String value) {
            addCriterion("BASICCONFIGUREID like", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidNotLike(String value) {
            addCriterion("BASICCONFIGUREID not like", value, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidIn(List<String> values) {
            addCriterion("BASICCONFIGUREID in", values, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidNotIn(List<String> values) {
            addCriterion("BASICCONFIGUREID not in", values, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidBetween(String value1, String value2) {
            addCriterion("BASICCONFIGUREID between", value1, value2, "basicconfigureid");
            return (Criteria) this;
        }

        public Criteria andBasicconfigureidNotBetween(String value1, String value2) {
            addCriterion("BASICCONFIGUREID not between", value1, value2, "basicconfigureid");
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