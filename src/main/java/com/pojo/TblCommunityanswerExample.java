package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblCommunityanswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCommunityanswerExample() {
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

        public Criteria andCommunityansweridIsNull() {
            addCriterion("COMMUNITYANSWERID is null");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridIsNotNull() {
            addCriterion("COMMUNITYANSWERID is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridEqualTo(String value) {
            addCriterion("COMMUNITYANSWERID =", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridNotEqualTo(String value) {
            addCriterion("COMMUNITYANSWERID <>", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridGreaterThan(String value) {
            addCriterion("COMMUNITYANSWERID >", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITYANSWERID >=", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridLessThan(String value) {
            addCriterion("COMMUNITYANSWERID <", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITYANSWERID <=", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridLike(String value) {
            addCriterion("COMMUNITYANSWERID like", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridNotLike(String value) {
            addCriterion("COMMUNITYANSWERID not like", value, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridIn(List<String> values) {
            addCriterion("COMMUNITYANSWERID in", values, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridNotIn(List<String> values) {
            addCriterion("COMMUNITYANSWERID not in", values, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridBetween(String value1, String value2) {
            addCriterion("COMMUNITYANSWERID between", value1, value2, "communityanswerid");
            return (Criteria) this;
        }

        public Criteria andCommunityansweridNotBetween(String value1, String value2) {
            addCriterion("COMMUNITYANSWERID not between", value1, value2, "communityanswerid");
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

        public Criteria andIsbestanswerIsNull() {
            addCriterion("ISBESTANSWER is null");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerIsNotNull() {
            addCriterion("ISBESTANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerEqualTo(Integer value) {
            addCriterion("ISBESTANSWER =", value, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerNotEqualTo(Integer value) {
            addCriterion("ISBESTANSWER <>", value, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerGreaterThan(Integer value) {
            addCriterion("ISBESTANSWER >", value, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISBESTANSWER >=", value, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerLessThan(Integer value) {
            addCriterion("ISBESTANSWER <", value, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerLessThanOrEqualTo(Integer value) {
            addCriterion("ISBESTANSWER <=", value, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerIn(List<Integer> values) {
            addCriterion("ISBESTANSWER in", values, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerNotIn(List<Integer> values) {
            addCriterion("ISBESTANSWER not in", values, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerBetween(Integer value1, Integer value2) {
            addCriterion("ISBESTANSWER between", value1, value2, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andIsbestanswerNotBetween(Integer value1, Integer value2) {
            addCriterion("ISBESTANSWER not between", value1, value2, "isbestanswer");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidIsNull() {
            addCriterion("COMMUNITYQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidIsNotNull() {
            addCriterion("COMMUNITYQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID =", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidNotEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID <>", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidGreaterThan(String value) {
            addCriterion("COMMUNITYQUESTIONID >", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID >=", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidLessThan(String value) {
            addCriterion("COMMUNITYQUESTIONID <", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID <=", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidLike(String value) {
            addCriterion("COMMUNITYQUESTIONID like", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidNotLike(String value) {
            addCriterion("COMMUNITYQUESTIONID not like", value, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidIn(List<String> values) {
            addCriterion("COMMUNITYQUESTIONID in", values, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidNotIn(List<String> values) {
            addCriterion("COMMUNITYQUESTIONID not in", values, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidBetween(String value1, String value2) {
            addCriterion("COMMUNITYQUESTIONID between", value1, value2, "communityquestionid");
            return (Criteria) this;
        }

        public Criteria andCommunityquestionidNotBetween(String value1, String value2) {
            addCriterion("COMMUNITYQUESTIONID not between", value1, value2, "communityquestionid");
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

        public Criteria andIsnoticeIsNull() {
            addCriterion("ISNOTICE is null");
            return (Criteria) this;
        }

        public Criteria andIsnoticeIsNotNull() {
            addCriterion("ISNOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andIsnoticeEqualTo(Integer value) {
            addCriterion("ISNOTICE =", value, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeNotEqualTo(Integer value) {
            addCriterion("ISNOTICE <>", value, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeGreaterThan(Integer value) {
            addCriterion("ISNOTICE >", value, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISNOTICE >=", value, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeLessThan(Integer value) {
            addCriterion("ISNOTICE <", value, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeLessThanOrEqualTo(Integer value) {
            addCriterion("ISNOTICE <=", value, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeIn(List<Integer> values) {
            addCriterion("ISNOTICE in", values, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeNotIn(List<Integer> values) {
            addCriterion("ISNOTICE not in", values, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeBetween(Integer value1, Integer value2) {
            addCriterion("ISNOTICE between", value1, value2, "isnotice");
            return (Criteria) this;
        }

        public Criteria andIsnoticeNotBetween(Integer value1, Integer value2) {
            addCriterion("ISNOTICE not between", value1, value2, "isnotice");
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