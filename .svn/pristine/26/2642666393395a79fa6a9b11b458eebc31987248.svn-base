package com.rocket.dream.shopping.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyExample() {
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

        public Criteria andBuyIdIsNull() {
            addCriterion("buyId is null");
            return (Criteria) this;
        }

        public Criteria andBuyIdIsNotNull() {
            addCriterion("buyId is not null");
            return (Criteria) this;
        }

        public Criteria andBuyIdEqualTo(Integer value) {
            addCriterion("buyId =", value, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdNotEqualTo(Integer value) {
            addCriterion("buyId <>", value, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdGreaterThan(Integer value) {
            addCriterion("buyId >", value, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyId >=", value, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdLessThan(Integer value) {
            addCriterion("buyId <", value, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyId <=", value, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdIn(List<Integer> values) {
            addCriterion("buyId in", values, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdNotIn(List<Integer> values) {
            addCriterion("buyId not in", values, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdBetween(Integer value1, Integer value2) {
            addCriterion("buyId between", value1, value2, "buyId");
            return (Criteria) this;
        }

        public Criteria andBuyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyId not between", value1, value2, "buyId");
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

        public Criteria andBuyInfoIsNull() {
            addCriterion("buyInfo is null");
            return (Criteria) this;
        }

        public Criteria andBuyInfoIsNotNull() {
            addCriterion("buyInfo is not null");
            return (Criteria) this;
        }

        public Criteria andBuyInfoEqualTo(String value) {
            addCriterion("buyInfo =", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNotEqualTo(String value) {
            addCriterion("buyInfo <>", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoGreaterThan(String value) {
            addCriterion("buyInfo >", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("buyInfo >=", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoLessThan(String value) {
            addCriterion("buyInfo <", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoLessThanOrEqualTo(String value) {
            addCriterion("buyInfo <=", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoLike(String value) {
            addCriterion("buyInfo like", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNotLike(String value) {
            addCriterion("buyInfo not like", value, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoIn(List<String> values) {
            addCriterion("buyInfo in", values, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNotIn(List<String> values) {
            addCriterion("buyInfo not in", values, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoBetween(String value1, String value2) {
            addCriterion("buyInfo between", value1, value2, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyInfoNotBetween(String value1, String value2) {
            addCriterion("buyInfo not between", value1, value2, "buyInfo");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buyDate is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buyDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterionForJDBCDate("buyDate =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("buyDate <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("buyDate >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buyDate >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterionForJDBCDate("buyDate <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buyDate <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterionForJDBCDate("buyDate in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("buyDate not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buyDate between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buyDate not between", value1, value2, "buyDate");
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