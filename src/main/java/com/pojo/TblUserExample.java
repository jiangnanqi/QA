package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("USERPASSWORD =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("USERPASSWORD <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("USERPASSWORD >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("USERPASSWORD <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("USERPASSWORD like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("USERPASSWORD not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("USERPASSWORD in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("USERPASSWORD not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("USERPASSWORD between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("USERPASSWORD not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("USEREMAIL =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("USEREMAIL <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("USEREMAIL >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("USEREMAIL >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("USEREMAIL <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("USEREMAIL <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("USEREMAIL like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("USEREMAIL not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("USEREMAIL in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("USEREMAIL not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("USEREMAIL between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("USEREMAIL not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNull() {
            addCriterion("USERBIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNotNull() {
            addCriterion("USERBIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayEqualTo(String value) {
            addCriterion("USERBIRTHDAY =", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotEqualTo(String value) {
            addCriterion("USERBIRTHDAY <>", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThan(String value) {
            addCriterion("USERBIRTHDAY >", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("USERBIRTHDAY >=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThan(String value) {
            addCriterion("USERBIRTHDAY <", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThanOrEqualTo(String value) {
            addCriterion("USERBIRTHDAY <=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLike(String value) {
            addCriterion("USERBIRTHDAY like", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotLike(String value) {
            addCriterion("USERBIRTHDAY not like", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIn(List<String> values) {
            addCriterion("USERBIRTHDAY in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotIn(List<String> values) {
            addCriterion("USERBIRTHDAY not in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayBetween(String value1, String value2) {
            addCriterion("USERBIRTHDAY between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotBetween(String value1, String value2) {
            addCriterion("USERBIRTHDAY not between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("USERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("USERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("USERADDRESS =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("USERADDRESS <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("USERADDRESS >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("USERADDRESS >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("USERADDRESS <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("USERADDRESS <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("USERADDRESS like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("USERADDRESS not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("USERADDRESS in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("USERADDRESS not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("USERADDRESS between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("USERADDRESS not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUsersignatureIsNull() {
            addCriterion("USERSIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andUsersignatureIsNotNull() {
            addCriterion("USERSIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andUsersignatureEqualTo(String value) {
            addCriterion("USERSIGNATURE =", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotEqualTo(String value) {
            addCriterion("USERSIGNATURE <>", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureGreaterThan(String value) {
            addCriterion("USERSIGNATURE >", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureGreaterThanOrEqualTo(String value) {
            addCriterion("USERSIGNATURE >=", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureLessThan(String value) {
            addCriterion("USERSIGNATURE <", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureLessThanOrEqualTo(String value) {
            addCriterion("USERSIGNATURE <=", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureLike(String value) {
            addCriterion("USERSIGNATURE like", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotLike(String value) {
            addCriterion("USERSIGNATURE not like", value, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureIn(List<String> values) {
            addCriterion("USERSIGNATURE in", values, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotIn(List<String> values) {
            addCriterion("USERSIGNATURE not in", values, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureBetween(String value1, String value2) {
            addCriterion("USERSIGNATURE between", value1, value2, "usersignature");
            return (Criteria) this;
        }

        public Criteria andUsersignatureNotBetween(String value1, String value2) {
            addCriterion("USERSIGNATURE not between", value1, value2, "usersignature");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("AVATAR is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("AVATAR is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("AVATAR =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("AVATAR <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("AVATAR >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("AVATAR >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("AVATAR <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("AVATAR <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("AVATAR like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("AVATAR not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("AVATAR in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("AVATAR not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("AVATAR between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("AVATAR not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("USERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("USERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Integer value) {
            addCriterion("USERSTATE =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Integer value) {
            addCriterion("USERSTATE <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Integer value) {
            addCriterion("USERSTATE >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERSTATE >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Integer value) {
            addCriterion("USERSTATE <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Integer value) {
            addCriterion("USERSTATE <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Integer> values) {
            addCriterion("USERSTATE in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Integer> values) {
            addCriterion("USERSTATE not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Integer value1, Integer value2) {
            addCriterion("USERSTATE between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Integer value1, Integer value2) {
            addCriterion("USERSTATE not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeIsNull() {
            addCriterion("VERIFICATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeIsNotNull() {
            addCriterion("VERIFICATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeEqualTo(String value) {
            addCriterion("VERIFICATIONCODE =", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotEqualTo(String value) {
            addCriterion("VERIFICATIONCODE <>", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeGreaterThan(String value) {
            addCriterion("VERIFICATIONCODE >", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFICATIONCODE >=", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeLessThan(String value) {
            addCriterion("VERIFICATIONCODE <", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFICATIONCODE <=", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeLike(String value) {
            addCriterion("VERIFICATIONCODE like", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotLike(String value) {
            addCriterion("VERIFICATIONCODE not like", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeIn(List<String> values) {
            addCriterion("VERIFICATIONCODE in", values, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotIn(List<String> values) {
            addCriterion("VERIFICATIONCODE not in", values, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeBetween(String value1, String value2) {
            addCriterion("VERIFICATIONCODE between", value1, value2, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotBetween(String value1, String value2) {
            addCriterion("VERIFICATIONCODE not between", value1, value2, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andTimeremarksIsNull() {
            addCriterion("TIMEREMARKS is null");
            return (Criteria) this;
        }

        public Criteria andTimeremarksIsNotNull() {
            addCriterion("TIMEREMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andTimeremarksEqualTo(String value) {
            addCriterion("TIMEREMARKS =", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksNotEqualTo(String value) {
            addCriterion("TIMEREMARKS <>", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksGreaterThan(String value) {
            addCriterion("TIMEREMARKS >", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEREMARKS >=", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksLessThan(String value) {
            addCriterion("TIMEREMARKS <", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksLessThanOrEqualTo(String value) {
            addCriterion("TIMEREMARKS <=", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksLike(String value) {
            addCriterion("TIMEREMARKS like", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksNotLike(String value) {
            addCriterion("TIMEREMARKS not like", value, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksIn(List<String> values) {
            addCriterion("TIMEREMARKS in", values, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksNotIn(List<String> values) {
            addCriterion("TIMEREMARKS not in", values, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksBetween(String value1, String value2) {
            addCriterion("TIMEREMARKS between", value1, value2, "timeremarks");
            return (Criteria) this;
        }

        public Criteria andTimeremarksNotBetween(String value1, String value2) {
            addCriterion("TIMEREMARKS not between", value1, value2, "timeremarks");
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