package com.rocket.dream.shopping.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("accountId =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("accountId <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("accountId >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountId >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("accountId <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("accountId <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("accountId in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("accountId not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("accountId between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accountId not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("userPhone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("userPhone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("userPwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("userPwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIsNull() {
            addCriterion("userCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIsNotNull() {
            addCriterion("userCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("userCreateDate =", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("userCreateDate <>", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("userCreateDate >", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userCreateDate >=", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("userCreateDate <", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userCreateDate <=", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("userCreateDate in", values, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("userCreateDate not in", values, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userCreateDate between", value1, value2, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userCreateDate not between", value1, value2, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitIsNull() {
            addCriterion("userHeadPortrait is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitIsNotNull() {
            addCriterion("userHeadPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitEqualTo(String value) {
            addCriterion("userHeadPortrait =", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotEqualTo(String value) {
            addCriterion("userHeadPortrait <>", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitGreaterThan(String value) {
            addCriterion("userHeadPortrait >", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("userHeadPortrait >=", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitLessThan(String value) {
            addCriterion("userHeadPortrait <", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitLessThanOrEqualTo(String value) {
            addCriterion("userHeadPortrait <=", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitLike(String value) {
            addCriterion("userHeadPortrait like", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotLike(String value) {
            addCriterion("userHeadPortrait not like", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitIn(List<String> values) {
            addCriterion("userHeadPortrait in", values, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotIn(List<String> values) {
            addCriterion("userHeadPortrait not in", values, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitBetween(String value1, String value2) {
            addCriterion("userHeadPortrait between", value1, value2, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotBetween(String value1, String value2) {
            addCriterion("userHeadPortrait not between", value1, value2, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("userGender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("userGender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Short value) {
            addCriterion("userGender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Short value) {
            addCriterion("userGender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Short value) {
            addCriterion("userGender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("userGender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Short value) {
            addCriterion("userGender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Short value) {
            addCriterion("userGender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Short> values) {
            addCriterion("userGender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Short> values) {
            addCriterion("userGender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Short value1, Short value2) {
            addCriterion("userGender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Short value1, Short value2) {
            addCriterion("userGender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("userState =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("userState <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("userState >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userState >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("userState <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("userState <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("userState in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("userState not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("userState between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("userState not between", value1, value2, "userState");
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