package com.qkm.wiki.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScorendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScorendExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRead1IsNull() {
            addCriterion("read1 is null");
            return (Criteria) this;
        }

        public Criteria andRead1IsNotNull() {
            addCriterion("read1 is not null");
            return (Criteria) this;
        }

        public Criteria andRead1EqualTo(String value) {
            addCriterion("read1 =", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1NotEqualTo(String value) {
            addCriterion("read1 <>", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1GreaterThan(String value) {
            addCriterion("read1 >", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1GreaterThanOrEqualTo(String value) {
            addCriterion("read1 >=", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1LessThan(String value) {
            addCriterion("read1 <", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1LessThanOrEqualTo(String value) {
            addCriterion("read1 <=", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1Like(String value) {
            addCriterion("read1 like", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1NotLike(String value) {
            addCriterion("read1 not like", value, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1In(List<String> values) {
            addCriterion("read1 in", values, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1NotIn(List<String> values) {
            addCriterion("read1 not in", values, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1Between(String value1, String value2) {
            addCriterion("read1 between", value1, value2, "read1");
            return (Criteria) this;
        }

        public Criteria andRead1NotBetween(String value1, String value2) {
            addCriterion("read1 not between", value1, value2, "read1");
            return (Criteria) this;
        }

        public Criteria andRead2IsNull() {
            addCriterion("read2 is null");
            return (Criteria) this;
        }

        public Criteria andRead2IsNotNull() {
            addCriterion("read2 is not null");
            return (Criteria) this;
        }

        public Criteria andRead2EqualTo(String value) {
            addCriterion("read2 =", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2NotEqualTo(String value) {
            addCriterion("read2 <>", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2GreaterThan(String value) {
            addCriterion("read2 >", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2GreaterThanOrEqualTo(String value) {
            addCriterion("read2 >=", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2LessThan(String value) {
            addCriterion("read2 <", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2LessThanOrEqualTo(String value) {
            addCriterion("read2 <=", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2Like(String value) {
            addCriterion("read2 like", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2NotLike(String value) {
            addCriterion("read2 not like", value, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2In(List<String> values) {
            addCriterion("read2 in", values, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2NotIn(List<String> values) {
            addCriterion("read2 not in", values, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2Between(String value1, String value2) {
            addCriterion("read2 between", value1, value2, "read2");
            return (Criteria) this;
        }

        public Criteria andRead2NotBetween(String value1, String value2) {
            addCriterion("read2 not between", value1, value2, "read2");
            return (Criteria) this;
        }

        public Criteria andBumenIsNull() {
            addCriterion("bumen is null");
            return (Criteria) this;
        }

        public Criteria andBumenIsNotNull() {
            addCriterion("bumen is not null");
            return (Criteria) this;
        }

        public Criteria andBumenEqualTo(String value) {
            addCriterion("bumen =", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotEqualTo(String value) {
            addCriterion("bumen <>", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThan(String value) {
            addCriterion("bumen >", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThanOrEqualTo(String value) {
            addCriterion("bumen >=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThan(String value) {
            addCriterion("bumen <", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThanOrEqualTo(String value) {
            addCriterion("bumen <=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLike(String value) {
            addCriterion("bumen like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotLike(String value) {
            addCriterion("bumen not like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenIn(List<String> values) {
            addCriterion("bumen in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotIn(List<String> values) {
            addCriterion("bumen not in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenBetween(String value1, String value2) {
            addCriterion("bumen between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotBetween(String value1, String value2) {
            addCriterion("bumen not between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andT1IsNull() {
            addCriterion("t1 is null");
            return (Criteria) this;
        }

        public Criteria andT1IsNotNull() {
            addCriterion("t1 is not null");
            return (Criteria) this;
        }

        public Criteria andT1EqualTo(Integer value) {
            addCriterion("t1 =", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1NotEqualTo(Integer value) {
            addCriterion("t1 <>", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1GreaterThan(Integer value) {
            addCriterion("t1 >", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1GreaterThanOrEqualTo(Integer value) {
            addCriterion("t1 >=", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1LessThan(Integer value) {
            addCriterion("t1 <", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1LessThanOrEqualTo(Integer value) {
            addCriterion("t1 <=", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1In(List<Integer> values) {
            addCriterion("t1 in", values, "t1");
            return (Criteria) this;
        }

        public Criteria andT1NotIn(List<Integer> values) {
            addCriterion("t1 not in", values, "t1");
            return (Criteria) this;
        }

        public Criteria andT1Between(Integer value1, Integer value2) {
            addCriterion("t1 between", value1, value2, "t1");
            return (Criteria) this;
        }

        public Criteria andT1NotBetween(Integer value1, Integer value2) {
            addCriterion("t1 not between", value1, value2, "t1");
            return (Criteria) this;
        }

        public Criteria andT2IsNull() {
            addCriterion("t2 is null");
            return (Criteria) this;
        }

        public Criteria andT2IsNotNull() {
            addCriterion("t2 is not null");
            return (Criteria) this;
        }

        public Criteria andT2EqualTo(Integer value) {
            addCriterion("t2 =", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2NotEqualTo(Integer value) {
            addCriterion("t2 <>", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2GreaterThan(Integer value) {
            addCriterion("t2 >", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2GreaterThanOrEqualTo(Integer value) {
            addCriterion("t2 >=", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2LessThan(Integer value) {
            addCriterion("t2 <", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2LessThanOrEqualTo(Integer value) {
            addCriterion("t2 <=", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2In(List<Integer> values) {
            addCriterion("t2 in", values, "t2");
            return (Criteria) this;
        }

        public Criteria andT2NotIn(List<Integer> values) {
            addCriterion("t2 not in", values, "t2");
            return (Criteria) this;
        }

        public Criteria andT2Between(Integer value1, Integer value2) {
            addCriterion("t2 between", value1, value2, "t2");
            return (Criteria) this;
        }

        public Criteria andT2NotBetween(Integer value1, Integer value2) {
            addCriterion("t2 not between", value1, value2, "t2");
            return (Criteria) this;
        }

        public Criteria andT3IsNull() {
            addCriterion("t3 is null");
            return (Criteria) this;
        }

        public Criteria andT3IsNotNull() {
            addCriterion("t3 is not null");
            return (Criteria) this;
        }

        public Criteria andT3EqualTo(Integer value) {
            addCriterion("t3 =", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3NotEqualTo(Integer value) {
            addCriterion("t3 <>", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3GreaterThan(Integer value) {
            addCriterion("t3 >", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3GreaterThanOrEqualTo(Integer value) {
            addCriterion("t3 >=", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3LessThan(Integer value) {
            addCriterion("t3 <", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3LessThanOrEqualTo(Integer value) {
            addCriterion("t3 <=", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3In(List<Integer> values) {
            addCriterion("t3 in", values, "t3");
            return (Criteria) this;
        }

        public Criteria andT3NotIn(List<Integer> values) {
            addCriterion("t3 not in", values, "t3");
            return (Criteria) this;
        }

        public Criteria andT3Between(Integer value1, Integer value2) {
            addCriterion("t3 between", value1, value2, "t3");
            return (Criteria) this;
        }

        public Criteria andT3NotBetween(Integer value1, Integer value2) {
            addCriterion("t3 not between", value1, value2, "t3");
            return (Criteria) this;
        }

        public Criteria andT4IsNull() {
            addCriterion("t4 is null");
            return (Criteria) this;
        }

        public Criteria andT4IsNotNull() {
            addCriterion("t4 is not null");
            return (Criteria) this;
        }

        public Criteria andT4EqualTo(Integer value) {
            addCriterion("t4 =", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4NotEqualTo(Integer value) {
            addCriterion("t4 <>", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4GreaterThan(Integer value) {
            addCriterion("t4 >", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4GreaterThanOrEqualTo(Integer value) {
            addCriterion("t4 >=", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4LessThan(Integer value) {
            addCriterion("t4 <", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4LessThanOrEqualTo(Integer value) {
            addCriterion("t4 <=", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4In(List<Integer> values) {
            addCriterion("t4 in", values, "t4");
            return (Criteria) this;
        }

        public Criteria andT4NotIn(List<Integer> values) {
            addCriterion("t4 not in", values, "t4");
            return (Criteria) this;
        }

        public Criteria andT4Between(Integer value1, Integer value2) {
            addCriterion("t4 between", value1, value2, "t4");
            return (Criteria) this;
        }

        public Criteria andT4NotBetween(Integer value1, Integer value2) {
            addCriterion("t4 not between", value1, value2, "t4");
            return (Criteria) this;
        }

        public Criteria andT5IsNull() {
            addCriterion("t5 is null");
            return (Criteria) this;
        }

        public Criteria andT5IsNotNull() {
            addCriterion("t5 is not null");
            return (Criteria) this;
        }

        public Criteria andT5EqualTo(Integer value) {
            addCriterion("t5 =", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotEqualTo(Integer value) {
            addCriterion("t5 <>", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5GreaterThan(Integer value) {
            addCriterion("t5 >", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5GreaterThanOrEqualTo(Integer value) {
            addCriterion("t5 >=", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5LessThan(Integer value) {
            addCriterion("t5 <", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5LessThanOrEqualTo(Integer value) {
            addCriterion("t5 <=", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5In(List<Integer> values) {
            addCriterion("t5 in", values, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotIn(List<Integer> values) {
            addCriterion("t5 not in", values, "t5");
            return (Criteria) this;
        }

        public Criteria andT5Between(Integer value1, Integer value2) {
            addCriterion("t5 between", value1, value2, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotBetween(Integer value1, Integer value2) {
            addCriterion("t5 not between", value1, value2, "t5");
            return (Criteria) this;
        }

        public Criteria andT6IsNull() {
            addCriterion("t6 is null");
            return (Criteria) this;
        }

        public Criteria andT6IsNotNull() {
            addCriterion("t6 is not null");
            return (Criteria) this;
        }

        public Criteria andT6EqualTo(Integer value) {
            addCriterion("t6 =", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotEqualTo(Integer value) {
            addCriterion("t6 <>", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6GreaterThan(Integer value) {
            addCriterion("t6 >", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6GreaterThanOrEqualTo(Integer value) {
            addCriterion("t6 >=", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6LessThan(Integer value) {
            addCriterion("t6 <", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6LessThanOrEqualTo(Integer value) {
            addCriterion("t6 <=", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6In(List<Integer> values) {
            addCriterion("t6 in", values, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotIn(List<Integer> values) {
            addCriterion("t6 not in", values, "t6");
            return (Criteria) this;
        }

        public Criteria andT6Between(Integer value1, Integer value2) {
            addCriterion("t6 between", value1, value2, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotBetween(Integer value1, Integer value2) {
            addCriterion("t6 not between", value1, value2, "t6");
            return (Criteria) this;
        }

        public Criteria andT7IsNull() {
            addCriterion("t7 is null");
            return (Criteria) this;
        }

        public Criteria andT7IsNotNull() {
            addCriterion("t7 is not null");
            return (Criteria) this;
        }

        public Criteria andT7EqualTo(Integer value) {
            addCriterion("t7 =", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotEqualTo(Integer value) {
            addCriterion("t7 <>", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7GreaterThan(Integer value) {
            addCriterion("t7 >", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7GreaterThanOrEqualTo(Integer value) {
            addCriterion("t7 >=", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7LessThan(Integer value) {
            addCriterion("t7 <", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7LessThanOrEqualTo(Integer value) {
            addCriterion("t7 <=", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7In(List<Integer> values) {
            addCriterion("t7 in", values, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotIn(List<Integer> values) {
            addCriterion("t7 not in", values, "t7");
            return (Criteria) this;
        }

        public Criteria andT7Between(Integer value1, Integer value2) {
            addCriterion("t7 between", value1, value2, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotBetween(Integer value1, Integer value2) {
            addCriterion("t7 not between", value1, value2, "t7");
            return (Criteria) this;
        }

        public Criteria andT8IsNull() {
            addCriterion("t8 is null");
            return (Criteria) this;
        }

        public Criteria andT8IsNotNull() {
            addCriterion("t8 is not null");
            return (Criteria) this;
        }

        public Criteria andT8EqualTo(Integer value) {
            addCriterion("t8 =", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotEqualTo(Integer value) {
            addCriterion("t8 <>", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8GreaterThan(Integer value) {
            addCriterion("t8 >", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8GreaterThanOrEqualTo(Integer value) {
            addCriterion("t8 >=", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8LessThan(Integer value) {
            addCriterion("t8 <", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8LessThanOrEqualTo(Integer value) {
            addCriterion("t8 <=", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8In(List<Integer> values) {
            addCriterion("t8 in", values, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotIn(List<Integer> values) {
            addCriterion("t8 not in", values, "t8");
            return (Criteria) this;
        }

        public Criteria andT8Between(Integer value1, Integer value2) {
            addCriterion("t8 between", value1, value2, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotBetween(Integer value1, Integer value2) {
            addCriterion("t8 not between", value1, value2, "t8");
            return (Criteria) this;
        }

        public Criteria andT9IsNull() {
            addCriterion("t9 is null");
            return (Criteria) this;
        }

        public Criteria andT9IsNotNull() {
            addCriterion("t9 is not null");
            return (Criteria) this;
        }

        public Criteria andT9EqualTo(Integer value) {
            addCriterion("t9 =", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotEqualTo(Integer value) {
            addCriterion("t9 <>", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9GreaterThan(Integer value) {
            addCriterion("t9 >", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9GreaterThanOrEqualTo(Integer value) {
            addCriterion("t9 >=", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9LessThan(Integer value) {
            addCriterion("t9 <", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9LessThanOrEqualTo(Integer value) {
            addCriterion("t9 <=", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9In(List<Integer> values) {
            addCriterion("t9 in", values, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotIn(List<Integer> values) {
            addCriterion("t9 not in", values, "t9");
            return (Criteria) this;
        }

        public Criteria andT9Between(Integer value1, Integer value2) {
            addCriterion("t9 between", value1, value2, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotBetween(Integer value1, Integer value2) {
            addCriterion("t9 not between", value1, value2, "t9");
            return (Criteria) this;
        }

        public Criteria andT10IsNull() {
            addCriterion("t10 is null");
            return (Criteria) this;
        }

        public Criteria andT10IsNotNull() {
            addCriterion("t10 is not null");
            return (Criteria) this;
        }

        public Criteria andT10EqualTo(Integer value) {
            addCriterion("t10 =", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotEqualTo(Integer value) {
            addCriterion("t10 <>", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10GreaterThan(Integer value) {
            addCriterion("t10 >", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10GreaterThanOrEqualTo(Integer value) {
            addCriterion("t10 >=", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10LessThan(Integer value) {
            addCriterion("t10 <", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10LessThanOrEqualTo(Integer value) {
            addCriterion("t10 <=", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10In(List<Integer> values) {
            addCriterion("t10 in", values, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotIn(List<Integer> values) {
            addCriterion("t10 not in", values, "t10");
            return (Criteria) this;
        }

        public Criteria andT10Between(Integer value1, Integer value2) {
            addCriterion("t10 between", value1, value2, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotBetween(Integer value1, Integer value2) {
            addCriterion("t10 not between", value1, value2, "t10");
            return (Criteria) this;
        }

        public Criteria andT11IsNull() {
            addCriterion("t11 is null");
            return (Criteria) this;
        }

        public Criteria andT11IsNotNull() {
            addCriterion("t11 is not null");
            return (Criteria) this;
        }

        public Criteria andT11EqualTo(Integer value) {
            addCriterion("t11 =", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotEqualTo(Integer value) {
            addCriterion("t11 <>", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11GreaterThan(Integer value) {
            addCriterion("t11 >", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11GreaterThanOrEqualTo(Integer value) {
            addCriterion("t11 >=", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11LessThan(Integer value) {
            addCriterion("t11 <", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11LessThanOrEqualTo(Integer value) {
            addCriterion("t11 <=", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11In(List<Integer> values) {
            addCriterion("t11 in", values, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotIn(List<Integer> values) {
            addCriterion("t11 not in", values, "t11");
            return (Criteria) this;
        }

        public Criteria andT11Between(Integer value1, Integer value2) {
            addCriterion("t11 between", value1, value2, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotBetween(Integer value1, Integer value2) {
            addCriterion("t11 not between", value1, value2, "t11");
            return (Criteria) this;
        }

        public Criteria andT12IsNull() {
            addCriterion("t12 is null");
            return (Criteria) this;
        }

        public Criteria andT12IsNotNull() {
            addCriterion("t12 is not null");
            return (Criteria) this;
        }

        public Criteria andT12EqualTo(Integer value) {
            addCriterion("t12 =", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotEqualTo(Integer value) {
            addCriterion("t12 <>", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12GreaterThan(Integer value) {
            addCriterion("t12 >", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12GreaterThanOrEqualTo(Integer value) {
            addCriterion("t12 >=", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12LessThan(Integer value) {
            addCriterion("t12 <", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12LessThanOrEqualTo(Integer value) {
            addCriterion("t12 <=", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12In(List<Integer> values) {
            addCriterion("t12 in", values, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotIn(List<Integer> values) {
            addCriterion("t12 not in", values, "t12");
            return (Criteria) this;
        }

        public Criteria andT12Between(Integer value1, Integer value2) {
            addCriterion("t12 between", value1, value2, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotBetween(Integer value1, Integer value2) {
            addCriterion("t12 not between", value1, value2, "t12");
            return (Criteria) this;
        }

        public Criteria andT13IsNull() {
            addCriterion("t13 is null");
            return (Criteria) this;
        }

        public Criteria andT13IsNotNull() {
            addCriterion("t13 is not null");
            return (Criteria) this;
        }

        public Criteria andT13EqualTo(Integer value) {
            addCriterion("t13 =", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotEqualTo(Integer value) {
            addCriterion("t13 <>", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13GreaterThan(Integer value) {
            addCriterion("t13 >", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13GreaterThanOrEqualTo(Integer value) {
            addCriterion("t13 >=", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13LessThan(Integer value) {
            addCriterion("t13 <", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13LessThanOrEqualTo(Integer value) {
            addCriterion("t13 <=", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13In(List<Integer> values) {
            addCriterion("t13 in", values, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotIn(List<Integer> values) {
            addCriterion("t13 not in", values, "t13");
            return (Criteria) this;
        }

        public Criteria andT13Between(Integer value1, Integer value2) {
            addCriterion("t13 between", value1, value2, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotBetween(Integer value1, Integer value2) {
            addCriterion("t13 not between", value1, value2, "t13");
            return (Criteria) this;
        }

        public Criteria andT14IsNull() {
            addCriterion("t14 is null");
            return (Criteria) this;
        }

        public Criteria andT14IsNotNull() {
            addCriterion("t14 is not null");
            return (Criteria) this;
        }

        public Criteria andT14EqualTo(Integer value) {
            addCriterion("t14 =", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotEqualTo(Integer value) {
            addCriterion("t14 <>", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14GreaterThan(Integer value) {
            addCriterion("t14 >", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14GreaterThanOrEqualTo(Integer value) {
            addCriterion("t14 >=", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14LessThan(Integer value) {
            addCriterion("t14 <", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14LessThanOrEqualTo(Integer value) {
            addCriterion("t14 <=", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14In(List<Integer> values) {
            addCriterion("t14 in", values, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotIn(List<Integer> values) {
            addCriterion("t14 not in", values, "t14");
            return (Criteria) this;
        }

        public Criteria andT14Between(Integer value1, Integer value2) {
            addCriterion("t14 between", value1, value2, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotBetween(Integer value1, Integer value2) {
            addCriterion("t14 not between", value1, value2, "t14");
            return (Criteria) this;
        }

        public Criteria andT15IsNull() {
            addCriterion("t15 is null");
            return (Criteria) this;
        }

        public Criteria andT15IsNotNull() {
            addCriterion("t15 is not null");
            return (Criteria) this;
        }

        public Criteria andT15EqualTo(Integer value) {
            addCriterion("t15 =", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotEqualTo(Integer value) {
            addCriterion("t15 <>", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15GreaterThan(Integer value) {
            addCriterion("t15 >", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15GreaterThanOrEqualTo(Integer value) {
            addCriterion("t15 >=", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15LessThan(Integer value) {
            addCriterion("t15 <", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15LessThanOrEqualTo(Integer value) {
            addCriterion("t15 <=", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15In(List<Integer> values) {
            addCriterion("t15 in", values, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotIn(List<Integer> values) {
            addCriterion("t15 not in", values, "t15");
            return (Criteria) this;
        }

        public Criteria andT15Between(Integer value1, Integer value2) {
            addCriterion("t15 between", value1, value2, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotBetween(Integer value1, Integer value2) {
            addCriterion("t15 not between", value1, value2, "t15");
            return (Criteria) this;
        }

        public Criteria andT16IsNull() {
            addCriterion("t16 is null");
            return (Criteria) this;
        }

        public Criteria andT16IsNotNull() {
            addCriterion("t16 is not null");
            return (Criteria) this;
        }

        public Criteria andT16EqualTo(Integer value) {
            addCriterion("t16 =", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotEqualTo(Integer value) {
            addCriterion("t16 <>", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16GreaterThan(Integer value) {
            addCriterion("t16 >", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16GreaterThanOrEqualTo(Integer value) {
            addCriterion("t16 >=", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16LessThan(Integer value) {
            addCriterion("t16 <", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16LessThanOrEqualTo(Integer value) {
            addCriterion("t16 <=", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16In(List<Integer> values) {
            addCriterion("t16 in", values, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotIn(List<Integer> values) {
            addCriterion("t16 not in", values, "t16");
            return (Criteria) this;
        }

        public Criteria andT16Between(Integer value1, Integer value2) {
            addCriterion("t16 between", value1, value2, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotBetween(Integer value1, Integer value2) {
            addCriterion("t16 not between", value1, value2, "t16");
            return (Criteria) this;
        }

        public Criteria andT17IsNull() {
            addCriterion("t17 is null");
            return (Criteria) this;
        }

        public Criteria andT17IsNotNull() {
            addCriterion("t17 is not null");
            return (Criteria) this;
        }

        public Criteria andT17EqualTo(Integer value) {
            addCriterion("t17 =", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotEqualTo(Integer value) {
            addCriterion("t17 <>", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17GreaterThan(Integer value) {
            addCriterion("t17 >", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17GreaterThanOrEqualTo(Integer value) {
            addCriterion("t17 >=", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17LessThan(Integer value) {
            addCriterion("t17 <", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17LessThanOrEqualTo(Integer value) {
            addCriterion("t17 <=", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17In(List<Integer> values) {
            addCriterion("t17 in", values, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotIn(List<Integer> values) {
            addCriterion("t17 not in", values, "t17");
            return (Criteria) this;
        }

        public Criteria andT17Between(Integer value1, Integer value2) {
            addCriterion("t17 between", value1, value2, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotBetween(Integer value1, Integer value2) {
            addCriterion("t17 not between", value1, value2, "t17");
            return (Criteria) this;
        }

        public Criteria andT18IsNull() {
            addCriterion("t18 is null");
            return (Criteria) this;
        }

        public Criteria andT18IsNotNull() {
            addCriterion("t18 is not null");
            return (Criteria) this;
        }

        public Criteria andT18EqualTo(Integer value) {
            addCriterion("t18 =", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotEqualTo(Integer value) {
            addCriterion("t18 <>", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18GreaterThan(Integer value) {
            addCriterion("t18 >", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18GreaterThanOrEqualTo(Integer value) {
            addCriterion("t18 >=", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18LessThan(Integer value) {
            addCriterion("t18 <", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18LessThanOrEqualTo(Integer value) {
            addCriterion("t18 <=", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18In(List<Integer> values) {
            addCriterion("t18 in", values, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotIn(List<Integer> values) {
            addCriterion("t18 not in", values, "t18");
            return (Criteria) this;
        }

        public Criteria andT18Between(Integer value1, Integer value2) {
            addCriterion("t18 between", value1, value2, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotBetween(Integer value1, Integer value2) {
            addCriterion("t18 not between", value1, value2, "t18");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTeachIsNull() {
            addCriterion("teach is null");
            return (Criteria) this;
        }

        public Criteria andTeachIsNotNull() {
            addCriterion("teach is not null");
            return (Criteria) this;
        }

        public Criteria andTeachEqualTo(String value) {
            addCriterion("teach =", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachNotEqualTo(String value) {
            addCriterion("teach <>", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachGreaterThan(String value) {
            addCriterion("teach >", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachGreaterThanOrEqualTo(String value) {
            addCriterion("teach >=", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachLessThan(String value) {
            addCriterion("teach <", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachLessThanOrEqualTo(String value) {
            addCriterion("teach <=", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachLike(String value) {
            addCriterion("teach like", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachNotLike(String value) {
            addCriterion("teach not like", value, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachIn(List<String> values) {
            addCriterion("teach in", values, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachNotIn(List<String> values) {
            addCriterion("teach not in", values, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachBetween(String value1, String value2) {
            addCriterion("teach between", value1, value2, "teach");
            return (Criteria) this;
        }

        public Criteria andTeachNotBetween(String value1, String value2) {
            addCriterion("teach not between", value1, value2, "teach");
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