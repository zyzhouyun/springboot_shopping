package com.rocket.dream.shopping.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("orderCode is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("orderCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(Integer value) {
            addCriterion("orderCode =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(Integer value) {
            addCriterion("orderCode <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(Integer value) {
            addCriterion("orderCode >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderCode >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(Integer value) {
            addCriterion("orderCode <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(Integer value) {
            addCriterion("orderCode <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<Integer> values) {
            addCriterion("orderCode in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<Integer> values) {
            addCriterion("orderCode not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(Integer value1, Integer value2) {
            addCriterion("orderCode between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("orderCode not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("orderMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("orderMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(Float value) {
            addCriterion("orderMoney =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(Float value) {
            addCriterion("orderMoney <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(Float value) {
            addCriterion("orderMoney >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("orderMoney >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(Float value) {
            addCriterion("orderMoney <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(Float value) {
            addCriterion("orderMoney <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<Float> values) {
            addCriterion("orderMoney in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<Float> values) {
            addCriterion("orderMoney not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(Float value1, Float value2) {
            addCriterion("orderMoney between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(Float value1, Float value2) {
            addCriterion("orderMoney not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
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