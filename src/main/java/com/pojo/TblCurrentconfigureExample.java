package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblCurrentconfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCurrentconfigureExample() {
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

        public Criteria andCurrentconfigureidIsNull() {
            addCriterion("CURRENTCONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidIsNotNull() {
            addCriterion("CURRENTCONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID =", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidNotEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID <>", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidGreaterThan(String value) {
            addCriterion("CURRENTCONFIGUREID >", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID >=", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidLessThan(String value) {
            addCriterion("CURRENTCONFIGUREID <", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidLessThanOrEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID <=", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidLike(String value) {
            addCriterion("CURRENTCONFIGUREID like", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidNotLike(String value) {
            addCriterion("CURRENTCONFIGUREID not like", value, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidIn(List<String> values) {
            addCriterion("CURRENTCONFIGUREID in", values, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidNotIn(List<String> values) {
            addCriterion("CURRENTCONFIGUREID not in", values, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidBetween(String value1, String value2) {
            addCriterion("CURRENTCONFIGUREID between", value1, value2, "currentconfigureid");
            return (Criteria) this;
        }

        public Criteria andCurrentconfigureidNotBetween(String value1, String value2) {
            addCriterion("CURRENTCONFIGUREID not between", value1, value2, "currentconfigureid");
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

        public Criteria andConfigureversionIsNull() {
            addCriterion("CONFIGUREVERSION is null");
            return (Criteria) this;
        }

        public Criteria andConfigureversionIsNotNull() {
            addCriterion("CONFIGUREVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureversionEqualTo(String value) {
            addCriterion("CONFIGUREVERSION =", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionNotEqualTo(String value) {
            addCriterion("CONFIGUREVERSION <>", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionGreaterThan(String value) {
            addCriterion("CONFIGUREVERSION >", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREVERSION >=", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionLessThan(String value) {
            addCriterion("CONFIGUREVERSION <", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREVERSION <=", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionLike(String value) {
            addCriterion("CONFIGUREVERSION like", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionNotLike(String value) {
            addCriterion("CONFIGUREVERSION not like", value, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionIn(List<String> values) {
            addCriterion("CONFIGUREVERSION in", values, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionNotIn(List<String> values) {
            addCriterion("CONFIGUREVERSION not in", values, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionBetween(String value1, String value2) {
            addCriterion("CONFIGUREVERSION between", value1, value2, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigureversionNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREVERSION not between", value1, value2, "configureversion");
            return (Criteria) this;
        }

        public Criteria andConfigurenameIsNull() {
            addCriterion("CONFIGURENAME is null");
            return (Criteria) this;
        }

        public Criteria andConfigurenameIsNotNull() {
            addCriterion("CONFIGURENAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfigurenameEqualTo(String value) {
            addCriterion("CONFIGURENAME =", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotEqualTo(String value) {
            addCriterion("CONFIGURENAME <>", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameGreaterThan(String value) {
            addCriterion("CONFIGURENAME >", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURENAME >=", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameLessThan(String value) {
            addCriterion("CONFIGURENAME <", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameLessThanOrEqualTo(String value) {
            addCriterion("CONFIGURENAME <=", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameLike(String value) {
            addCriterion("CONFIGURENAME like", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotLike(String value) {
            addCriterion("CONFIGURENAME not like", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameIn(List<String> values) {
            addCriterion("CONFIGURENAME in", values, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotIn(List<String> values) {
            addCriterion("CONFIGURENAME not in", values, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameBetween(String value1, String value2) {
            addCriterion("CONFIGURENAME between", value1, value2, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotBetween(String value1, String value2) {
            addCriterion("CONFIGURENAME not between", value1, value2, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeIsNull() {
            addCriterion("CONFIGURETYPE is null");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeIsNotNull() {
            addCriterion("CONFIGURETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeEqualTo(String value) {
            addCriterion("CONFIGURETYPE =", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotEqualTo(String value) {
            addCriterion("CONFIGURETYPE <>", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeGreaterThan(String value) {
            addCriterion("CONFIGURETYPE >", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURETYPE >=", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeLessThan(String value) {
            addCriterion("CONFIGURETYPE <", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeLessThanOrEqualTo(String value) {
            addCriterion("CONFIGURETYPE <=", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeLike(String value) {
            addCriterion("CONFIGURETYPE like", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotLike(String value) {
            addCriterion("CONFIGURETYPE not like", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeIn(List<String> values) {
            addCriterion("CONFIGURETYPE in", values, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotIn(List<String> values) {
            addCriterion("CONFIGURETYPE not in", values, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeBetween(String value1, String value2) {
            addCriterion("CONFIGURETYPE between", value1, value2, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotBetween(String value1, String value2) {
            addCriterion("CONFIGURETYPE not between", value1, value2, "configuretype");
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