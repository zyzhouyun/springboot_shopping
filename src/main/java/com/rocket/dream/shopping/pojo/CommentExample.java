package com.rocket.dream.shopping.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("comId is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("comId is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("comId =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("comId <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("comId >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comId >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("comId <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("comId <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("comId in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("comId not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("comId between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comId not between", value1, value2, "comId");
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

        public Criteria andCommentInfoIsNull() {
            addCriterion("commentInfo is null");
            return (Criteria) this;
        }

        public Criteria andCommentInfoIsNotNull() {
            addCriterion("commentInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCommentInfoEqualTo(String value) {
            addCriterion("commentInfo =", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotEqualTo(String value) {
            addCriterion("commentInfo <>", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoGreaterThan(String value) {
            addCriterion("commentInfo >", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoGreaterThanOrEqualTo(String value) {
            addCriterion("commentInfo >=", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoLessThan(String value) {
            addCriterion("commentInfo <", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoLessThanOrEqualTo(String value) {
            addCriterion("commentInfo <=", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoLike(String value) {
            addCriterion("commentInfo like", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotLike(String value) {
            addCriterion("commentInfo not like", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoIn(List<String> values) {
            addCriterion("commentInfo in", values, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotIn(List<String> values) {
            addCriterion("commentInfo not in", values, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoBetween(String value1, String value2) {
            addCriterion("commentInfo between", value1, value2, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotBetween(String value1, String value2) {
            addCriterion("commentInfo not between", value1, value2, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andComDateIsNull() {
            addCriterion("comDate is null");
            return (Criteria) this;
        }

        public Criteria andComDateIsNotNull() {
            addCriterion("comDate is not null");
            return (Criteria) this;
        }

        public Criteria andComDateEqualTo(Date value) {
            addCriterionForJDBCDate("comDate =", value, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("comDate <>", value, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateGreaterThan(Date value) {
            addCriterionForJDBCDate("comDate >", value, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("comDate >=", value, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateLessThan(Date value) {
            addCriterionForJDBCDate("comDate <", value, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("comDate <=", value, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateIn(List<Date> values) {
            addCriterionForJDBCDate("comDate in", values, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("comDate not in", values, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("comDate between", value1, value2, "comDate");
            return (Criteria) this;
        }

        public Criteria andComDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("comDate not between", value1, value2, "comDate");
            return (Criteria) this;
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