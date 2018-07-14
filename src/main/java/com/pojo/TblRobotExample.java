package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblRobotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRobotExample() {
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

        public Criteria andRobotidIsNull() {
            addCriterion("ROBOTID is null");
            return (Criteria) this;
        }

        public Criteria andRobotidIsNotNull() {
            addCriterion("ROBOTID is not null");
            return (Criteria) this;
        }

        public Criteria andRobotidEqualTo(String value) {
            addCriterion("ROBOTID =", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotEqualTo(String value) {
            addCriterion("ROBOTID <>", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidGreaterThan(String value) {
            addCriterion("ROBOTID >", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTID >=", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidLessThan(String value) {
            addCriterion("ROBOTID <", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidLessThanOrEqualTo(String value) {
            addCriterion("ROBOTID <=", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidLike(String value) {
            addCriterion("ROBOTID like", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotLike(String value) {
            addCriterion("ROBOTID not like", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidIn(List<String> values) {
            addCriterion("ROBOTID in", values, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotIn(List<String> values) {
            addCriterion("ROBOTID not in", values, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidBetween(String value1, String value2) {
            addCriterion("ROBOTID between", value1, value2, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotBetween(String value1, String value2) {
            addCriterion("ROBOTID not between", value1, value2, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotnameIsNull() {
            addCriterion("ROBOTNAME is null");
            return (Criteria) this;
        }

        public Criteria andRobotnameIsNotNull() {
            addCriterion("ROBOTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRobotnameEqualTo(String value) {
            addCriterion("ROBOTNAME =", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameNotEqualTo(String value) {
            addCriterion("ROBOTNAME <>", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameGreaterThan(String value) {
            addCriterion("ROBOTNAME >", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTNAME >=", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameLessThan(String value) {
            addCriterion("ROBOTNAME <", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameLessThanOrEqualTo(String value) {
            addCriterion("ROBOTNAME <=", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameLike(String value) {
            addCriterion("ROBOTNAME like", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameNotLike(String value) {
            addCriterion("ROBOTNAME not like", value, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameIn(List<String> values) {
            addCriterion("ROBOTNAME in", values, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameNotIn(List<String> values) {
            addCriterion("ROBOTNAME not in", values, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameBetween(String value1, String value2) {
            addCriterion("ROBOTNAME between", value1, value2, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotnameNotBetween(String value1, String value2) {
            addCriterion("ROBOTNAME not between", value1, value2, "robotname");
            return (Criteria) this;
        }

        public Criteria andRobotimageIsNull() {
            addCriterion("ROBOTIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andRobotimageIsNotNull() {
            addCriterion("ROBOTIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andRobotimageEqualTo(String value) {
            addCriterion("ROBOTIMAGE =", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageNotEqualTo(String value) {
            addCriterion("ROBOTIMAGE <>", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageGreaterThan(String value) {
            addCriterion("ROBOTIMAGE >", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTIMAGE >=", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageLessThan(String value) {
            addCriterion("ROBOTIMAGE <", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageLessThanOrEqualTo(String value) {
            addCriterion("ROBOTIMAGE <=", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageLike(String value) {
            addCriterion("ROBOTIMAGE like", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageNotLike(String value) {
            addCriterion("ROBOTIMAGE not like", value, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageIn(List<String> values) {
            addCriterion("ROBOTIMAGE in", values, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageNotIn(List<String> values) {
            addCriterion("ROBOTIMAGE not in", values, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageBetween(String value1, String value2) {
            addCriterion("ROBOTIMAGE between", value1, value2, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotimageNotBetween(String value1, String value2) {
            addCriterion("ROBOTIMAGE not between", value1, value2, "robotimage");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionIsNull() {
            addCriterion("ROBOTINTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionIsNotNull() {
            addCriterion("ROBOTINTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION =", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionNotEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION <>", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionGreaterThan(String value) {
            addCriterion("ROBOTINTRODUCTION >", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION >=", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionLessThan(String value) {
            addCriterion("ROBOTINTRODUCTION <", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionLessThanOrEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION <=", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionLike(String value) {
            addCriterion("ROBOTINTRODUCTION like", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionNotLike(String value) {
            addCriterion("ROBOTINTRODUCTION not like", value, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionIn(List<String> values) {
            addCriterion("ROBOTINTRODUCTION in", values, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionNotIn(List<String> values) {
            addCriterion("ROBOTINTRODUCTION not in", values, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionBetween(String value1, String value2) {
            addCriterion("ROBOTINTRODUCTION between", value1, value2, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotintroductionNotBetween(String value1, String value2) {
            addCriterion("ROBOTINTRODUCTION not between", value1, value2, "robotintroduction");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeIsNull() {
            addCriterion("ROBOTWELCOME is null");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeIsNotNull() {
            addCriterion("ROBOTWELCOME is not null");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeEqualTo(String value) {
            addCriterion("ROBOTWELCOME =", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeNotEqualTo(String value) {
            addCriterion("ROBOTWELCOME <>", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeGreaterThan(String value) {
            addCriterion("ROBOTWELCOME >", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTWELCOME >=", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeLessThan(String value) {
            addCriterion("ROBOTWELCOME <", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeLessThanOrEqualTo(String value) {
            addCriterion("ROBOTWELCOME <=", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeLike(String value) {
            addCriterion("ROBOTWELCOME like", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeNotLike(String value) {
            addCriterion("ROBOTWELCOME not like", value, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeIn(List<String> values) {
            addCriterion("ROBOTWELCOME in", values, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeNotIn(List<String> values) {
            addCriterion("ROBOTWELCOME not in", values, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeBetween(String value1, String value2) {
            addCriterion("ROBOTWELCOME between", value1, value2, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotwelcomeNotBetween(String value1, String value2) {
            addCriterion("ROBOTWELCOME not between", value1, value2, "robotwelcome");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowIsNull() {
            addCriterion("ROBOTNOKNOW is null");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowIsNotNull() {
            addCriterion("ROBOTNOKNOW is not null");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowEqualTo(String value) {
            addCriterion("ROBOTNOKNOW =", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowNotEqualTo(String value) {
            addCriterion("ROBOTNOKNOW <>", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowGreaterThan(String value) {
            addCriterion("ROBOTNOKNOW >", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTNOKNOW >=", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowLessThan(String value) {
            addCriterion("ROBOTNOKNOW <", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowLessThanOrEqualTo(String value) {
            addCriterion("ROBOTNOKNOW <=", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowLike(String value) {
            addCriterion("ROBOTNOKNOW like", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowNotLike(String value) {
            addCriterion("ROBOTNOKNOW not like", value, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowIn(List<String> values) {
            addCriterion("ROBOTNOKNOW in", values, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowNotIn(List<String> values) {
            addCriterion("ROBOTNOKNOW not in", values, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowBetween(String value1, String value2) {
            addCriterion("ROBOTNOKNOW between", value1, value2, "robotnoknow");
            return (Criteria) this;
        }

        public Criteria andRobotnoknowNotBetween(String value1, String value2) {
            addCriterion("ROBOTNOKNOW not between", value1, value2, "robotnoknow");
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