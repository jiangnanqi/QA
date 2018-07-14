package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblFaqclassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblFaqclassifyExample() {
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

        public Criteria andFaqclassifynameIsNull() {
            addCriterion("FAQCLASSIFYNAME is null");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameIsNotNull() {
            addCriterion("FAQCLASSIFYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME =", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameNotEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME <>", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameGreaterThan(String value) {
            addCriterion("FAQCLASSIFYNAME >", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameGreaterThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME >=", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameLessThan(String value) {
            addCriterion("FAQCLASSIFYNAME <", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameLessThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME <=", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameLike(String value) {
            addCriterion("FAQCLASSIFYNAME like", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameNotLike(String value) {
            addCriterion("FAQCLASSIFYNAME not like", value, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameIn(List<String> values) {
            addCriterion("FAQCLASSIFYNAME in", values, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameNotIn(List<String> values) {
            addCriterion("FAQCLASSIFYNAME not in", values, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYNAME between", value1, value2, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqclassifynameNotBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYNAME not between", value1, value2, "faqclassifyname");
            return (Criteria) this;
        }

        public Criteria andFaqparentidIsNull() {
            addCriterion("FAQPARENTID is null");
            return (Criteria) this;
        }

        public Criteria andFaqparentidIsNotNull() {
            addCriterion("FAQPARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andFaqparentidEqualTo(String value) {
            addCriterion("FAQPARENTID =", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidNotEqualTo(String value) {
            addCriterion("FAQPARENTID <>", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidGreaterThan(String value) {
            addCriterion("FAQPARENTID >", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidGreaterThanOrEqualTo(String value) {
            addCriterion("FAQPARENTID >=", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidLessThan(String value) {
            addCriterion("FAQPARENTID <", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidLessThanOrEqualTo(String value) {
            addCriterion("FAQPARENTID <=", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidLike(String value) {
            addCriterion("FAQPARENTID like", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidNotLike(String value) {
            addCriterion("FAQPARENTID not like", value, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidIn(List<String> values) {
            addCriterion("FAQPARENTID in", values, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidNotIn(List<String> values) {
            addCriterion("FAQPARENTID not in", values, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidBetween(String value1, String value2) {
            addCriterion("FAQPARENTID between", value1, value2, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqparentidNotBetween(String value1, String value2) {
            addCriterion("FAQPARENTID not between", value1, value2, "faqparentid");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageIsNull() {
            addCriterion("FAQCLASSIFYIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageIsNotNull() {
            addCriterion("FAQCLASSIFYIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE =", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageNotEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE <>", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageGreaterThan(String value) {
            addCriterion("FAQCLASSIFYIMAGE >", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageGreaterThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE >=", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageLessThan(String value) {
            addCriterion("FAQCLASSIFYIMAGE <", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageLessThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE <=", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageLike(String value) {
            addCriterion("FAQCLASSIFYIMAGE like", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageNotLike(String value) {
            addCriterion("FAQCLASSIFYIMAGE not like", value, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageIn(List<String> values) {
            addCriterion("FAQCLASSIFYIMAGE in", values, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageNotIn(List<String> values) {
            addCriterion("FAQCLASSIFYIMAGE not in", values, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYIMAGE between", value1, value2, "faqclassifyimage");
            return (Criteria) this;
        }

        public Criteria andFaqclassifyimageNotBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYIMAGE not between", value1, value2, "faqclassifyimage");
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