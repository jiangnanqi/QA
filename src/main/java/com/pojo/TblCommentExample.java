package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("COMMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("COMMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(String value) {
            addCriterion("COMMENTID =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(String value) {
            addCriterion("COMMENTID <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(String value) {
            addCriterion("COMMENTID >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTID >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(String value) {
            addCriterion("COMMENTID <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(String value) {
            addCriterion("COMMENTID <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLike(String value) {
            addCriterion("COMMENTID like", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotLike(String value) {
            addCriterion("COMMENTID not like", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<String> values) {
            addCriterion("COMMENTID in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<String> values) {
            addCriterion("COMMENTID not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(String value1, String value2) {
            addCriterion("COMMENTID between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(String value1, String value2) {
            addCriterion("COMMENTID not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidIsNull() {
            addCriterion("FAQQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidIsNotNull() {
            addCriterion("FAQQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidEqualTo(String value) {
            addCriterion("FAQQUESTIONID =", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidNotEqualTo(String value) {
            addCriterion("FAQQUESTIONID <>", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidGreaterThan(String value) {
            addCriterion("FAQQUESTIONID >", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidGreaterThanOrEqualTo(String value) {
            addCriterion("FAQQUESTIONID >=", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidLessThan(String value) {
            addCriterion("FAQQUESTIONID <", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidLessThanOrEqualTo(String value) {
            addCriterion("FAQQUESTIONID <=", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidLike(String value) {
            addCriterion("FAQQUESTIONID like", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidNotLike(String value) {
            addCriterion("FAQQUESTIONID not like", value, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidIn(List<String> values) {
            addCriterion("FAQQUESTIONID in", values, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidNotIn(List<String> values) {
            addCriterion("FAQQUESTIONID not in", values, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidBetween(String value1, String value2) {
            addCriterion("FAQQUESTIONID between", value1, value2, "faqquestionid");
            return (Criteria) this;
        }

        public Criteria andFaqquestionidNotBetween(String value1, String value2) {
            addCriterion("FAQQUESTIONID not between", value1, value2, "faqquestionid");
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

        public Criteria andCommentcontentIsNull() {
            addCriterion("COMMENTCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNotNull() {
            addCriterion("COMMENTCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentEqualTo(String value) {
            addCriterion("COMMENTCONTENT =", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotEqualTo(String value) {
            addCriterion("COMMENTCONTENT <>", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThan(String value) {
            addCriterion("COMMENTCONTENT >", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTCONTENT >=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThan(String value) {
            addCriterion("COMMENTCONTENT <", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("COMMENTCONTENT <=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLike(String value) {
            addCriterion("COMMENTCONTENT like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotLike(String value) {
            addCriterion("COMMENTCONTENT not like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIn(List<String> values) {
            addCriterion("COMMENTCONTENT in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotIn(List<String> values) {
            addCriterion("COMMENTCONTENT not in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentBetween(String value1, String value2) {
            addCriterion("COMMENTCONTENT between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotBetween(String value1, String value2) {
            addCriterion("COMMENTCONTENT not between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("COMMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("COMMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(String value) {
            addCriterion("COMMENTTIME =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(String value) {
            addCriterion("COMMENTTIME <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(String value) {
            addCriterion("COMMENTTIME >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTTIME >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(String value) {
            addCriterion("COMMENTTIME <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(String value) {
            addCriterion("COMMENTTIME <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLike(String value) {
            addCriterion("COMMENTTIME like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotLike(String value) {
            addCriterion("COMMENTTIME not like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<String> values) {
            addCriterion("COMMENTTIME in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<String> values) {
            addCriterion("COMMENTTIME not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(String value1, String value2) {
            addCriterion("COMMENTTIME between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(String value1, String value2) {
            addCriterion("COMMENTTIME not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommentparentidIsNull() {
            addCriterion("COMMENTPARENTID is null");
            return (Criteria) this;
        }

        public Criteria andCommentparentidIsNotNull() {
            addCriterion("COMMENTPARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentparentidEqualTo(String value) {
            addCriterion("COMMENTPARENTID =", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidNotEqualTo(String value) {
            addCriterion("COMMENTPARENTID <>", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidGreaterThan(String value) {
            addCriterion("COMMENTPARENTID >", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTPARENTID >=", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidLessThan(String value) {
            addCriterion("COMMENTPARENTID <", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidLessThanOrEqualTo(String value) {
            addCriterion("COMMENTPARENTID <=", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidLike(String value) {
            addCriterion("COMMENTPARENTID like", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidNotLike(String value) {
            addCriterion("COMMENTPARENTID not like", value, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidIn(List<String> values) {
            addCriterion("COMMENTPARENTID in", values, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidNotIn(List<String> values) {
            addCriterion("COMMENTPARENTID not in", values, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidBetween(String value1, String value2) {
            addCriterion("COMMENTPARENTID between", value1, value2, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andCommentparentidNotBetween(String value1, String value2) {
            addCriterion("COMMENTPARENTID not between", value1, value2, "commentparentid");
            return (Criteria) this;
        }

        public Criteria andTouseridIsNull() {
            addCriterion("TOUSERID is null");
            return (Criteria) this;
        }

        public Criteria andTouseridIsNotNull() {
            addCriterion("TOUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andTouseridEqualTo(String value) {
            addCriterion("TOUSERID =", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotEqualTo(String value) {
            addCriterion("TOUSERID <>", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridGreaterThan(String value) {
            addCriterion("TOUSERID >", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridGreaterThanOrEqualTo(String value) {
            addCriterion("TOUSERID >=", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLessThan(String value) {
            addCriterion("TOUSERID <", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLessThanOrEqualTo(String value) {
            addCriterion("TOUSERID <=", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLike(String value) {
            addCriterion("TOUSERID like", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotLike(String value) {
            addCriterion("TOUSERID not like", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridIn(List<String> values) {
            addCriterion("TOUSERID in", values, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotIn(List<String> values) {
            addCriterion("TOUSERID not in", values, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridBetween(String value1, String value2) {
            addCriterion("TOUSERID between", value1, value2, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotBetween(String value1, String value2) {
            addCriterion("TOUSERID not between", value1, value2, "touserid");
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