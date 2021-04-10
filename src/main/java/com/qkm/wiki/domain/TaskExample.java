package com.qkm.wiki.domain;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdIsNull() {
            addCriterion("taskcategory1_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdIsNotNull() {
            addCriterion("taskcategory1_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdEqualTo(Long value) {
            addCriterion("taskcategory1_id =", value, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdNotEqualTo(Long value) {
            addCriterion("taskcategory1_id <>", value, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdGreaterThan(Long value) {
            addCriterion("taskcategory1_id >", value, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("taskcategory1_id >=", value, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdLessThan(Long value) {
            addCriterion("taskcategory1_id <", value, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdLessThanOrEqualTo(Long value) {
            addCriterion("taskcategory1_id <=", value, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdIn(List<Long> values) {
            addCriterion("taskcategory1_id in", values, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdNotIn(List<Long> values) {
            addCriterion("taskcategory1_id not in", values, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdBetween(Long value1, Long value2) {
            addCriterion("taskcategory1_id between", value1, value2, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory1IdNotBetween(Long value1, Long value2) {
            addCriterion("taskcategory1_id not between", value1, value2, "taskcategory1Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdIsNull() {
            addCriterion("taskcategory2_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdIsNotNull() {
            addCriterion("taskcategory2_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdEqualTo(Long value) {
            addCriterion("taskcategory2_id =", value, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdNotEqualTo(Long value) {
            addCriterion("taskcategory2_id <>", value, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdGreaterThan(Long value) {
            addCriterion("taskcategory2_id >", value, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdGreaterThanOrEqualTo(Long value) {
            addCriterion("taskcategory2_id >=", value, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdLessThan(Long value) {
            addCriterion("taskcategory2_id <", value, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdLessThanOrEqualTo(Long value) {
            addCriterion("taskcategory2_id <=", value, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdIn(List<Long> values) {
            addCriterion("taskcategory2_id in", values, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdNotIn(List<Long> values) {
            addCriterion("taskcategory2_id not in", values, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdBetween(Long value1, Long value2) {
            addCriterion("taskcategory2_id between", value1, value2, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskcategory2IdNotBetween(Long value1, Long value2) {
            addCriterion("taskcategory2_id not between", value1, value2, "taskcategory2Id");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIsNull() {
            addCriterion("taskdescription is null");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIsNotNull() {
            addCriterion("taskdescription is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionEqualTo(String value) {
            addCriterion("taskdescription =", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotEqualTo(String value) {
            addCriterion("taskdescription <>", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionGreaterThan(String value) {
            addCriterion("taskdescription >", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("taskdescription >=", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLessThan(String value) {
            addCriterion("taskdescription <", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLessThanOrEqualTo(String value) {
            addCriterion("taskdescription <=", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLike(String value) {
            addCriterion("taskdescription like", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotLike(String value) {
            addCriterion("taskdescription not like", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIn(List<String> values) {
            addCriterion("taskdescription in", values, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotIn(List<String> values) {
            addCriterion("taskdescription not in", values, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionBetween(String value1, String value2) {
            addCriterion("taskdescription between", value1, value2, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotBetween(String value1, String value2) {
            addCriterion("taskdescription not between", value1, value2, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountIsNull() {
            addCriterion("taskdoc_count is null");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountIsNotNull() {
            addCriterion("taskdoc_count is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountEqualTo(Integer value) {
            addCriterion("taskdoc_count =", value, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountNotEqualTo(Integer value) {
            addCriterion("taskdoc_count <>", value, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountGreaterThan(Integer value) {
            addCriterion("taskdoc_count >", value, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskdoc_count >=", value, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountLessThan(Integer value) {
            addCriterion("taskdoc_count <", value, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountLessThanOrEqualTo(Integer value) {
            addCriterion("taskdoc_count <=", value, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountIn(List<Integer> values) {
            addCriterion("taskdoc_count in", values, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountNotIn(List<Integer> values) {
            addCriterion("taskdoc_count not in", values, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountBetween(Integer value1, Integer value2) {
            addCriterion("taskdoc_count between", value1, value2, "taskdocCount");
            return (Criteria) this;
        }

        public Criteria andTaskdocCountNotBetween(Integer value1, Integer value2) {
            addCriterion("taskdoc_count not between", value1, value2, "taskdocCount");
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