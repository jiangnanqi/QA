package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblUserquestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserquestionExample() {
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

        public Criteria andUserquestionidIsNull() {
            addCriterion("USERQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andUserquestionidIsNotNull() {
            addCriterion("USERQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andUserquestionidEqualTo(String value) {
            addCriterion("USERQUESTIONID =", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidNotEqualTo(String value) {
            addCriterion("USERQUESTIONID <>", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidGreaterThan(String value) {
            addCriterion("USERQUESTIONID >", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidGreaterThanOrEqualTo(String value) {
            addCriterion("USERQUESTIONID >=", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidLessThan(String value) {
            addCriterion("USERQUESTIONID <", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidLessThanOrEqualTo(String value) {
            addCriterion("USERQUESTIONID <=", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidLike(String value) {
            addCriterion("USERQUESTIONID like", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidNotLike(String value) {
            addCriterion("USERQUESTIONID not like", value, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidIn(List<String> values) {
            addCriterion("USERQUESTIONID in", values, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidNotIn(List<String> values) {
            addCriterion("USERQUESTIONID not in", values, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidBetween(String value1, String value2) {
            addCriterion("USERQUESTIONID between", value1, value2, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andUserquestionidNotBetween(String value1, String value2) {
            addCriterion("USERQUESTIONID not between", value1, value2, "userquestionid");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleIsNull() {
            addCriterion("QUESTIONTITLE is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleIsNotNull() {
            addCriterion("QUESTIONTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleEqualTo(String value) {
            addCriterion("QUESTIONTITLE =", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotEqualTo(String value) {
            addCriterion("QUESTIONTITLE <>", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleGreaterThan(String value) {
            addCriterion("QUESTIONTITLE >", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONTITLE >=", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleLessThan(String value) {
            addCriterion("QUESTIONTITLE <", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleLessThanOrEqualTo(String value) {
            addCriterion("QUESTIONTITLE <=", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleLike(String value) {
            addCriterion("QUESTIONTITLE like", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotLike(String value) {
            addCriterion("QUESTIONTITLE not like", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleIn(List<String> values) {
            addCriterion("QUESTIONTITLE in", values, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotIn(List<String> values) {
            addCriterion("QUESTIONTITLE not in", values, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleBetween(String value1, String value2) {
            addCriterion("QUESTIONTITLE between", value1, value2, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotBetween(String value1, String value2) {
            addCriterion("QUESTIONTITLE not between", value1, value2, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeIsNull() {
            addCriterion("QUESTIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeIsNotNull() {
            addCriterion("QUESTIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeEqualTo(String value) {
            addCriterion("QUESTIONTIME =", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeNotEqualTo(String value) {
            addCriterion("QUESTIONTIME <>", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeGreaterThan(String value) {
            addCriterion("QUESTIONTIME >", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONTIME >=", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeLessThan(String value) {
            addCriterion("QUESTIONTIME <", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeLessThanOrEqualTo(String value) {
            addCriterion("QUESTIONTIME <=", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeLike(String value) {
            addCriterion("QUESTIONTIME like", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeNotLike(String value) {
            addCriterion("QUESTIONTIME not like", value, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeIn(List<String> values) {
            addCriterion("QUESTIONTIME in", values, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeNotIn(List<String> values) {
            addCriterion("QUESTIONTIME not in", values, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeBetween(String value1, String value2) {
            addCriterion("QUESTIONTIME between", value1, value2, "questiontime");
            return (Criteria) this;
        }

        public Criteria andQuestiontimeNotBetween(String value1, String value2) {
            addCriterion("QUESTIONTIME not between", value1, value2, "questiontime");
            return (Criteria) this;
        }

        public Criteria andIsfaqIsNull() {
            addCriterion("ISFAQ is null");
            return (Criteria) this;
        }

        public Criteria andIsfaqIsNotNull() {
            addCriterion("ISFAQ is not null");
            return (Criteria) this;
        }

        public Criteria andIsfaqEqualTo(Integer value) {
            addCriterion("ISFAQ =", value, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqNotEqualTo(Integer value) {
            addCriterion("ISFAQ <>", value, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqGreaterThan(Integer value) {
            addCriterion("ISFAQ >", value, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISFAQ >=", value, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqLessThan(Integer value) {
            addCriterion("ISFAQ <", value, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqLessThanOrEqualTo(Integer value) {
            addCriterion("ISFAQ <=", value, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqIn(List<Integer> values) {
            addCriterion("ISFAQ in", values, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqNotIn(List<Integer> values) {
            addCriterion("ISFAQ not in", values, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqBetween(Integer value1, Integer value2) {
            addCriterion("ISFAQ between", value1, value2, "isfaq");
            return (Criteria) this;
        }

        public Criteria andIsfaqNotBetween(Integer value1, Integer value2) {
            addCriterion("ISFAQ not between", value1, value2, "isfaq");
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