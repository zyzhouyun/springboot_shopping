package com.rocket.dream.shopping.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;


    //加入 offset 起始位置  和 limit 查询页数  用来分页
    protected int offset;

    protected int limit;

    /*
     * 生成 offset 和 limit 的set get 方法
     */
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public BillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBillCodeIsNull() {
            addCriterion("billCode is null");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNotNull() {
            addCriterion("billCode is not null");
            return (Criteria) this;
        }

        public Criteria andBillCodeEqualTo(Integer value) {
            addCriterion("billCode =", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotEqualTo(Integer value) {
            addCriterion("billCode <>", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThan(Integer value) {
            addCriterion("billCode >", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("billCode >=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThan(Integer value) {
            addCriterion("billCode <", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThanOrEqualTo(Integer value) {
            addCriterion("billCode <=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeIn(List<Integer> values) {
            addCriterion("billCode in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotIn(List<Integer> values) {
            addCriterion("billCode not in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeBetween(Integer value1, Integer value2) {
            addCriterion("billCode between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("billCode not between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("userCode is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("userCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(Integer value) {
            addCriterion("userCode =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(Integer value) {
            addCriterion("userCode <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(Integer value) {
            addCriterion("userCode >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userCode >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(Integer value) {
            addCriterion("userCode <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(Integer value) {
            addCriterion("userCode <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<Integer> values) {
            addCriterion("userCode in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<Integer> values) {
            addCriterion("userCode not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(Integer value1, Integer value2) {
            addCriterion("userCode between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("userCode not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("typeId <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andBillNameIsNull() {
            addCriterion("billName is null");
            return (Criteria) this;
        }

        public Criteria andBillNameIsNotNull() {
            addCriterion("billName is not null");
            return (Criteria) this;
        }

        public Criteria andBillNameEqualTo(String value) {
            addCriterion("billName =", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotEqualTo(String value) {
            addCriterion("billName <>", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameGreaterThan(String value) {
            addCriterion("billName >", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameGreaterThanOrEqualTo(String value) {
            addCriterion("billName >=", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLessThan(String value) {
            addCriterion("billName <", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLessThanOrEqualTo(String value) {
            addCriterion("billName <=", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameLike(String value) {
            addCriterion("billName like", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotLike(String value) {
            addCriterion("billName not like", value, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameIn(List<String> values) {
            addCriterion("billName in", values, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotIn(List<String> values) {
            addCriterion("billName not in", values, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameBetween(String value1, String value2) {
            addCriterion("billName between", value1, value2, "billName");
            return (Criteria) this;
        }

        public Criteria andBillNameNotBetween(String value1, String value2) {
            addCriterion("billName not between", value1, value2, "billName");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNull() {
            addCriterion("billState is null");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNotNull() {
            addCriterion("billState is not null");
            return (Criteria) this;
        }

        public Criteria andBillStateEqualTo(Integer value) {
            addCriterion("billState =", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotEqualTo(Integer value) {
            addCriterion("billState <>", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThan(Integer value) {
            addCriterion("billState >", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("billState >=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThan(Integer value) {
            addCriterion("billState <", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThanOrEqualTo(Integer value) {
            addCriterion("billState <=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateIn(List<Integer> values) {
            addCriterion("billState in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotIn(List<Integer> values) {
            addCriterion("billState not in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateBetween(Integer value1, Integer value2) {
            addCriterion("billState between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotBetween(Integer value1, Integer value2) {
            addCriterion("billState not between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBilldescIsNull() {
            addCriterion("billdesc is null");
            return (Criteria) this;
        }

        public Criteria andBilldescIsNotNull() {
            addCriterion("billdesc is not null");
            return (Criteria) this;
        }

        public Criteria andBilldescEqualTo(String value) {
            addCriterion("billdesc =", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotEqualTo(String value) {
            addCriterion("billdesc <>", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescGreaterThan(String value) {
            addCriterion("billdesc >", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescGreaterThanOrEqualTo(String value) {
            addCriterion("billdesc >=", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescLessThan(String value) {
            addCriterion("billdesc <", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescLessThanOrEqualTo(String value) {
            addCriterion("billdesc <=", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescLike(String value) {
            addCriterion("billdesc like", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotLike(String value) {
            addCriterion("billdesc not like", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescIn(List<String> values) {
            addCriterion("billdesc in", values, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotIn(List<String> values) {
            addCriterion("billdesc not in", values, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescBetween(String value1, String value2) {
            addCriterion("billdesc between", value1, value2, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotBetween(String value1, String value2) {
            addCriterion("billdesc not between", value1, value2, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBillImageIsNull() {
            addCriterion("billImage is null");
            return (Criteria) this;
        }

        public Criteria andBillImageIsNotNull() {
            addCriterion("billImage is not null");
            return (Criteria) this;
        }

        public Criteria andBillImageEqualTo(String value) {
            addCriterion("billImage =", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotEqualTo(String value) {
            addCriterion("billImage <>", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageGreaterThan(String value) {
            addCriterion("billImage >", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageGreaterThanOrEqualTo(String value) {
            addCriterion("billImage >=", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageLessThan(String value) {
            addCriterion("billImage <", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageLessThanOrEqualTo(String value) {
            addCriterion("billImage <=", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageLike(String value) {
            addCriterion("billImage like", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotLike(String value) {
            addCriterion("billImage not like", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageIn(List<String> values) {
            addCriterion("billImage in", values, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotIn(List<String> values) {
            addCriterion("billImage not in", values, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageBetween(String value1, String value2) {
            addCriterion("billImage between", value1, value2, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotBetween(String value1, String value2) {
            addCriterion("billImage not between", value1, value2, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNull() {
            addCriterion("billMoney is null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNotNull() {
            addCriterion("billMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyEqualTo(Float value) {
            addCriterion("billMoney =", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotEqualTo(Float value) {
            addCriterion("billMoney <>", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThan(Float value) {
            addCriterion("billMoney >", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("billMoney >=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThan(Float value) {
            addCriterion("billMoney <", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThanOrEqualTo(Float value) {
            addCriterion("billMoney <=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIn(List<Float> values) {
            addCriterion("billMoney in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotIn(List<Float> values) {
            addCriterion("billMoney not in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyBetween(Float value1, Float value2) {
            addCriterion("billMoney between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotBetween(Float value1, Float value2) {
            addCriterion("billMoney not between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andPutawayDateIsNull() {
            addCriterion("putawayDate is null");
            return (Criteria) this;
        }

        public Criteria andPutawayDateIsNotNull() {
            addCriterion("putawayDate is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayDateEqualTo(Date value) {
            addCriterionForJDBCDate("putawayDate =", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("putawayDate <>", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateGreaterThan(Date value) {
            addCriterionForJDBCDate("putawayDate >", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("putawayDate >=", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateLessThan(Date value) {
            addCriterionForJDBCDate("putawayDate <", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("putawayDate <=", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateIn(List<Date> values) {
            addCriterionForJDBCDate("putawayDate in", values, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("putawayDate not in", values, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("putawayDate between", value1, value2, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("putawayDate not between", value1, value2, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNull() {
            addCriterion("downDate is null");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNotNull() {
            addCriterion("downDate is not null");
            return (Criteria) this;
        }

        public Criteria andDownDateEqualTo(Date value) {
            addCriterionForJDBCDate("downDate =", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("downDate <>", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThan(Date value) {
            addCriterionForJDBCDate("downDate >", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("downDate >=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThan(Date value) {
            addCriterionForJDBCDate("downDate <", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("downDate <=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIn(List<Date> values) {
            addCriterionForJDBCDate("downDate in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("downDate not in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("downDate between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("downDate not between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNull() {
            addCriterion("issueDate is null");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNotNull() {
            addCriterion("issueDate is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDateEqualTo(Date value) {
            addCriterionForJDBCDate("issueDate =", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("issueDate <>", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("issueDate >", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("issueDate >=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThan(Date value) {
            addCriterionForJDBCDate("issueDate <", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("issueDate <=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIn(List<Date> values) {
            addCriterionForJDBCDate("issueDate in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("issueDate not in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("issueDate between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("issueDate not between", value1, value2, "issueDate");
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