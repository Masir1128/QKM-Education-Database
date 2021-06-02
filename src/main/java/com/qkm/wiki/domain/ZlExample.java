package com.qkm.wiki.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZlExample() {
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

        public Criteria andCategory1IsNull() {
            addCriterion("category1 is null");
            return (Criteria) this;
        }

        public Criteria andCategory1IsNotNull() {
            addCriterion("category1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1EqualTo(Long value) {
            addCriterion("category1 =", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotEqualTo(Long value) {
            addCriterion("category1 <>", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1GreaterThan(Long value) {
            addCriterion("category1 >", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1GreaterThanOrEqualTo(Long value) {
            addCriterion("category1 >=", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1LessThan(Long value) {
            addCriterion("category1 <", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1LessThanOrEqualTo(Long value) {
            addCriterion("category1 <=", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1In(List<Long> values) {
            addCriterion("category1 in", values, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotIn(List<Long> values) {
            addCriterion("category1 not in", values, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1Between(Long value1, Long value2) {
            addCriterion("category1 between", value1, value2, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotBetween(Long value1, Long value2) {
            addCriterion("category1 not between", value1, value2, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory2IsNull() {
            addCriterion("category2 is null");
            return (Criteria) this;
        }

        public Criteria andCategory2IsNotNull() {
            addCriterion("category2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2EqualTo(Long value) {
            addCriterion("category2 =", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotEqualTo(Long value) {
            addCriterion("category2 <>", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2GreaterThan(Long value) {
            addCriterion("category2 >", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2GreaterThanOrEqualTo(Long value) {
            addCriterion("category2 >=", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2LessThan(Long value) {
            addCriterion("category2 <", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2LessThanOrEqualTo(Long value) {
            addCriterion("category2 <=", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2In(List<Long> values) {
            addCriterion("category2 in", values, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotIn(List<Long> values) {
            addCriterion("category2 not in", values, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2Between(Long value1, Long value2) {
            addCriterion("category2 between", value1, value2, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotBetween(Long value1, Long value2) {
            addCriterion("category2 not between", value1, value2, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory3IsNull() {
            addCriterion("category3 is null");
            return (Criteria) this;
        }

        public Criteria andCategory3IsNotNull() {
            addCriterion("category3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory3EqualTo(Long value) {
            addCriterion("category3 =", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3NotEqualTo(Long value) {
            addCriterion("category3 <>", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3GreaterThan(Long value) {
            addCriterion("category3 >", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3GreaterThanOrEqualTo(Long value) {
            addCriterion("category3 >=", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3LessThan(Long value) {
            addCriterion("category3 <", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3LessThanOrEqualTo(Long value) {
            addCriterion("category3 <=", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3In(List<Long> values) {
            addCriterion("category3 in", values, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3NotIn(List<Long> values) {
            addCriterion("category3 not in", values, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3Between(Long value1, Long value2) {
            addCriterion("category3 between", value1, value2, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3NotBetween(Long value1, Long value2) {
            addCriterion("category3 not between", value1, value2, "category3");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNull() {
            addCriterion("viewcount is null");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNotNull() {
            addCriterion("viewcount is not null");
            return (Criteria) this;
        }

        public Criteria andViewcountEqualTo(Integer value) {
            addCriterion("viewcount =", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotEqualTo(Integer value) {
            addCriterion("viewcount <>", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThan(Integer value) {
            addCriterion("viewcount >", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewcount >=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThan(Integer value) {
            addCriterion("viewcount <", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("viewcount <=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountIn(List<Integer> values) {
            addCriterion("viewcount in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotIn(List<Integer> values) {
            addCriterion("viewcount not in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountBetween(Integer value1, Integer value2) {
            addCriterion("viewcount between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewcount not between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andVotecountIsNull() {
            addCriterion("votecount is null");
            return (Criteria) this;
        }

        public Criteria andVotecountIsNotNull() {
            addCriterion("votecount is not null");
            return (Criteria) this;
        }

        public Criteria andVotecountEqualTo(Integer value) {
            addCriterion("votecount =", value, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountNotEqualTo(Integer value) {
            addCriterion("votecount <>", value, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountGreaterThan(Integer value) {
            addCriterion("votecount >", value, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("votecount >=", value, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountLessThan(Integer value) {
            addCriterion("votecount <", value, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountLessThanOrEqualTo(Integer value) {
            addCriterion("votecount <=", value, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountIn(List<Integer> values) {
            addCriterion("votecount in", values, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountNotIn(List<Integer> values) {
            addCriterion("votecount not in", values, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountBetween(Integer value1, Integer value2) {
            addCriterion("votecount between", value1, value2, "votecount");
            return (Criteria) this;
        }

        public Criteria andVotecountNotBetween(Integer value1, Integer value2) {
            addCriterion("votecount not between", value1, value2, "votecount");
            return (Criteria) this;
        }

        public Criteria andDatesIsNull() {
            addCriterion("dates is null");
            return (Criteria) this;
        }

        public Criteria andDatesIsNotNull() {
            addCriterion("dates is not null");
            return (Criteria) this;
        }

        public Criteria andDatesEqualTo(Date value) {
            addCriterion("dates =", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotEqualTo(Date value) {
            addCriterion("dates <>", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesGreaterThan(Date value) {
            addCriterion("dates >", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesGreaterThanOrEqualTo(Date value) {
            addCriterion("dates >=", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesLessThan(Date value) {
            addCriterion("dates <", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesLessThanOrEqualTo(Date value) {
            addCriterion("dates <=", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesIn(List<Date> values) {
            addCriterion("dates in", values, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotIn(List<Date> values) {
            addCriterion("dates not in", values, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesBetween(Date value1, Date value2) {
            addCriterion("dates between", value1, value2, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotBetween(Date value1, Date value2) {
            addCriterion("dates not between", value1, value2, "dates");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNull() {
            addCriterion("add1 is null");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNotNull() {
            addCriterion("add1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd1EqualTo(String value) {
            addCriterion("add1 =", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotEqualTo(String value) {
            addCriterion("add1 <>", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThan(String value) {
            addCriterion("add1 >", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThanOrEqualTo(String value) {
            addCriterion("add1 >=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThan(String value) {
            addCriterion("add1 <", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThanOrEqualTo(String value) {
            addCriterion("add1 <=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Like(String value) {
            addCriterion("add1 like", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotLike(String value) {
            addCriterion("add1 not like", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1In(List<String> values) {
            addCriterion("add1 in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotIn(List<String> values) {
            addCriterion("add1 not in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Between(String value1, String value2) {
            addCriterion("add1 between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotBetween(String value1, String value2) {
            addCriterion("add1 not between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNull() {
            addCriterion("add2 is null");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNotNull() {
            addCriterion("add2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd2EqualTo(String value) {
            addCriterion("add2 =", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotEqualTo(String value) {
            addCriterion("add2 <>", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThan(String value) {
            addCriterion("add2 >", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThanOrEqualTo(String value) {
            addCriterion("add2 >=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThan(String value) {
            addCriterion("add2 <", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThanOrEqualTo(String value) {
            addCriterion("add2 <=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Like(String value) {
            addCriterion("add2 like", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotLike(String value) {
            addCriterion("add2 not like", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2In(List<String> values) {
            addCriterion("add2 in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotIn(List<String> values) {
            addCriterion("add2 not in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Between(String value1, String value2) {
            addCriterion("add2 between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotBetween(String value1, String value2) {
            addCriterion("add2 not between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNull() {
            addCriterion("add3 is null");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNotNull() {
            addCriterion("add3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd3EqualTo(String value) {
            addCriterion("add3 =", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotEqualTo(String value) {
            addCriterion("add3 <>", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThan(String value) {
            addCriterion("add3 >", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThanOrEqualTo(String value) {
            addCriterion("add3 >=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThan(String value) {
            addCriterion("add3 <", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThanOrEqualTo(String value) {
            addCriterion("add3 <=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Like(String value) {
            addCriterion("add3 like", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotLike(String value) {
            addCriterion("add3 not like", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3In(List<String> values) {
            addCriterion("add3 in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotIn(List<String> values) {
            addCriterion("add3 not in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Between(String value1, String value2) {
            addCriterion("add3 between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotBetween(String value1, String value2) {
            addCriterion("add3 not between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd4IsNull() {
            addCriterion("add4 is null");
            return (Criteria) this;
        }

        public Criteria andAdd4IsNotNull() {
            addCriterion("add4 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd4EqualTo(String value) {
            addCriterion("add4 =", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotEqualTo(String value) {
            addCriterion("add4 <>", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThan(String value) {
            addCriterion("add4 >", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThanOrEqualTo(String value) {
            addCriterion("add4 >=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThan(String value) {
            addCriterion("add4 <", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThanOrEqualTo(String value) {
            addCriterion("add4 <=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4Like(String value) {
            addCriterion("add4 like", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotLike(String value) {
            addCriterion("add4 not like", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4In(List<String> values) {
            addCriterion("add4 in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotIn(List<String> values) {
            addCriterion("add4 not in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4Between(String value1, String value2) {
            addCriterion("add4 between", value1, value2, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotBetween(String value1, String value2) {
            addCriterion("add4 not between", value1, value2, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd5IsNull() {
            addCriterion("add5 is null");
            return (Criteria) this;
        }

        public Criteria andAdd5IsNotNull() {
            addCriterion("add5 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd5EqualTo(Integer value) {
            addCriterion("add5 =", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotEqualTo(Integer value) {
            addCriterion("add5 <>", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5GreaterThan(Integer value) {
            addCriterion("add5 >", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5GreaterThanOrEqualTo(Integer value) {
            addCriterion("add5 >=", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5LessThan(Integer value) {
            addCriterion("add5 <", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5LessThanOrEqualTo(Integer value) {
            addCriterion("add5 <=", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5In(List<Integer> values) {
            addCriterion("add5 in", values, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotIn(List<Integer> values) {
            addCriterion("add5 not in", values, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5Between(Integer value1, Integer value2) {
            addCriterion("add5 between", value1, value2, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotBetween(Integer value1, Integer value2) {
            addCriterion("add5 not between", value1, value2, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd6IsNull() {
            addCriterion("add6 is null");
            return (Criteria) this;
        }

        public Criteria andAdd6IsNotNull() {
            addCriterion("add6 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd6EqualTo(Integer value) {
            addCriterion("add6 =", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotEqualTo(Integer value) {
            addCriterion("add6 <>", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6GreaterThan(Integer value) {
            addCriterion("add6 >", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6GreaterThanOrEqualTo(Integer value) {
            addCriterion("add6 >=", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6LessThan(Integer value) {
            addCriterion("add6 <", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6LessThanOrEqualTo(Integer value) {
            addCriterion("add6 <=", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6In(List<Integer> values) {
            addCriterion("add6 in", values, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotIn(List<Integer> values) {
            addCriterion("add6 not in", values, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6Between(Integer value1, Integer value2) {
            addCriterion("add6 between", value1, value2, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotBetween(Integer value1, Integer value2) {
            addCriterion("add6 not between", value1, value2, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd7IsNull() {
            addCriterion("add7 is null");
            return (Criteria) this;
        }

        public Criteria andAdd7IsNotNull() {
            addCriterion("add7 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd7EqualTo(Integer value) {
            addCriterion("add7 =", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotEqualTo(Integer value) {
            addCriterion("add7 <>", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7GreaterThan(Integer value) {
            addCriterion("add7 >", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7GreaterThanOrEqualTo(Integer value) {
            addCriterion("add7 >=", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7LessThan(Integer value) {
            addCriterion("add7 <", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7LessThanOrEqualTo(Integer value) {
            addCriterion("add7 <=", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7In(List<Integer> values) {
            addCriterion("add7 in", values, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotIn(List<Integer> values) {
            addCriterion("add7 not in", values, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7Between(Integer value1, Integer value2) {
            addCriterion("add7 between", value1, value2, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotBetween(Integer value1, Integer value2) {
            addCriterion("add7 not between", value1, value2, "add7");
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