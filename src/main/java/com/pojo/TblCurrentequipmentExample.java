package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblCurrentequipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCurrentequipmentExample() {
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

        public Criteria andEquipmentidIsNull() {
            addCriterion("EQUIPMENTID is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNotNull() {
            addCriterion("EQUIPMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidEqualTo(String value) {
            addCriterion("EQUIPMENTID =", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotEqualTo(String value) {
            addCriterion("EQUIPMENTID <>", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThan(String value) {
            addCriterion("EQUIPMENTID >", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTID >=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThan(String value) {
            addCriterion("EQUIPMENTID <", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTID <=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLike(String value) {
            addCriterion("EQUIPMENTID like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotLike(String value) {
            addCriterion("EQUIPMENTID not like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIn(List<String> values) {
            addCriterion("EQUIPMENTID in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotIn(List<String> values) {
            addCriterion("EQUIPMENTID not in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidBetween(String value1, String value2) {
            addCriterion("EQUIPMENTID between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTID not between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNull() {
            addCriterion("MACADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNotNull() {
            addCriterion("MACADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMacaddressEqualTo(String value) {
            addCriterion("MACADDRESS =", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotEqualTo(String value) {
            addCriterion("MACADDRESS <>", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThan(String value) {
            addCriterion("MACADDRESS >", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThanOrEqualTo(String value) {
            addCriterion("MACADDRESS >=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThan(String value) {
            addCriterion("MACADDRESS <", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThanOrEqualTo(String value) {
            addCriterion("MACADDRESS <=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLike(String value) {
            addCriterion("MACADDRESS like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotLike(String value) {
            addCriterion("MACADDRESS not like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressIn(List<String> values) {
            addCriterion("MACADDRESS in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotIn(List<String> values) {
            addCriterion("MACADDRESS not in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressBetween(String value1, String value2) {
            addCriterion("MACADDRESS between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotBetween(String value1, String value2) {
            addCriterion("MACADDRESS not between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelIsNull() {
            addCriterion("EQUIPMENTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelIsNotNull() {
            addCriterion("EQUIPMENTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL =", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <>", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelGreaterThan(String value) {
            addCriterion("EQUIPMENTMODEL >", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL >=", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelLessThan(String value) {
            addCriterion("EQUIPMENTMODEL <", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <=", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelLike(String value) {
            addCriterion("EQUIPMENTMODEL like", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotLike(String value) {
            addCriterion("EQUIPMENTMODEL not like", value, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL in", values, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL not in", values, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL between", value1, value2, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmentmodelNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL not between", value1, value2, "equipmentmodel");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeIsNull() {
            addCriterion("EQUIPMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeIsNotNull() {
            addCriterion("EQUIPMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeEqualTo(String value) {
            addCriterion("EQUIPMENTTIME =", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeNotEqualTo(String value) {
            addCriterion("EQUIPMENTTIME <>", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeGreaterThan(String value) {
            addCriterion("EQUIPMENTTIME >", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTTIME >=", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeLessThan(String value) {
            addCriterion("EQUIPMENTTIME <", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTTIME <=", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeLike(String value) {
            addCriterion("EQUIPMENTTIME like", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeNotLike(String value) {
            addCriterion("EQUIPMENTTIME not like", value, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeIn(List<String> values) {
            addCriterion("EQUIPMENTTIME in", values, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeNotIn(List<String> values) {
            addCriterion("EQUIPMENTTIME not in", values, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeBetween(String value1, String value2) {
            addCriterion("EQUIPMENTTIME between", value1, value2, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andEquipmenttimeNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTTIME not between", value1, value2, "equipmenttime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("CPU is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("CPU is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(String value) {
            addCriterion("CPU =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(String value) {
            addCriterion("CPU <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(String value) {
            addCriterion("CPU >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(String value) {
            addCriterion("CPU >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(String value) {
            addCriterion("CPU <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(String value) {
            addCriterion("CPU <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLike(String value) {
            addCriterion("CPU like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotLike(String value) {
            addCriterion("CPU not like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<String> values) {
            addCriterion("CPU in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<String> values) {
            addCriterion("CPU not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(String value1, String value2) {
            addCriterion("CPU between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(String value1, String value2) {
            addCriterion("CPU not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andRamIsNull() {
            addCriterion("RAM is null");
            return (Criteria) this;
        }

        public Criteria andRamIsNotNull() {
            addCriterion("RAM is not null");
            return (Criteria) this;
        }

        public Criteria andRamEqualTo(String value) {
            addCriterion("RAM =", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotEqualTo(String value) {
            addCriterion("RAM <>", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThan(String value) {
            addCriterion("RAM >", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThanOrEqualTo(String value) {
            addCriterion("RAM >=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThan(String value) {
            addCriterion("RAM <", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThanOrEqualTo(String value) {
            addCriterion("RAM <=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLike(String value) {
            addCriterion("RAM like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotLike(String value) {
            addCriterion("RAM not like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamIn(List<String> values) {
            addCriterion("RAM in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotIn(List<String> values) {
            addCriterion("RAM not in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamBetween(String value1, String value2) {
            addCriterion("RAM between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotBetween(String value1, String value2) {
            addCriterion("RAM not between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andHarddriverIsNull() {
            addCriterion("HARDDRIVER is null");
            return (Criteria) this;
        }

        public Criteria andHarddriverIsNotNull() {
            addCriterion("HARDDRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andHarddriverEqualTo(String value) {
            addCriterion("HARDDRIVER =", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverNotEqualTo(String value) {
            addCriterion("HARDDRIVER <>", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverGreaterThan(String value) {
            addCriterion("HARDDRIVER >", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverGreaterThanOrEqualTo(String value) {
            addCriterion("HARDDRIVER >=", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverLessThan(String value) {
            addCriterion("HARDDRIVER <", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverLessThanOrEqualTo(String value) {
            addCriterion("HARDDRIVER <=", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverLike(String value) {
            addCriterion("HARDDRIVER like", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverNotLike(String value) {
            addCriterion("HARDDRIVER not like", value, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverIn(List<String> values) {
            addCriterion("HARDDRIVER in", values, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverNotIn(List<String> values) {
            addCriterion("HARDDRIVER not in", values, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverBetween(String value1, String value2) {
            addCriterion("HARDDRIVER between", value1, value2, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddriverNotBetween(String value1, String value2) {
            addCriterion("HARDDRIVER not between", value1, value2, "harddriver");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelIsNull() {
            addCriterion("HARDDRIVERMODEL is null");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelIsNotNull() {
            addCriterion("HARDDRIVERMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL =", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelNotEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL <>", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelGreaterThan(String value) {
            addCriterion("HARDDRIVERMODEL >", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelGreaterThanOrEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL >=", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelLessThan(String value) {
            addCriterion("HARDDRIVERMODEL <", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelLessThanOrEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL <=", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelLike(String value) {
            addCriterion("HARDDRIVERMODEL like", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelNotLike(String value) {
            addCriterion("HARDDRIVERMODEL not like", value, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelIn(List<String> values) {
            addCriterion("HARDDRIVERMODEL in", values, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelNotIn(List<String> values) {
            addCriterion("HARDDRIVERMODEL not in", values, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelBetween(String value1, String value2) {
            addCriterion("HARDDRIVERMODEL between", value1, value2, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andHarddrivermodelNotBetween(String value1, String value2) {
            addCriterion("HARDDRIVERMODEL not between", value1, value2, "harddrivermodel");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("STORAGE is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("STORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("STORAGE =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("STORAGE <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("STORAGE >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("STORAGE <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("STORAGE <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("STORAGE like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("STORAGE not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("STORAGE in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("STORAGE not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("STORAGE between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("STORAGE not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andNetworkcardIsNull() {
            addCriterion("NETWORKCARD is null");
            return (Criteria) this;
        }

        public Criteria andNetworkcardIsNotNull() {
            addCriterion("NETWORKCARD is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkcardEqualTo(String value) {
            addCriterion("NETWORKCARD =", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotEqualTo(String value) {
            addCriterion("NETWORKCARD <>", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardGreaterThan(String value) {
            addCriterion("NETWORKCARD >", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORKCARD >=", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardLessThan(String value) {
            addCriterion("NETWORKCARD <", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardLessThanOrEqualTo(String value) {
            addCriterion("NETWORKCARD <=", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardLike(String value) {
            addCriterion("NETWORKCARD like", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotLike(String value) {
            addCriterion("NETWORKCARD not like", value, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardIn(List<String> values) {
            addCriterion("NETWORKCARD in", values, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotIn(List<String> values) {
            addCriterion("NETWORKCARD not in", values, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardBetween(String value1, String value2) {
            addCriterion("NETWORKCARD between", value1, value2, "networkcard");
            return (Criteria) this;
        }

        public Criteria andNetworkcardNotBetween(String value1, String value2) {
            addCriterion("NETWORKCARD not between", value1, value2, "networkcard");
            return (Criteria) this;
        }

        public Criteria andMotherboardIsNull() {
            addCriterion("MOTHERBOARD is null");
            return (Criteria) this;
        }

        public Criteria andMotherboardIsNotNull() {
            addCriterion("MOTHERBOARD is not null");
            return (Criteria) this;
        }

        public Criteria andMotherboardEqualTo(String value) {
            addCriterion("MOTHERBOARD =", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotEqualTo(String value) {
            addCriterion("MOTHERBOARD <>", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardGreaterThan(String value) {
            addCriterion("MOTHERBOARD >", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardGreaterThanOrEqualTo(String value) {
            addCriterion("MOTHERBOARD >=", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardLessThan(String value) {
            addCriterion("MOTHERBOARD <", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardLessThanOrEqualTo(String value) {
            addCriterion("MOTHERBOARD <=", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardLike(String value) {
            addCriterion("MOTHERBOARD like", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotLike(String value) {
            addCriterion("MOTHERBOARD not like", value, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardIn(List<String> values) {
            addCriterion("MOTHERBOARD in", values, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotIn(List<String> values) {
            addCriterion("MOTHERBOARD not in", values, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardBetween(String value1, String value2) {
            addCriterion("MOTHERBOARD between", value1, value2, "motherboard");
            return (Criteria) this;
        }

        public Criteria andMotherboardNotBetween(String value1, String value2) {
            addCriterion("MOTHERBOARD not between", value1, value2, "motherboard");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNull() {
            addCriterion("OSNAME is null");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNotNull() {
            addCriterion("OSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOsnameEqualTo(String value) {
            addCriterion("OSNAME =", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotEqualTo(String value) {
            addCriterion("OSNAME <>", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThan(String value) {
            addCriterion("OSNAME >", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThanOrEqualTo(String value) {
            addCriterion("OSNAME >=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThan(String value) {
            addCriterion("OSNAME <", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThanOrEqualTo(String value) {
            addCriterion("OSNAME <=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLike(String value) {
            addCriterion("OSNAME like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotLike(String value) {
            addCriterion("OSNAME not like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameIn(List<String> values) {
            addCriterion("OSNAME in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotIn(List<String> values) {
            addCriterion("OSNAME not in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameBetween(String value1, String value2) {
            addCriterion("OSNAME between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotBetween(String value1, String value2) {
            addCriterion("OSNAME not between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNull() {
            addCriterion("OSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNotNull() {
            addCriterion("OSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOstypeEqualTo(String value) {
            addCriterion("OSTYPE =", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotEqualTo(String value) {
            addCriterion("OSTYPE <>", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThan(String value) {
            addCriterion("OSTYPE >", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThanOrEqualTo(String value) {
            addCriterion("OSTYPE >=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThan(String value) {
            addCriterion("OSTYPE <", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThanOrEqualTo(String value) {
            addCriterion("OSTYPE <=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLike(String value) {
            addCriterion("OSTYPE like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotLike(String value) {
            addCriterion("OSTYPE not like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeIn(List<String> values) {
            addCriterion("OSTYPE in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotIn(List<String> values) {
            addCriterion("OSTYPE not in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeBetween(String value1, String value2) {
            addCriterion("OSTYPE between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotBetween(String value1, String value2) {
            addCriterion("OSTYPE not between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNull() {
            addCriterion("OSVERSION is null");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNotNull() {
            addCriterion("OSVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionEqualTo(String value) {
            addCriterion("OSVERSION =", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotEqualTo(String value) {
            addCriterion("OSVERSION <>", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThan(String value) {
            addCriterion("OSVERSION >", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThanOrEqualTo(String value) {
            addCriterion("OSVERSION >=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThan(String value) {
            addCriterion("OSVERSION <", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThanOrEqualTo(String value) {
            addCriterion("OSVERSION <=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLike(String value) {
            addCriterion("OSVERSION like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotLike(String value) {
            addCriterion("OSVERSION not like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionIn(List<String> values) {
            addCriterion("OSVERSION in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotIn(List<String> values) {
            addCriterion("OSVERSION not in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionBetween(String value1, String value2) {
            addCriterion("OSVERSION between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotBetween(String value1, String value2) {
            addCriterion("OSVERSION not between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsidIsNull() {
            addCriterion("OSID is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("OSID is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(String value) {
            addCriterion("OSID =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(String value) {
            addCriterion("OSID <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(String value) {
            addCriterion("OSID >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(String value) {
            addCriterion("OSID >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(String value) {
            addCriterion("OSID <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(String value) {
            addCriterion("OSID <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLike(String value) {
            addCriterion("OSID like", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotLike(String value) {
            addCriterion("OSID not like", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<String> values) {
            addCriterion("OSID in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<String> values) {
            addCriterion("OSID not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(String value1, String value2) {
            addCriterion("OSID between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(String value1, String value2) {
            addCriterion("OSID not between", value1, value2, "osid");
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

        public Criteria andGraphiccardIsNull() {
            addCriterion("GRAPHICCARD is null");
            return (Criteria) this;
        }

        public Criteria andGraphiccardIsNotNull() {
            addCriterion("GRAPHICCARD is not null");
            return (Criteria) this;
        }

        public Criteria andGraphiccardEqualTo(String value) {
            addCriterion("GRAPHICCARD =", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotEqualTo(String value) {
            addCriterion("GRAPHICCARD <>", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardGreaterThan(String value) {
            addCriterion("GRAPHICCARD >", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardGreaterThanOrEqualTo(String value) {
            addCriterion("GRAPHICCARD >=", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardLessThan(String value) {
            addCriterion("GRAPHICCARD <", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardLessThanOrEqualTo(String value) {
            addCriterion("GRAPHICCARD <=", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardLike(String value) {
            addCriterion("GRAPHICCARD like", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotLike(String value) {
            addCriterion("GRAPHICCARD not like", value, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardIn(List<String> values) {
            addCriterion("GRAPHICCARD in", values, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotIn(List<String> values) {
            addCriterion("GRAPHICCARD not in", values, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardBetween(String value1, String value2) {
            addCriterion("GRAPHICCARD between", value1, value2, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andGraphiccardNotBetween(String value1, String value2) {
            addCriterion("GRAPHICCARD not between", value1, value2, "graphiccard");
            return (Criteria) this;
        }

        public Criteria andAudiocardIsNull() {
            addCriterion("AUDIOCARD is null");
            return (Criteria) this;
        }

        public Criteria andAudiocardIsNotNull() {
            addCriterion("AUDIOCARD is not null");
            return (Criteria) this;
        }

        public Criteria andAudiocardEqualTo(String value) {
            addCriterion("AUDIOCARD =", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotEqualTo(String value) {
            addCriterion("AUDIOCARD <>", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardGreaterThan(String value) {
            addCriterion("AUDIOCARD >", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIOCARD >=", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardLessThan(String value) {
            addCriterion("AUDIOCARD <", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardLessThanOrEqualTo(String value) {
            addCriterion("AUDIOCARD <=", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardLike(String value) {
            addCriterion("AUDIOCARD like", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotLike(String value) {
            addCriterion("AUDIOCARD not like", value, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardIn(List<String> values) {
            addCriterion("AUDIOCARD in", values, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotIn(List<String> values) {
            addCriterion("AUDIOCARD not in", values, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardBetween(String value1, String value2) {
            addCriterion("AUDIOCARD between", value1, value2, "audiocard");
            return (Criteria) this;
        }

        public Criteria andAudiocardNotBetween(String value1, String value2) {
            addCriterion("AUDIOCARD not between", value1, value2, "audiocard");
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