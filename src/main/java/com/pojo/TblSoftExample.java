package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblSoftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblSoftExample() {
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

        public Criteria andConfigureidIsNull() {
            addCriterion("CONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andConfigureidIsNotNull() {
            addCriterion("CONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureidEqualTo(String value) {
            addCriterion("CONFIGUREID =", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotEqualTo(String value) {
            addCriterion("CONFIGUREID <>", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidGreaterThan(String value) {
            addCriterion("CONFIGUREID >", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID >=", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLessThan(String value) {
            addCriterion("CONFIGUREID <", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID <=", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLike(String value) {
            addCriterion("CONFIGUREID like", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotLike(String value) {
            addCriterion("CONFIGUREID not like", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidIn(List<String> values) {
            addCriterion("CONFIGUREID in", values, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotIn(List<String> values) {
            addCriterion("CONFIGUREID not in", values, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidBetween(String value1, String value2) {
            addCriterion("CONFIGUREID between", value1, value2, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREID not between", value1, value2, "configureid");
            return (Criteria) this;
        }

        public Criteria andSoftidIsNull() {
            addCriterion("SOFTID is null");
            return (Criteria) this;
        }

        public Criteria andSoftidIsNotNull() {
            addCriterion("SOFTID is not null");
            return (Criteria) this;
        }

        public Criteria andSoftidEqualTo(String value) {
            addCriterion("SOFTID =", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotEqualTo(String value) {
            addCriterion("SOFTID <>", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidGreaterThan(String value) {
            addCriterion("SOFTID >", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTID >=", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidLessThan(String value) {
            addCriterion("SOFTID <", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidLessThanOrEqualTo(String value) {
            addCriterion("SOFTID <=", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidLike(String value) {
            addCriterion("SOFTID like", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotLike(String value) {
            addCriterion("SOFTID not like", value, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidIn(List<String> values) {
            addCriterion("SOFTID in", values, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotIn(List<String> values) {
            addCriterion("SOFTID not in", values, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidBetween(String value1, String value2) {
            addCriterion("SOFTID between", value1, value2, "softid");
            return (Criteria) this;
        }

        public Criteria andSoftidNotBetween(String value1, String value2) {
            addCriterion("SOFTID not between", value1, value2, "softid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("SCORE like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("SCORE not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("LOGO is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("LOGO =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("LOGO <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("LOGO >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("LOGO <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("LOGO <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("LOGO like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("LOGO not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("LOGO in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("LOGO not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("LOGO between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("LOGO not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andVersiontypeIsNull() {
            addCriterion("VERSIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVersiontypeIsNotNull() {
            addCriterion("VERSIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVersiontypeEqualTo(String value) {
            addCriterion("VERSIONTYPE =", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotEqualTo(String value) {
            addCriterion("VERSIONTYPE <>", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeGreaterThan(String value) {
            addCriterion("VERSIONTYPE >", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("VERSIONTYPE >=", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeLessThan(String value) {
            addCriterion("VERSIONTYPE <", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeLessThanOrEqualTo(String value) {
            addCriterion("VERSIONTYPE <=", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeLike(String value) {
            addCriterion("VERSIONTYPE like", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotLike(String value) {
            addCriterion("VERSIONTYPE not like", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeIn(List<String> values) {
            addCriterion("VERSIONTYPE in", values, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotIn(List<String> values) {
            addCriterion("VERSIONTYPE not in", values, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeBetween(String value1, String value2) {
            addCriterion("VERSIONTYPE between", value1, value2, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotBetween(String value1, String value2) {
            addCriterion("VERSIONTYPE not between", value1, value2, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNull() {
            addCriterion("SOFTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNotNull() {
            addCriterion("SOFTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSofttypeEqualTo(String value) {
            addCriterion("SOFTTYPE =", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotEqualTo(String value) {
            addCriterion("SOFTTYPE <>", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThan(String value) {
            addCriterion("SOFTTYPE >", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTTYPE >=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThan(String value) {
            addCriterion("SOFTTYPE <", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThanOrEqualTo(String value) {
            addCriterion("SOFTTYPE <=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLike(String value) {
            addCriterion("SOFTTYPE like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotLike(String value) {
            addCriterion("SOFTTYPE not like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeIn(List<String> values) {
            addCriterion("SOFTTYPE in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotIn(List<String> values) {
            addCriterion("SOFTTYPE not in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeBetween(String value1, String value2) {
            addCriterion("SOFTTYPE between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotBetween(String value1, String value2) {
            addCriterion("SOFTTYPE not between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSpareurlIsNull() {
            addCriterion("SPAREURL is null");
            return (Criteria) this;
        }

        public Criteria andSpareurlIsNotNull() {
            addCriterion("SPAREURL is not null");
            return (Criteria) this;
        }

        public Criteria andSpareurlEqualTo(String value) {
            addCriterion("SPAREURL =", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlNotEqualTo(String value) {
            addCriterion("SPAREURL <>", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlGreaterThan(String value) {
            addCriterion("SPAREURL >", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlGreaterThanOrEqualTo(String value) {
            addCriterion("SPAREURL >=", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlLessThan(String value) {
            addCriterion("SPAREURL <", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlLessThanOrEqualTo(String value) {
            addCriterion("SPAREURL <=", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlLike(String value) {
            addCriterion("SPAREURL like", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlNotLike(String value) {
            addCriterion("SPAREURL not like", value, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlIn(List<String> values) {
            addCriterion("SPAREURL in", values, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlNotIn(List<String> values) {
            addCriterion("SPAREURL not in", values, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlBetween(String value1, String value2) {
            addCriterion("SPAREURL between", value1, value2, "spareurl");
            return (Criteria) this;
        }

        public Criteria andSpareurlNotBetween(String value1, String value2) {
            addCriterion("SPAREURL not between", value1, value2, "spareurl");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("OS is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("OS is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("OS =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("OS <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("OS >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("OS >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("OS <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("OS <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("OS like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("OS not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("OS in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("OS not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("OS between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("OS not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WEBSITE =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WEBSITE <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WEBSITE like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WEBSITE not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WEBSITE in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "website");
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