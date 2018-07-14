package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblCommunityquestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCommunityquestionExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNull() {
            addCriterion("CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNotNull() {
            addCriterion("CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyidEqualTo(String value) {
            addCriterion("CLASSIFYID =", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotEqualTo(String value) {
            addCriterion("CLASSIFYID <>", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThan(String value) {
            addCriterion("CLASSIFYID >", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSIFYID >=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThan(String value) {
            addCriterion("CLASSIFYID <", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThanOrEqualTo(String value) {
            addCriterion("CLASSIFYID <=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLike(String value) {
            addCriterion("CLASSIFYID like", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotLike(String value) {
            addCriterion("CLASSIFYID not like", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidIn(List<String> values) {
            addCriterion("CLASSIFYID in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotIn(List<String> values) {
            addCriterion("CLASSIFYID not in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidBetween(String value1, String value2) {
            addCriterion("CLASSIFYID between", value1, value2, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotBetween(String value1, String value2) {
            addCriterion("CLASSIFYID not between", value1, value2, "classifyid");
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

        public Criteria andScanIsNull() {
            addCriterion("SCAN is null");
            return (Criteria) this;
        }

        public Criteria andScanIsNotNull() {
            addCriterion("SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andScanEqualTo(String value) {
            addCriterion("SCAN =", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanNotEqualTo(String value) {
            addCriterion("SCAN <>", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanGreaterThan(String value) {
            addCriterion("SCAN >", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN >=", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanLessThan(String value) {
            addCriterion("SCAN <", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanLessThanOrEqualTo(String value) {
            addCriterion("SCAN <=", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanLike(String value) {
            addCriterion("SCAN like", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanNotLike(String value) {
            addCriterion("SCAN not like", value, "scan");
            return (Criteria) this;
        }

        public Criteria andScanIn(List<String> values) {
            addCriterion("SCAN in", values, "scan");
            return (Criteria) this;
        }

        public Criteria andScanNotIn(List<String> values) {
            addCriterion("SCAN not in", values, "scan");
            return (Criteria) this;
        }

        public Criteria andScanBetween(String value1, String value2) {
            addCriterion("SCAN between", value1, value2, "scan");
            return (Criteria) this;
        }

        public Criteria andScanNotBetween(String value1, String value2) {
            addCriterion("SCAN not between", value1, value2, "scan");
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

        public Criteria andIsanswerIsNull() {
            addCriterion("ISANSWER is null");
            return (Criteria) this;
        }

        public Criteria andIsanswerIsNotNull() {
            addCriterion("ISANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsanswerEqualTo(Integer value) {
            addCriterion("ISANSWER =", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotEqualTo(Integer value) {
            addCriterion("ISANSWER <>", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerGreaterThan(Integer value) {
            addCriterion("ISANSWER >", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISANSWER >=", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerLessThan(Integer value) {
            addCriterion("ISANSWER <", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerLessThanOrEqualTo(Integer value) {
            addCriterion("ISANSWER <=", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerIn(List<Integer> values) {
            addCriterion("ISANSWER in", values, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotIn(List<Integer> values) {
            addCriterion("ISANSWER not in", values, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerBetween(Integer value1, Integer value2) {
            addCriterion("ISANSWER between", value1, value2, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotBetween(Integer value1, Integer value2) {
            addCriterion("ISANSWER not between", value1, value2, "isanswer");
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