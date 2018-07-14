package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblFaqquestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblFaqquestionExample() {
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

        public Criteria andFaqtitleIsNull() {
            addCriterion("FAQTITLE is null");
            return (Criteria) this;
        }

        public Criteria andFaqtitleIsNotNull() {
            addCriterion("FAQTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFaqtitleEqualTo(String value) {
            addCriterion("FAQTITLE =", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleNotEqualTo(String value) {
            addCriterion("FAQTITLE <>", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleGreaterThan(String value) {
            addCriterion("FAQTITLE >", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleGreaterThanOrEqualTo(String value) {
            addCriterion("FAQTITLE >=", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleLessThan(String value) {
            addCriterion("FAQTITLE <", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleLessThanOrEqualTo(String value) {
            addCriterion("FAQTITLE <=", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleLike(String value) {
            addCriterion("FAQTITLE like", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleNotLike(String value) {
            addCriterion("FAQTITLE not like", value, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleIn(List<String> values) {
            addCriterion("FAQTITLE in", values, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleNotIn(List<String> values) {
            addCriterion("FAQTITLE not in", values, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleBetween(String value1, String value2) {
            addCriterion("FAQTITLE between", value1, value2, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqtitleNotBetween(String value1, String value2) {
            addCriterion("FAQTITLE not between", value1, value2, "faqtitle");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsIsNull() {
            addCriterion("FAQKEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsIsNotNull() {
            addCriterion("FAQKEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsEqualTo(String value) {
            addCriterion("FAQKEYWORDS =", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsNotEqualTo(String value) {
            addCriterion("FAQKEYWORDS <>", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsGreaterThan(String value) {
            addCriterion("FAQKEYWORDS >", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("FAQKEYWORDS >=", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsLessThan(String value) {
            addCriterion("FAQKEYWORDS <", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsLessThanOrEqualTo(String value) {
            addCriterion("FAQKEYWORDS <=", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsLike(String value) {
            addCriterion("FAQKEYWORDS like", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsNotLike(String value) {
            addCriterion("FAQKEYWORDS not like", value, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsIn(List<String> values) {
            addCriterion("FAQKEYWORDS in", values, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsNotIn(List<String> values) {
            addCriterion("FAQKEYWORDS not in", values, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsBetween(String value1, String value2) {
            addCriterion("FAQKEYWORDS between", value1, value2, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqkeywordsNotBetween(String value1, String value2) {
            addCriterion("FAQKEYWORDS not between", value1, value2, "faqkeywords");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidIsNull() {
            addCriterion("FAQCLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidIsNotNull() {
            addCriterion("FAQCLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidEqualTo(String value) {
            addCriterion("FAQCLASSIFYID =", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidNotEqualTo(String value) {
            addCriterion("FAQCLASSIFYID <>", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidGreaterThan(String value) {
            addCriterion("FAQCLASSIFYID >", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidGreaterThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYID >=", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidLessThan(String value) {
            addCriterion("FAQCLASSIFYID <", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidLessThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYID <=", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidLike(String value) {
            addCriterion("FAQCLASSIFYID like", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidNotLike(String value) {
            addCriterion("FAQCLASSIFYID not like", value, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidIn(List<String> values) {
            addCriterion("FAQCLASSIFYID in", values, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidNotIn(List<String> values) {
            addCriterion("FAQCLASSIFYID not in", values, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYID between", value1, value2, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyidNotBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYID not between", value1, value2, "faqclassifyid");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNull() {
            addCriterion("COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNotNull() {
            addCriterion("COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionEqualTo(String value) {
            addCriterion("COLLECTION =", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotEqualTo(String value) {
            addCriterion("COLLECTION <>", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThan(String value) {
            addCriterion("COLLECTION >", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION >=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThan(String value) {
            addCriterion("COLLECTION <", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION <=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLike(String value) {
            addCriterion("COLLECTION like", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotLike(String value) {
            addCriterion("COLLECTION not like", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionIn(List<String> values) {
            addCriterion("COLLECTION in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotIn(List<String> values) {
            addCriterion("COLLECTION not in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionBetween(String value1, String value2) {
            addCriterion("COLLECTION between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotBetween(String value1, String value2) {
            addCriterion("COLLECTION not between", value1, value2, "collection");
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

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("MODIFYTIME like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("MODIFYTIME not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifynumberIsNull() {
            addCriterion("MODIFYNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andModifynumberIsNotNull() {
            addCriterion("MODIFYNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andModifynumberEqualTo(String value) {
            addCriterion("MODIFYNUMBER =", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberNotEqualTo(String value) {
            addCriterion("MODIFYNUMBER <>", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberGreaterThan(String value) {
            addCriterion("MODIFYNUMBER >", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYNUMBER >=", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberLessThan(String value) {
            addCriterion("MODIFYNUMBER <", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberLessThanOrEqualTo(String value) {
            addCriterion("MODIFYNUMBER <=", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberLike(String value) {
            addCriterion("MODIFYNUMBER like", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberNotLike(String value) {
            addCriterion("MODIFYNUMBER not like", value, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberIn(List<String> values) {
            addCriterion("MODIFYNUMBER in", values, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberNotIn(List<String> values) {
            addCriterion("MODIFYNUMBER not in", values, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberBetween(String value1, String value2) {
            addCriterion("MODIFYNUMBER between", value1, value2, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andModifynumberNotBetween(String value1, String value2) {
            addCriterion("MODIFYNUMBER not between", value1, value2, "modifynumber");
            return (Criteria) this;
        }

        public Criteria andFaqstateIsNull() {
            addCriterion("FAQSTATE is null");
            return (Criteria) this;
        }

        public Criteria andFaqstateIsNotNull() {
            addCriterion("FAQSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andFaqstateEqualTo(Integer value) {
            addCriterion("FAQSTATE =", value, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateNotEqualTo(Integer value) {
            addCriterion("FAQSTATE <>", value, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateGreaterThan(Integer value) {
            addCriterion("FAQSTATE >", value, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAQSTATE >=", value, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateLessThan(Integer value) {
            addCriterion("FAQSTATE <", value, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateLessThanOrEqualTo(Integer value) {
            addCriterion("FAQSTATE <=", value, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateIn(List<Integer> values) {
            addCriterion("FAQSTATE in", values, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateNotIn(List<Integer> values) {
            addCriterion("FAQSTATE not in", values, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateBetween(Integer value1, Integer value2) {
            addCriterion("FAQSTATE between", value1, value2, "faqstate");
            return (Criteria) this;
        }

        public Criteria andFaqstateNotBetween(Integer value1, Integer value2) {
            addCriterion("FAQSTATE not between", value1, value2, "faqstate");
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