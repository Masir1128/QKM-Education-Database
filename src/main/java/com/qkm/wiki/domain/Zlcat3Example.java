package com.qkm.wiki.domain;

import java.util.ArrayList;
import java.util.List;

public class Zlcat3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Zlcat3Example() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCat1IsNull() {
            addCriterion("cat1 is null");
            return (Criteria) this;
        }

        public Criteria andCat1IsNotNull() {
            addCriterion("cat1 is not null");
            return (Criteria) this;
        }

        public Criteria andCat1EqualTo(String value) {
            addCriterion("cat1 =", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1NotEqualTo(String value) {
            addCriterion("cat1 <>", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1GreaterThan(String value) {
            addCriterion("cat1 >", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1GreaterThanOrEqualTo(String value) {
            addCriterion("cat1 >=", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1LessThan(String value) {
            addCriterion("cat1 <", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1LessThanOrEqualTo(String value) {
            addCriterion("cat1 <=", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1Like(String value) {
            addCriterion("cat1 like", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1NotLike(String value) {
            addCriterion("cat1 not like", value, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1In(List<String> values) {
            addCriterion("cat1 in", values, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1NotIn(List<String> values) {
            addCriterion("cat1 not in", values, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1Between(String value1, String value2) {
            addCriterion("cat1 between", value1, value2, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat1NotBetween(String value1, String value2) {
            addCriterion("cat1 not between", value1, value2, "cat1");
            return (Criteria) this;
        }

        public Criteria andCat2IsNull() {
            addCriterion("cat2 is null");
            return (Criteria) this;
        }

        public Criteria andCat2IsNotNull() {
            addCriterion("cat2 is not null");
            return (Criteria) this;
        }

        public Criteria andCat2EqualTo(String value) {
            addCriterion("cat2 =", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotEqualTo(String value) {
            addCriterion("cat2 <>", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2GreaterThan(String value) {
            addCriterion("cat2 >", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2GreaterThanOrEqualTo(String value) {
            addCriterion("cat2 >=", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2LessThan(String value) {
            addCriterion("cat2 <", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2LessThanOrEqualTo(String value) {
            addCriterion("cat2 <=", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2Like(String value) {
            addCriterion("cat2 like", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotLike(String value) {
            addCriterion("cat2 not like", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2In(List<String> values) {
            addCriterion("cat2 in", values, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotIn(List<String> values) {
            addCriterion("cat2 not in", values, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2Between(String value1, String value2) {
            addCriterion("cat2 between", value1, value2, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotBetween(String value1, String value2) {
            addCriterion("cat2 not between", value1, value2, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat3IsNull() {
            addCriterion("cat3 is null");
            return (Criteria) this;
        }

        public Criteria andCat3IsNotNull() {
            addCriterion("cat3 is not null");
            return (Criteria) this;
        }

        public Criteria andCat3EqualTo(String value) {
            addCriterion("cat3 =", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3NotEqualTo(String value) {
            addCriterion("cat3 <>", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3GreaterThan(String value) {
            addCriterion("cat3 >", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3GreaterThanOrEqualTo(String value) {
            addCriterion("cat3 >=", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3LessThan(String value) {
            addCriterion("cat3 <", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3LessThanOrEqualTo(String value) {
            addCriterion("cat3 <=", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3Like(String value) {
            addCriterion("cat3 like", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3NotLike(String value) {
            addCriterion("cat3 not like", value, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3In(List<String> values) {
            addCriterion("cat3 in", values, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3NotIn(List<String> values) {
            addCriterion("cat3 not in", values, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3Between(String value1, String value2) {
            addCriterion("cat3 between", value1, value2, "cat3");
            return (Criteria) this;
        }

        public Criteria andCat3NotBetween(String value1, String value2) {
            addCriterion("cat3 not between", value1, value2, "cat3");
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