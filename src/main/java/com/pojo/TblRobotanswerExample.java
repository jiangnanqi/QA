package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblRobotanswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRobotanswerExample() {
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

        public Criteria andRobotansweridIsNull() {
            addCriterion("ROBOTANSWERID is null");
            return (Criteria) this;
        }

        public Criteria andRobotansweridIsNotNull() {
            addCriterion("ROBOTANSWERID is not null");
            return (Criteria) this;
        }

        public Criteria andRobotansweridEqualTo(String value) {
            addCriterion("ROBOTANSWERID =", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridNotEqualTo(String value) {
            addCriterion("ROBOTANSWERID <>", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridGreaterThan(String value) {
            addCriterion("ROBOTANSWERID >", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTANSWERID >=", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridLessThan(String value) {
            addCriterion("ROBOTANSWERID <", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridLessThanOrEqualTo(String value) {
            addCriterion("ROBOTANSWERID <=", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridLike(String value) {
            addCriterion("ROBOTANSWERID like", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridNotLike(String value) {
            addCriterion("ROBOTANSWERID not like", value, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridIn(List<String> values) {
            addCriterion("ROBOTANSWERID in", values, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridNotIn(List<String> values) {
            addCriterion("ROBOTANSWERID not in", values, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridBetween(String value1, String value2) {
            addCriterion("ROBOTANSWERID between", value1, value2, "robotanswerid");
            return (Criteria) this;
        }

        public Criteria andRobotansweridNotBetween(String value1, String value2) {
            addCriterion("ROBOTANSWERID not between", value1, value2, "robotanswerid");
            return (Criteria) this;
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

        public Criteria andFaqansweridIsNull() {
            addCriterion("FAQANSWERID is null");
            return (Criteria) this;
        }

        public Criteria andFaqansweridIsNotNull() {
            addCriterion("FAQANSWERID is not null");
            return (Criteria) this;
        }

        public Criteria andFaqansweridEqualTo(String value) {
            addCriterion("FAQANSWERID =", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridNotEqualTo(String value) {
            addCriterion("FAQANSWERID <>", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridGreaterThan(String value) {
            addCriterion("FAQANSWERID >", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridGreaterThanOrEqualTo(String value) {
            addCriterion("FAQANSWERID >=", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridLessThan(String value) {
            addCriterion("FAQANSWERID <", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridLessThanOrEqualTo(String value) {
            addCriterion("FAQANSWERID <=", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridLike(String value) {
            addCriterion("FAQANSWERID like", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridNotLike(String value) {
            addCriterion("FAQANSWERID not like", value, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridIn(List<String> values) {
            addCriterion("FAQANSWERID in", values, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridNotIn(List<String> values) {
            addCriterion("FAQANSWERID not in", values, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridBetween(String value1, String value2) {
            addCriterion("FAQANSWERID between", value1, value2, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andFaqansweridNotBetween(String value1, String value2) {
            addCriterion("FAQANSWERID not between", value1, value2, "faqanswerid");
            return (Criteria) this;
        }

        public Criteria andSaticfactionIsNull() {
            addCriterion("SATICFACTION is null");
            return (Criteria) this;
        }

        public Criteria andSaticfactionIsNotNull() {
            addCriterion("SATICFACTION is not null");
            return (Criteria) this;
        }

        public Criteria andSaticfactionEqualTo(Integer value) {
            addCriterion("SATICFACTION =", value, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionNotEqualTo(Integer value) {
            addCriterion("SATICFACTION <>", value, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionGreaterThan(Integer value) {
            addCriterion("SATICFACTION >", value, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionGreaterThanOrEqualTo(Integer value) {
            addCriterion("SATICFACTION >=", value, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionLessThan(Integer value) {
            addCriterion("SATICFACTION <", value, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionLessThanOrEqualTo(Integer value) {
            addCriterion("SATICFACTION <=", value, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionIn(List<Integer> values) {
            addCriterion("SATICFACTION in", values, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionNotIn(List<Integer> values) {
            addCriterion("SATICFACTION not in", values, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionBetween(Integer value1, Integer value2) {
            addCriterion("SATICFACTION between", value1, value2, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andSaticfactionNotBetween(Integer value1, Integer value2) {
            addCriterion("SATICFACTION not between", value1, value2, "saticfaction");
            return (Criteria) this;
        }

        public Criteria andQuestionstateIsNull() {
            addCriterion("QUESTIONSTATE is null");
            return (Criteria) this;
        }

        public Criteria andQuestionstateIsNotNull() {
            addCriterion("QUESTIONSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionstateEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE =", value, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateNotEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE <>", value, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateGreaterThan(Integer value) {
            addCriterion("QUESTIONSTATE >", value, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE >=", value, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateLessThan(Integer value) {
            addCriterion("QUESTIONSTATE <", value, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE <=", value, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateIn(List<Integer> values) {
            addCriterion("QUESTIONSTATE in", values, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateNotIn(List<Integer> values) {
            addCriterion("QUESTIONSTATE not in", values, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateBetween(Integer value1, Integer value2) {
            addCriterion("QUESTIONSTATE between", value1, value2, "questionstate");
            return (Criteria) this;
        }

        public Criteria andQuestionstateNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTIONSTATE not between", value1, value2, "questionstate");
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