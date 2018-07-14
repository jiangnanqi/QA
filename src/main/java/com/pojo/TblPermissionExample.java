package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPermissionExample() {
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

        public Criteria andPermissionidIsNull() {
            addCriterion("PERMISSIONID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionidIsNotNull() {
            addCriterion("PERMISSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionidEqualTo(String value) {
            addCriterion("PERMISSIONID =", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotEqualTo(String value) {
            addCriterion("PERMISSIONID <>", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidGreaterThan(String value) {
            addCriterion("PERMISSIONID >", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONID >=", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLessThan(String value) {
            addCriterion("PERMISSIONID <", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONID <=", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLike(String value) {
            addCriterion("PERMISSIONID like", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotLike(String value) {
            addCriterion("PERMISSIONID not like", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidIn(List<String> values) {
            addCriterion("PERMISSIONID in", values, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotIn(List<String> values) {
            addCriterion("PERMISSIONID not in", values, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidBetween(String value1, String value2) {
            addCriterion("PERMISSIONID between", value1, value2, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONID not between", value1, value2, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameIsNull() {
            addCriterion("PERMISSIONPHYSICALNAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameIsNotNull() {
            addCriterion("PERMISSIONPHYSICALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME =", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameNotEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME <>", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameGreaterThan(String value) {
            addCriterion("PERMISSIONPHYSICALNAME >", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME >=", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameLessThan(String value) {
            addCriterion("PERMISSIONPHYSICALNAME <", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME <=", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameLike(String value) {
            addCriterion("PERMISSIONPHYSICALNAME like", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameNotLike(String value) {
            addCriterion("PERMISSIONPHYSICALNAME not like", value, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameIn(List<String> values) {
            addCriterion("PERMISSIONPHYSICALNAME in", values, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameNotIn(List<String> values) {
            addCriterion("PERMISSIONPHYSICALNAME not in", values, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameBetween(String value1, String value2) {
            addCriterion("PERMISSIONPHYSICALNAME between", value1, value2, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionphysicalnameNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONPHYSICALNAME not between", value1, value2, "permissionphysicalname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameIsNull() {
            addCriterion("PERMISSIONLOGICNAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameIsNotNull() {
            addCriterion("PERMISSIONLOGICNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME =", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameNotEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME <>", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameGreaterThan(String value) {
            addCriterion("PERMISSIONLOGICNAME >", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME >=", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameLessThan(String value) {
            addCriterion("PERMISSIONLOGICNAME <", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME <=", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameLike(String value) {
            addCriterion("PERMISSIONLOGICNAME like", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameNotLike(String value) {
            addCriterion("PERMISSIONLOGICNAME not like", value, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameIn(List<String> values) {
            addCriterion("PERMISSIONLOGICNAME in", values, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameNotIn(List<String> values) {
            addCriterion("PERMISSIONLOGICNAME not in", values, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameBetween(String value1, String value2) {
            addCriterion("PERMISSIONLOGICNAME between", value1, value2, "permissionlogicname");
            return (Criteria) this;
        }

        public Criteria andPermissionlogicnameNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONLOGICNAME not between", value1, value2, "permissionlogicname");
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