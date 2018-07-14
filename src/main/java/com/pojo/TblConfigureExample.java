package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblConfigureExample() {
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

        public Criteria andConfiguretypeIsNull() {
            addCriterion("CONFIGURETYPE is null");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeIsNotNull() {
            addCriterion("CONFIGURETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeEqualTo(String value) {
            addCriterion("CONFIGURETYPE =", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotEqualTo(String value) {
            addCriterion("CONFIGURETYPE <>", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeGreaterThan(String value) {
            addCriterion("CONFIGURETYPE >", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURETYPE >=", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeLessThan(String value) {
            addCriterion("CONFIGURETYPE <", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeLessThanOrEqualTo(String value) {
            addCriterion("CONFIGURETYPE <=", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeLike(String value) {
            addCriterion("CONFIGURETYPE like", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotLike(String value) {
            addCriterion("CONFIGURETYPE not like", value, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeIn(List<String> values) {
            addCriterion("CONFIGURETYPE in", values, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotIn(List<String> values) {
            addCriterion("CONFIGURETYPE not in", values, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeBetween(String value1, String value2) {
            addCriterion("CONFIGURETYPE between", value1, value2, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfiguretypeNotBetween(String value1, String value2) {
            addCriterion("CONFIGURETYPE not between", value1, value2, "configuretype");
            return (Criteria) this;
        }

        public Criteria andConfigurenameIsNull() {
            addCriterion("CONFIGURENAME is null");
            return (Criteria) this;
        }

        public Criteria andConfigurenameIsNotNull() {
            addCriterion("CONFIGURENAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfigurenameEqualTo(String value) {
            addCriterion("CONFIGURENAME =", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotEqualTo(String value) {
            addCriterion("CONFIGURENAME <>", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameGreaterThan(String value) {
            addCriterion("CONFIGURENAME >", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURENAME >=", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameLessThan(String value) {
            addCriterion("CONFIGURENAME <", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameLessThanOrEqualTo(String value) {
            addCriterion("CONFIGURENAME <=", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameLike(String value) {
            addCriterion("CONFIGURENAME like", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotLike(String value) {
            addCriterion("CONFIGURENAME not like", value, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameIn(List<String> values) {
            addCriterion("CONFIGURENAME in", values, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotIn(List<String> values) {
            addCriterion("CONFIGURENAME not in", values, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameBetween(String value1, String value2) {
            addCriterion("CONFIGURENAME between", value1, value2, "configurename");
            return (Criteria) this;
        }

        public Criteria andConfigurenameNotBetween(String value1, String value2) {
            addCriterion("CONFIGURENAME not between", value1, value2, "configurename");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("FILESIZE is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("FILESIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(String value) {
            addCriterion("FILESIZE =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(String value) {
            addCriterion("FILESIZE <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(String value) {
            addCriterion("FILESIZE >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(String value) {
            addCriterion("FILESIZE >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(String value) {
            addCriterion("FILESIZE <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(String value) {
            addCriterion("FILESIZE <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLike(String value) {
            addCriterion("FILESIZE like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotLike(String value) {
            addCriterion("FILESIZE not like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<String> values) {
            addCriterion("FILESIZE in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<String> values) {
            addCriterion("FILESIZE not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(String value1, String value2) {
            addCriterion("FILESIZE between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(String value1, String value2) {
            addCriterion("FILESIZE not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesIsNull() {
            addCriterion("DOWNLOADTIMES is null");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesIsNotNull() {
            addCriterion("DOWNLOADTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesEqualTo(String value) {
            addCriterion("DOWNLOADTIMES =", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesNotEqualTo(String value) {
            addCriterion("DOWNLOADTIMES <>", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesGreaterThan(String value) {
            addCriterion("DOWNLOADTIMES >", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNLOADTIMES >=", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesLessThan(String value) {
            addCriterion("DOWNLOADTIMES <", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesLessThanOrEqualTo(String value) {
            addCriterion("DOWNLOADTIMES <=", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesLike(String value) {
            addCriterion("DOWNLOADTIMES like", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesNotLike(String value) {
            addCriterion("DOWNLOADTIMES not like", value, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesIn(List<String> values) {
            addCriterion("DOWNLOADTIMES in", values, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesNotIn(List<String> values) {
            addCriterion("DOWNLOADTIMES not in", values, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesBetween(String value1, String value2) {
            addCriterion("DOWNLOADTIMES between", value1, value2, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andDownloadtimesNotBetween(String value1, String value2) {
            addCriterion("DOWNLOADTIMES not between", value1, value2, "downloadtimes");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("PRODUCER is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("PRODUCER is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("PRODUCER =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("PRODUCER <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("PRODUCER >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCER >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("PRODUCER <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("PRODUCER <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("PRODUCER like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("PRODUCER not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("PRODUCER in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("PRODUCER not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("PRODUCER between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("PRODUCER not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeIsNull() {
            addCriterion("CONFIGURETIME is null");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeIsNotNull() {
            addCriterion("CONFIGURETIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeEqualTo(String value) {
            addCriterion("CONFIGURETIME =", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeNotEqualTo(String value) {
            addCriterion("CONFIGURETIME <>", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeGreaterThan(String value) {
            addCriterion("CONFIGURETIME >", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURETIME >=", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeLessThan(String value) {
            addCriterion("CONFIGURETIME <", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeLessThanOrEqualTo(String value) {
            addCriterion("CONFIGURETIME <=", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeLike(String value) {
            addCriterion("CONFIGURETIME like", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeNotLike(String value) {
            addCriterion("CONFIGURETIME not like", value, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeIn(List<String> values) {
            addCriterion("CONFIGURETIME in", values, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeNotIn(List<String> values) {
            addCriterion("CONFIGURETIME not in", values, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeBetween(String value1, String value2) {
            addCriterion("CONFIGURETIME between", value1, value2, "configuretime");
            return (Criteria) this;
        }

        public Criteria andConfiguretimeNotBetween(String value1, String value2) {
            addCriterion("CONFIGURETIME not between", value1, value2, "configuretime");
            return (Criteria) this;
        }

        public Criteria andIsconfigureIsNull() {
            addCriterion("ISCONFIGURE is null");
            return (Criteria) this;
        }

        public Criteria andIsconfigureIsNotNull() {
            addCriterion("ISCONFIGURE is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfigureEqualTo(Integer value) {
            addCriterion("ISCONFIGURE =", value, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureNotEqualTo(Integer value) {
            addCriterion("ISCONFIGURE <>", value, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureGreaterThan(Integer value) {
            addCriterion("ISCONFIGURE >", value, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISCONFIGURE >=", value, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureLessThan(Integer value) {
            addCriterion("ISCONFIGURE <", value, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureLessThanOrEqualTo(Integer value) {
            addCriterion("ISCONFIGURE <=", value, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureIn(List<Integer> values) {
            addCriterion("ISCONFIGURE in", values, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureNotIn(List<Integer> values) {
            addCriterion("ISCONFIGURE not in", values, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureBetween(Integer value1, Integer value2) {
            addCriterion("ISCONFIGURE between", value1, value2, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andIsconfigureNotBetween(Integer value1, Integer value2) {
            addCriterion("ISCONFIGURE not between", value1, value2, "isconfigure");
            return (Criteria) this;
        }

        public Criteria andRenameIsNull() {
            addCriterion("RENAME is null");
            return (Criteria) this;
        }

        public Criteria andRenameIsNotNull() {
            addCriterion("RENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRenameEqualTo(String value) {
            addCriterion("RENAME =", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotEqualTo(String value) {
            addCriterion("RENAME <>", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameGreaterThan(String value) {
            addCriterion("RENAME >", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameGreaterThanOrEqualTo(String value) {
            addCriterion("RENAME >=", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameLessThan(String value) {
            addCriterion("RENAME <", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameLessThanOrEqualTo(String value) {
            addCriterion("RENAME <=", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameLike(String value) {
            addCriterion("RENAME like", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotLike(String value) {
            addCriterion("RENAME not like", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameIn(List<String> values) {
            addCriterion("RENAME in", values, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotIn(List<String> values) {
            addCriterion("RENAME not in", values, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameBetween(String value1, String value2) {
            addCriterion("RENAME between", value1, value2, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotBetween(String value1, String value2) {
            addCriterion("RENAME not between", value1, value2, "rename");
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