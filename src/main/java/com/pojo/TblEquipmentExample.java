package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblEquipmentExample() {
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

        public Criteria andMacaddressIsNull() {
            addCriterion("MACADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNotNull() {
            addCriterion("MACADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMacaddressEqualTo(String value) {
            addCriterion("MACADDRESS =", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotEqualTo(String value) {
            addCriterion("MACADDRESS <>", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThan(String value) {
            addCriterion("MACADDRESS >", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThanOrEqualTo(String value) {
            addCriterion("MACADDRESS >=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThan(String value) {
            addCriterion("MACADDRESS <", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThanOrEqualTo(String value) {
            addCriterion("MACADDRESS <=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLike(String value) {
            addCriterion("MACADDRESS like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotLike(String value) {
            addCriterion("MACADDRESS not like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressIn(List<String> values) {
            addCriterion("MACADDRESS in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotIn(List<String> values) {
            addCriterion("MACADDRESS not in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressBetween(String value1, String value2) {
            addCriterion("MACADDRESS between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotBetween(String value1, String value2) {
            addCriterion("MACADDRESS not between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelIsNull() {
            addCriterion("EQUIPMENTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelIsNotNull() {
            addCriterion("EQUIPMENTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL =", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <>", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelGreaterThan(String value) {
            addCriterion("EQUIPMENTMODEL >", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL >=", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelLessThan(String value) {
            addCriterion("EQUIPMENTMODEL <", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <=", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelLike(String value) {
            addCriterion("EQUIPMENTMODEL like", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotLike(String value) {
            addCriterion("EQUIPMENTMODEL not like", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL in", values, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL not in", values, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL between", value1, value2, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL not between", value1, value2, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNull() {
            addCriterion("BUYTIME is null");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNotNull() {
            addCriterion("BUYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimeEqualTo(String value) {
            addCriterion("BUYTIME =", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotEqualTo(String value) {
            addCriterion("BUYTIME <>", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThan(String value) {
            addCriterion("BUYTIME >", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYTIME >=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThan(String value) {
            addCriterion("BUYTIME <", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThanOrEqualTo(String value) {
            addCriterion("BUYTIME <=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLike(String value) {
            addCriterion("BUYTIME like", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotLike(String value) {
            addCriterion("BUYTIME not like", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeIn(List<String> values) {
            addCriterion("BUYTIME in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotIn(List<String> values) {
            addCriterion("BUYTIME not in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeBetween(String value1, String value2) {
            addCriterion("BUYTIME between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotBetween(String value1, String value2) {
            addCriterion("BUYTIME not between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("CPU is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("CPU is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(String value) {
            addCriterion("CPU =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(String value) {
            addCriterion("CPU <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(String value) {
            addCriterion("CPU >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(String value) {
            addCriterion("CPU >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(String value) {
            addCriterion("CPU <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(String value) {
            addCriterion("CPU <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLike(String value) {
            addCriterion("CPU like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotLike(String value) {
            addCriterion("CPU not like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<String> values) {
            addCriterion("CPU in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<String> values) {
            addCriterion("CPU not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(String value1, String value2) {
            addCriterion("CPU between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(String value1, String value2) {
            addCriterion("CPU not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andRamIsNull() {
            addCriterion("RAM is null");
            return (Criteria) this;
        }

        public Criteria andRamIsNotNull() {
            addCriterion("RAM is not null");
            return (Criteria) this;
        }

        public Criteria andRamEqualTo(String value) {
            addCriterion("RAM =", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotEqualTo(String value) {
            addCriterion("RAM <>", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThan(String value) {
            addCriterion("RAM >", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThanOrEqualTo(String value) {
            addCriterion("RAM >=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThan(String value) {
            addCriterion("RAM <", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThanOrEqualTo(String value) {
            addCriterion("RAM <=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLike(String value) {
            addCriterion("RAM like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotLike(String value) {
            addCriterion("RAM not like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamIn(List<String> values) {
            addCriterion("RAM in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotIn(List<String> values) {
            addCriterion("RAM not in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamBetween(String value1, String value2) {
            addCriterion("RAM between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotBetween(String value1, String value2) {
            addCriterion("RAM not between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("STORAGE is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("STORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("STORAGE =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("STORAGE <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("STORAGE >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("STORAGE <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("STORAGE <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("STORAGE like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("STORAGE not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("STORAGE in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("STORAGE not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("STORAGE between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("STORAGE not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
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