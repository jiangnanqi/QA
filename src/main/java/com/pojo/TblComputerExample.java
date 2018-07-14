package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblComputerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblComputerExample() {
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

        public Criteria andGraphiccardIsNull() {
            addCriterion("GRAPHICCARD is null");
            return (Criteria) this;
        }

        public Criteria andGraphiccardIsNotNull() {
            addCriterion("GRAPHICCARD is not null");
            return (Criteria) this;
        }

        public Criteria andGraphiccardEqualTo(String value) {
            addCriterion("GRAPHICCARD =", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotEqualTo(String value) {
            addCriterion("GRAPHICCARD <>", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardGreaterThan(String value) {
            addCriterion("GRAPHICCARD >", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardGreaterThanOrEqualTo(String value) {
            addCriterion("GRAPHICCARD >=", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardLessThan(String value) {
            addCriterion("GRAPHICCARD <", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardLessThanOrEqualTo(String value) {
            addCriterion("GRAPHICCARD <=", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardLike(String value) {
            addCriterion("GRAPHICCARD like", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotLike(String value) {
            addCriterion("GRAPHICCARD not like", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardIn(List<String> values) {
            addCriterion("GRAPHICCARD in", values, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotIn(List<String> values) {
            addCriterion("GRAPHICCARD not in", values, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardBetween(String value1, String value2) {
            addCriterion("GRAPHICCARD between", value1, value2, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotBetween(String value1, String value2) {
            addCriterion("GRAPHICCARD not between", value1, value2, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andAudiocardIsNull() {
            addCriterion("AUDIOCARD is null");
            return (Criteria) this;
        }

        public Criteria andAudiocardIsNotNull() {
            addCriterion("AUDIOCARD is not null");
            return (Criteria) this;
        }

        public Criteria andAudiocardEqualTo(String value) {
            addCriterion("AUDIOCARD =", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotEqualTo(String value) {
            addCriterion("AUDIOCARD <>", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardGreaterThan(String value) {
            addCriterion("AUDIOCARD >", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIOCARD >=", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardLessThan(String value) {
            addCriterion("AUDIOCARD <", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardLessThanOrEqualTo(String value) {
            addCriterion("AUDIOCARD <=", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardLike(String value) {
            addCriterion("AUDIOCARD like", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotLike(String value) {
            addCriterion("AUDIOCARD not like", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardIn(List<String> values) {
            addCriterion("AUDIOCARD in", values, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotIn(List<String> values) {
            addCriterion("AUDIOCARD not in", values, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardBetween(String value1, String value2) {
            addCriterion("AUDIOCARD between", value1, value2, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotBetween(String value1, String value2) {
            addCriterion("AUDIOCARD not between", value1, value2, "audiocard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardIsNull() {
            addCriterion("NETWORKCARD is null");
            return (Criteria) this;
        }

        public Criteria andNetworkcardIsNotNull() {
            addCriterion("NETWORKCARD is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkcardEqualTo(String value) {
            addCriterion("NETWORKCARD =", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotEqualTo(String value) {
            addCriterion("NETWORKCARD <>", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardGreaterThan(String value) {
            addCriterion("NETWORKCARD >", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORKCARD >=", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardLessThan(String value) {
            addCriterion("NETWORKCARD <", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardLessThanOrEqualTo(String value) {
            addCriterion("NETWORKCARD <=", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardLike(String value) {
            addCriterion("NETWORKCARD like", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotLike(String value) {
            addCriterion("NETWORKCARD not like", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardIn(List<String> values) {
            addCriterion("NETWORKCARD in", values, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotIn(List<String> values) {
            addCriterion("NETWORKCARD not in", values, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardBetween(String value1, String value2) {
            addCriterion("NETWORKCARD between", value1, value2, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotBetween(String value1, String value2) {
            addCriterion("NETWORKCARD not between", value1, value2, "networkcard");
            return (Criteria) this;
        }

        public Criteria andMotherboardIsNull() {
            addCriterion("MOTHERBOARD is null");
            return (Criteria) this;
        }

        public Criteria andMotherboardIsNotNull() {
            addCriterion("MOTHERBOARD is not null");
            return (Criteria) this;
        }

        public Criteria andMotherboardEqualTo(String value) {
            addCriterion("MOTHERBOARD =", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotEqualTo(String value) {
            addCriterion("MOTHERBOARD <>", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardGreaterThan(String value) {
            addCriterion("MOTHERBOARD >", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardGreaterThanOrEqualTo(String value) {
            addCriterion("MOTHERBOARD >=", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardLessThan(String value) {
            addCriterion("MOTHERBOARD <", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardLessThanOrEqualTo(String value) {
            addCriterion("MOTHERBOARD <=", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardLike(String value) {
            addCriterion("MOTHERBOARD like", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotLike(String value) {
            addCriterion("MOTHERBOARD not like", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardIn(List<String> values) {
            addCriterion("MOTHERBOARD in", values, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotIn(List<String> values) {
            addCriterion("MOTHERBOARD not in", values, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardBetween(String value1, String value2) {
            addCriterion("MOTHERBOARD between", value1, value2, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotBetween(String value1, String value2) {
            addCriterion("MOTHERBOARD not between", value1, value2, "motherboard");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNull() {
            addCriterion("OSNAME is null");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNotNull() {
            addCriterion("OSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOsnameEqualTo(String value) {
            addCriterion("OSNAME =", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotEqualTo(String value) {
            addCriterion("OSNAME <>", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThan(String value) {
            addCriterion("OSNAME >", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThanOrEqualTo(String value) {
            addCriterion("OSNAME >=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThan(String value) {
            addCriterion("OSNAME <", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThanOrEqualTo(String value) {
            addCriterion("OSNAME <=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLike(String value) {
            addCriterion("OSNAME like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotLike(String value) {
            addCriterion("OSNAME not like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameIn(List<String> values) {
            addCriterion("OSNAME in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotIn(List<String> values) {
            addCriterion("OSNAME not in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameBetween(String value1, String value2) {
            addCriterion("OSNAME between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotBetween(String value1, String value2) {
            addCriterion("OSNAME not between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andOsidIsNull() {
            addCriterion("OSID is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("OSID is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(String value) {
            addCriterion("OSID =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(String value) {
            addCriterion("OSID <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(String value) {
            addCriterion("OSID >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(String value) {
            addCriterion("OSID >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(String value) {
            addCriterion("OSID <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(String value) {
            addCriterion("OSID <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLike(String value) {
            addCriterion("OSID like", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotLike(String value) {
            addCriterion("OSID not like", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<String> values) {
            addCriterion("OSID in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<String> values) {
            addCriterion("OSID not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(String value1, String value2) {
            addCriterion("OSID between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(String value1, String value2) {
            addCriterion("OSID not between", value1, value2, "osid");
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