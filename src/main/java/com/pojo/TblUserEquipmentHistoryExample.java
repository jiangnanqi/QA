package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblUserEquipmentHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserEquipmentHistoryExample() {
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

        public Criteria andUserequipmenthistoryidIsNull() {
            addCriterion("USEREQUIPMENTHISTORYID is null");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidIsNotNull() {
            addCriterion("USEREQUIPMENTHISTORYID is not null");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID =", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidNotEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID <>", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidGreaterThan(String value) {
            addCriterion("USEREQUIPMENTHISTORYID >", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidGreaterThanOrEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID >=", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidLessThan(String value) {
            addCriterion("USEREQUIPMENTHISTORYID <", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidLessThanOrEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID <=", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidLike(String value) {
            addCriterion("USEREQUIPMENTHISTORYID like", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidNotLike(String value) {
            addCriterion("USEREQUIPMENTHISTORYID not like", value, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidIn(List<String> values) {
            addCriterion("USEREQUIPMENTHISTORYID in", values, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidNotIn(List<String> values) {
            addCriterion("USEREQUIPMENTHISTORYID not in", values, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidBetween(String value1, String value2) {
            addCriterion("USEREQUIPMENTHISTORYID between", value1, value2, "userequipmenthistoryid");
            return (Criteria) this;
        }

        public Criteria andUserequipmenthistoryidNotBetween(String value1, String value2) {
            addCriterion("USEREQUIPMENTHISTORYID not between", value1, value2, "userequipmenthistoryid");
            return (Criteria) this;
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

        public Criteria andAllocationstarttimeIsNull() {
            addCriterion("ALLOCATIONSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeIsNotNull() {
            addCriterion("ALLOCATIONSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME =", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeNotEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME <>", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeGreaterThan(String value) {
            addCriterion("ALLOCATIONSTARTTIME >", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME >=", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeLessThan(String value) {
            addCriterion("ALLOCATIONSTARTTIME <", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeLessThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME <=", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeLike(String value) {
            addCriterion("ALLOCATIONSTARTTIME like", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeNotLike(String value) {
            addCriterion("ALLOCATIONSTARTTIME not like", value, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeIn(List<String> values) {
            addCriterion("ALLOCATIONSTARTTIME in", values, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeNotIn(List<String> values) {
            addCriterion("ALLOCATIONSTARTTIME not in", values, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeBetween(String value1, String value2) {
            addCriterion("ALLOCATIONSTARTTIME between", value1, value2, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationstarttimeNotBetween(String value1, String value2) {
            addCriterion("ALLOCATIONSTARTTIME not between", value1, value2, "allocationstarttime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeIsNull() {
            addCriterion("ALLOCATIONENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeIsNotNull() {
            addCriterion("ALLOCATIONENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME =", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeNotEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME <>", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeGreaterThan(String value) {
            addCriterion("ALLOCATIONENDTIME >", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME >=", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeLessThan(String value) {
            addCriterion("ALLOCATIONENDTIME <", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeLessThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME <=", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeLike(String value) {
            addCriterion("ALLOCATIONENDTIME like", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeNotLike(String value) {
            addCriterion("ALLOCATIONENDTIME not like", value, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeIn(List<String> values) {
            addCriterion("ALLOCATIONENDTIME in", values, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeNotIn(List<String> values) {
            addCriterion("ALLOCATIONENDTIME not in", values, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeBetween(String value1, String value2) {
            addCriterion("ALLOCATIONENDTIME between", value1, value2, "allocationendtime");
            return (Criteria) this;
        }

        public Criteria andAllocationendtimeNotBetween(String value1, String value2) {
            addCriterion("ALLOCATIONENDTIME not between", value1, value2, "allocationendtime");
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