package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblServerExample() {
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

        public Criteria andComputernameIsNull() {
            addCriterion("COMPUTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andComputernameIsNotNull() {
            addCriterion("COMPUTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andComputernameEqualTo(String value) {
            addCriterion("COMPUTERNAME =", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameNotEqualTo(String value) {
            addCriterion("COMPUTERNAME <>", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameGreaterThan(String value) {
            addCriterion("COMPUTERNAME >", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPUTERNAME >=", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameLessThan(String value) {
            addCriterion("COMPUTERNAME <", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameLessThanOrEqualTo(String value) {
            addCriterion("COMPUTERNAME <=", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameLike(String value) {
            addCriterion("COMPUTERNAME like", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameNotLike(String value) {
            addCriterion("COMPUTERNAME not like", value, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameIn(List<String> values) {
            addCriterion("COMPUTERNAME in", values, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameNotIn(List<String> values) {
            addCriterion("COMPUTERNAME not in", values, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameBetween(String value1, String value2) {
            addCriterion("COMPUTERNAME between", value1, value2, "computername");
            return (Criteria) this;
        }

        public Criteria andComputernameNotBetween(String value1, String value2) {
            addCriterion("COMPUTERNAME not between", value1, value2, "computername");
            return (Criteria) this;
        }

        public Criteria andPciIsNull() {
            addCriterion("PCI is null");
            return (Criteria) this;
        }

        public Criteria andPciIsNotNull() {
            addCriterion("PCI is not null");
            return (Criteria) this;
        }

        public Criteria andPciEqualTo(String value) {
            addCriterion("PCI =", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotEqualTo(String value) {
            addCriterion("PCI <>", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThan(String value) {
            addCriterion("PCI >", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThanOrEqualTo(String value) {
            addCriterion("PCI >=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThan(String value) {
            addCriterion("PCI <", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThanOrEqualTo(String value) {
            addCriterion("PCI <=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLike(String value) {
            addCriterion("PCI like", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotLike(String value) {
            addCriterion("PCI not like", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciIn(List<String> values) {
            addCriterion("PCI in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotIn(List<String> values) {
            addCriterion("PCI not in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciBetween(String value1, String value2) {
            addCriterion("PCI between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotBetween(String value1, String value2) {
            addCriterion("PCI not between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andUsbIsNull() {
            addCriterion("USB is null");
            return (Criteria) this;
        }

        public Criteria andUsbIsNotNull() {
            addCriterion("USB is not null");
            return (Criteria) this;
        }

        public Criteria andUsbEqualTo(String value) {
            addCriterion("USB =", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotEqualTo(String value) {
            addCriterion("USB <>", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbGreaterThan(String value) {
            addCriterion("USB >", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbGreaterThanOrEqualTo(String value) {
            addCriterion("USB >=", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbLessThan(String value) {
            addCriterion("USB <", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbLessThanOrEqualTo(String value) {
            addCriterion("USB <=", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbLike(String value) {
            addCriterion("USB like", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotLike(String value) {
            addCriterion("USB not like", value, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbIn(List<String> values) {
            addCriterion("USB in", values, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotIn(List<String> values) {
            addCriterion("USB not in", values, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbBetween(String value1, String value2) {
            addCriterion("USB between", value1, value2, "usb");
            return (Criteria) this;
        }

        public Criteria andUsbNotBetween(String value1, String value2) {
            addCriterion("USB not between", value1, value2, "usb");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseIsNull() {
            addCriterion("RAM_EXCHANGEAREAUSE is null");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseIsNotNull() {
            addCriterion("RAM_EXCHANGEAREAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE =", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseNotEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE <>", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseGreaterThan(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE >", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseGreaterThanOrEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE >=", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseLessThan(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE <", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseLessThanOrEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE <=", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseLike(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE like", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseNotLike(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE not like", value, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseIn(List<String> values) {
            addCriterion("RAM_EXCHANGEAREAUSE in", values, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseNotIn(List<String> values) {
            addCriterion("RAM_EXCHANGEAREAUSE not in", values, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseBetween(String value1, String value2) {
            addCriterion("RAM_EXCHANGEAREAUSE between", value1, value2, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andRamExchangeareauseNotBetween(String value1, String value2) {
            addCriterion("RAM_EXCHANGEAREAUSE not between", value1, value2, "ramExchangeareause");
            return (Criteria) this;
        }

        public Criteria andPartationuseIsNull() {
            addCriterion("PARTATIONUSE is null");
            return (Criteria) this;
        }

        public Criteria andPartationuseIsNotNull() {
            addCriterion("PARTATIONUSE is not null");
            return (Criteria) this;
        }

        public Criteria andPartationuseEqualTo(String value) {
            addCriterion("PARTATIONUSE =", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseNotEqualTo(String value) {
            addCriterion("PARTATIONUSE <>", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseGreaterThan(String value) {
            addCriterion("PARTATIONUSE >", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseGreaterThanOrEqualTo(String value) {
            addCriterion("PARTATIONUSE >=", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseLessThan(String value) {
            addCriterion("PARTATIONUSE <", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseLessThanOrEqualTo(String value) {
            addCriterion("PARTATIONUSE <=", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseLike(String value) {
            addCriterion("PARTATIONUSE like", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseNotLike(String value) {
            addCriterion("PARTATIONUSE not like", value, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseIn(List<String> values) {
            addCriterion("PARTATIONUSE in", values, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseNotIn(List<String> values) {
            addCriterion("PARTATIONUSE not in", values, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseBetween(String value1, String value2) {
            addCriterion("PARTATIONUSE between", value1, value2, "partationuse");
            return (Criteria) this;
        }

        public Criteria andPartationuseNotBetween(String value1, String value2) {
            addCriterion("PARTATIONUSE not between", value1, value2, "partationuse");
            return (Criteria) this;
        }

        public Criteria andIdleramIsNull() {
            addCriterion("IDLERAM is null");
            return (Criteria) this;
        }

        public Criteria andIdleramIsNotNull() {
            addCriterion("IDLERAM is not null");
            return (Criteria) this;
        }

        public Criteria andIdleramEqualTo(String value) {
            addCriterion("IDLERAM =", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramNotEqualTo(String value) {
            addCriterion("IDLERAM <>", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramGreaterThan(String value) {
            addCriterion("IDLERAM >", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramGreaterThanOrEqualTo(String value) {
            addCriterion("IDLERAM >=", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramLessThan(String value) {
            addCriterion("IDLERAM <", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramLessThanOrEqualTo(String value) {
            addCriterion("IDLERAM <=", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramLike(String value) {
            addCriterion("IDLERAM like", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramNotLike(String value) {
            addCriterion("IDLERAM not like", value, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramIn(List<String> values) {
            addCriterion("IDLERAM in", values, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramNotIn(List<String> values) {
            addCriterion("IDLERAM not in", values, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramBetween(String value1, String value2) {
            addCriterion("IDLERAM between", value1, value2, "idleram");
            return (Criteria) this;
        }

        public Criteria andIdleramNotBetween(String value1, String value2) {
            addCriterion("IDLERAM not between", value1, value2, "idleram");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadIsNull() {
            addCriterion("OS_TIME_USERNUM_LOAD is null");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadIsNotNull() {
            addCriterion("OS_TIME_USERNUM_LOAD is not null");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD =", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadNotEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD <>", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadGreaterThan(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD >", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadGreaterThanOrEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD >=", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadLessThan(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD <", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadLessThanOrEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD <=", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadLike(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD like", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadNotLike(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD not like", value, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadIn(List<String> values) {
            addCriterion("OS_TIME_USERNUM_LOAD in", values, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadNotIn(List<String> values) {
            addCriterion("OS_TIME_USERNUM_LOAD not in", values, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadBetween(String value1, String value2) {
            addCriterion("OS_TIME_USERNUM_LOAD between", value1, value2, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsTimeUsernumLoadNotBetween(String value1, String value2) {
            addCriterion("OS_TIME_USERNUM_LOAD not between", value1, value2, "osTimeUsernumLoad");
            return (Criteria) this;
        }

        public Criteria andOsloadIsNull() {
            addCriterion("OSLOAD is null");
            return (Criteria) this;
        }

        public Criteria andOsloadIsNotNull() {
            addCriterion("OSLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andOsloadEqualTo(String value) {
            addCriterion("OSLOAD =", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadNotEqualTo(String value) {
            addCriterion("OSLOAD <>", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadGreaterThan(String value) {
            addCriterion("OSLOAD >", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadGreaterThanOrEqualTo(String value) {
            addCriterion("OSLOAD >=", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadLessThan(String value) {
            addCriterion("OSLOAD <", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadLessThanOrEqualTo(String value) {
            addCriterion("OSLOAD <=", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadLike(String value) {
            addCriterion("OSLOAD like", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadNotLike(String value) {
            addCriterion("OSLOAD not like", value, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadIn(List<String> values) {
            addCriterion("OSLOAD in", values, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadNotIn(List<String> values) {
            addCriterion("OSLOAD not in", values, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadBetween(String value1, String value2) {
            addCriterion("OSLOAD between", value1, value2, "osload");
            return (Criteria) this;
        }

        public Criteria andOsloadNotBetween(String value1, String value2) {
            addCriterion("OSLOAD not between", value1, value2, "osload");
            return (Criteria) this;
        }

        public Criteria andFirewallIsNull() {
            addCriterion("FIREWALL is null");
            return (Criteria) this;
        }

        public Criteria andFirewallIsNotNull() {
            addCriterion("FIREWALL is not null");
            return (Criteria) this;
        }

        public Criteria andFirewallEqualTo(String value) {
            addCriterion("FIREWALL =", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotEqualTo(String value) {
            addCriterion("FIREWALL <>", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallGreaterThan(String value) {
            addCriterion("FIREWALL >", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallGreaterThanOrEqualTo(String value) {
            addCriterion("FIREWALL >=", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallLessThan(String value) {
            addCriterion("FIREWALL <", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallLessThanOrEqualTo(String value) {
            addCriterion("FIREWALL <=", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallLike(String value) {
            addCriterion("FIREWALL like", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotLike(String value) {
            addCriterion("FIREWALL not like", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallIn(List<String> values) {
            addCriterion("FIREWALL in", values, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotIn(List<String> values) {
            addCriterion("FIREWALL not in", values, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallBetween(String value1, String value2) {
            addCriterion("FIREWALL between", value1, value2, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotBetween(String value1, String value2) {
            addCriterion("FIREWALL not between", value1, value2, "firewall");
            return (Criteria) this;
        }

        public Criteria andRoutingtableIsNull() {
            addCriterion("ROUTINGTABLE is null");
            return (Criteria) this;
        }

        public Criteria andRoutingtableIsNotNull() {
            addCriterion("ROUTINGTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingtableEqualTo(String value) {
            addCriterion("ROUTINGTABLE =", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableNotEqualTo(String value) {
            addCriterion("ROUTINGTABLE <>", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableGreaterThan(String value) {
            addCriterion("ROUTINGTABLE >", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTINGTABLE >=", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableLessThan(String value) {
            addCriterion("ROUTINGTABLE <", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableLessThanOrEqualTo(String value) {
            addCriterion("ROUTINGTABLE <=", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableLike(String value) {
            addCriterion("ROUTINGTABLE like", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableNotLike(String value) {
            addCriterion("ROUTINGTABLE not like", value, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableIn(List<String> values) {
            addCriterion("ROUTINGTABLE in", values, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableNotIn(List<String> values) {
            addCriterion("ROUTINGTABLE not in", values, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableBetween(String value1, String value2) {
            addCriterion("ROUTINGTABLE between", value1, value2, "routingtable");
            return (Criteria) this;
        }

        public Criteria andRoutingtableNotBetween(String value1, String value2) {
            addCriterion("ROUTINGTABLE not between", value1, value2, "routingtable");
            return (Criteria) this;
        }

        public Criteria andHascontactIsNull() {
            addCriterion("HASCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andHascontactIsNotNull() {
            addCriterion("HASCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andHascontactEqualTo(String value) {
            addCriterion("HASCONTACT =", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactNotEqualTo(String value) {
            addCriterion("HASCONTACT <>", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactGreaterThan(String value) {
            addCriterion("HASCONTACT >", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactGreaterThanOrEqualTo(String value) {
            addCriterion("HASCONTACT >=", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactLessThan(String value) {
            addCriterion("HASCONTACT <", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactLessThanOrEqualTo(String value) {
            addCriterion("HASCONTACT <=", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactLike(String value) {
            addCriterion("HASCONTACT like", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactNotLike(String value) {
            addCriterion("HASCONTACT not like", value, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactIn(List<String> values) {
            addCriterion("HASCONTACT in", values, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactNotIn(List<String> values) {
            addCriterion("HASCONTACT not in", values, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactBetween(String value1, String value2) {
            addCriterion("HASCONTACT between", value1, value2, "hascontact");
            return (Criteria) this;
        }

        public Criteria andHascontactNotBetween(String value1, String value2) {
            addCriterion("HASCONTACT not between", value1, value2, "hascontact");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNull() {
            addCriterion("NETWORK is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNotNull() {
            addCriterion("NETWORK is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkEqualTo(String value) {
            addCriterion("NETWORK =", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotEqualTo(String value) {
            addCriterion("NETWORK <>", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThan(String value) {
            addCriterion("NETWORK >", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK >=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThan(String value) {
            addCriterion("NETWORK <", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThanOrEqualTo(String value) {
            addCriterion("NETWORK <=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLike(String value) {
            addCriterion("NETWORK like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotLike(String value) {
            addCriterion("NETWORK not like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkIn(List<String> values) {
            addCriterion("NETWORK in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotIn(List<String> values) {
            addCriterion("NETWORK not in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkBetween(String value1, String value2) {
            addCriterion("NETWORK between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotBetween(String value1, String value2) {
            addCriterion("NETWORK not between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("PROCESS =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("PROCESS <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("PROCESS >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("PROCESS <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("PROCESS <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("PROCESS like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("PROCESS not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("PROCESS in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("PROCESS not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("PROCESS between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("PROCESS not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessIsNull() {
            addCriterion("REALTIMEPROCESS is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessIsNotNull() {
            addCriterion("REALTIMEPROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessEqualTo(String value) {
            addCriterion("REALTIMEPROCESS =", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessNotEqualTo(String value) {
            addCriterion("REALTIMEPROCESS <>", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessGreaterThan(String value) {
            addCriterion("REALTIMEPROCESS >", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessGreaterThanOrEqualTo(String value) {
            addCriterion("REALTIMEPROCESS >=", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessLessThan(String value) {
            addCriterion("REALTIMEPROCESS <", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessLessThanOrEqualTo(String value) {
            addCriterion("REALTIMEPROCESS <=", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessLike(String value) {
            addCriterion("REALTIMEPROCESS like", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessNotLike(String value) {
            addCriterion("REALTIMEPROCESS not like", value, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessIn(List<String> values) {
            addCriterion("REALTIMEPROCESS in", values, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessNotIn(List<String> values) {
            addCriterion("REALTIMEPROCESS not in", values, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessBetween(String value1, String value2) {
            addCriterion("REALTIMEPROCESS between", value1, value2, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andRealtimeprocessNotBetween(String value1, String value2) {
            addCriterion("REALTIMEPROCESS not between", value1, value2, "realtimeprocess");
            return (Criteria) this;
        }

        public Criteria andActiveuserIsNull() {
            addCriterion("ACTIVEUSER is null");
            return (Criteria) this;
        }

        public Criteria andActiveuserIsNotNull() {
            addCriterion("ACTIVEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andActiveuserEqualTo(String value) {
            addCriterion("ACTIVEUSER =", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotEqualTo(String value) {
            addCriterion("ACTIVEUSER <>", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserGreaterThan(String value) {
            addCriterion("ACTIVEUSER >", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVEUSER >=", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserLessThan(String value) {
            addCriterion("ACTIVEUSER <", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserLessThanOrEqualTo(String value) {
            addCriterion("ACTIVEUSER <=", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserLike(String value) {
            addCriterion("ACTIVEUSER like", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotLike(String value) {
            addCriterion("ACTIVEUSER not like", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserIn(List<String> values) {
            addCriterion("ACTIVEUSER in", values, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotIn(List<String> values) {
            addCriterion("ACTIVEUSER not in", values, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserBetween(String value1, String value2) {
            addCriterion("ACTIVEUSER between", value1, value2, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotBetween(String value1, String value2) {
            addCriterion("ACTIVEUSER not between", value1, value2, "activeuser");
            return (Criteria) this;
        }

        public Criteria andBiosIsNull() {
            addCriterion("BIOS is null");
            return (Criteria) this;
        }

        public Criteria andBiosIsNotNull() {
            addCriterion("BIOS is not null");
            return (Criteria) this;
        }

        public Criteria andBiosEqualTo(String value) {
            addCriterion("BIOS =", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotEqualTo(String value) {
            addCriterion("BIOS <>", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosGreaterThan(String value) {
            addCriterion("BIOS >", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosGreaterThanOrEqualTo(String value) {
            addCriterion("BIOS >=", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosLessThan(String value) {
            addCriterion("BIOS <", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosLessThanOrEqualTo(String value) {
            addCriterion("BIOS <=", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosLike(String value) {
            addCriterion("BIOS like", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotLike(String value) {
            addCriterion("BIOS not like", value, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosIn(List<String> values) {
            addCriterion("BIOS in", values, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotIn(List<String> values) {
            addCriterion("BIOS not in", values, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosBetween(String value1, String value2) {
            addCriterion("BIOS between", value1, value2, "bios");
            return (Criteria) this;
        }

        public Criteria andBiosNotBetween(String value1, String value2) {
            addCriterion("BIOS not between", value1, value2, "bios");
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