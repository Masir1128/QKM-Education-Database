package com.qkm.wiki.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserzlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserzlExample() {
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

        public Criteria andNameidIsNull() {
            addCriterion("nameid is null");
            return (Criteria) this;
        }

        public Criteria andNameidIsNotNull() {
            addCriterion("nameid is not null");
            return (Criteria) this;
        }

        public Criteria andNameidEqualTo(String value) {
            addCriterion("nameid =", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotEqualTo(String value) {
            addCriterion("nameid <>", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidGreaterThan(String value) {
            addCriterion("nameid >", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidGreaterThanOrEqualTo(String value) {
            addCriterion("nameid >=", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLessThan(String value) {
            addCriterion("nameid <", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLessThanOrEqualTo(String value) {
            addCriterion("nameid <=", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLike(String value) {
            addCriterion("nameid like", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotLike(String value) {
            addCriterion("nameid not like", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidIn(List<String> values) {
            addCriterion("nameid in", values, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotIn(List<String> values) {
            addCriterion("nameid not in", values, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidBetween(String value1, String value2) {
            addCriterion("nameid between", value1, value2, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotBetween(String value1, String value2) {
            addCriterion("nameid not between", value1, value2, "nameid");
            return (Criteria) this;
        }

        public Criteria andZlnameIsNull() {
            addCriterion("zlname is null");
            return (Criteria) this;
        }

        public Criteria andZlnameIsNotNull() {
            addCriterion("zlname is not null");
            return (Criteria) this;
        }

        public Criteria andZlnameEqualTo(String value) {
            addCriterion("zlname =", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameNotEqualTo(String value) {
            addCriterion("zlname <>", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameGreaterThan(String value) {
            addCriterion("zlname >", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameGreaterThanOrEqualTo(String value) {
            addCriterion("zlname >=", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameLessThan(String value) {
            addCriterion("zlname <", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameLessThanOrEqualTo(String value) {
            addCriterion("zlname <=", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameLike(String value) {
            addCriterion("zlname like", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameNotLike(String value) {
            addCriterion("zlname not like", value, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameIn(List<String> values) {
            addCriterion("zlname in", values, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameNotIn(List<String> values) {
            addCriterion("zlname not in", values, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameBetween(String value1, String value2) {
            addCriterion("zlname between", value1, value2, "zlname");
            return (Criteria) this;
        }

        public Criteria andZlnameNotBetween(String value1, String value2) {
            addCriterion("zlname not between", value1, value2, "zlname");
            return (Criteria) this;
        }

        public Criteria andZldesIsNull() {
            addCriterion("zldes is null");
            return (Criteria) this;
        }

        public Criteria andZldesIsNotNull() {
            addCriterion("zldes is not null");
            return (Criteria) this;
        }

        public Criteria andZldesEqualTo(String value) {
            addCriterion("zldes =", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesNotEqualTo(String value) {
            addCriterion("zldes <>", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesGreaterThan(String value) {
            addCriterion("zldes >", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesGreaterThanOrEqualTo(String value) {
            addCriterion("zldes >=", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesLessThan(String value) {
            addCriterion("zldes <", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesLessThanOrEqualTo(String value) {
            addCriterion("zldes <=", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesLike(String value) {
            addCriterion("zldes like", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesNotLike(String value) {
            addCriterion("zldes not like", value, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesIn(List<String> values) {
            addCriterion("zldes in", values, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesNotIn(List<String> values) {
            addCriterion("zldes not in", values, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesBetween(String value1, String value2) {
            addCriterion("zldes between", value1, value2, "zldes");
            return (Criteria) this;
        }

        public Criteria andZldesNotBetween(String value1, String value2) {
            addCriterion("zldes not between", value1, value2, "zldes");
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

        public Criteria andViewIsNull() {
            addCriterion("`view` is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("`view` is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Integer value) {
            addCriterion("`view` =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Integer value) {
            addCriterion("`view` <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Integer value) {
            addCriterion("`view` >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("`view` >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Integer value) {
            addCriterion("`view` <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Integer value) {
            addCriterion("`view` <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Integer> values) {
            addCriterion("`view` in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Integer> values) {
            addCriterion("`view` not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Integer value1, Integer value2) {
            addCriterion("`view` between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Integer value1, Integer value2) {
            addCriterion("`view` not between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andVoteIsNull() {
            addCriterion("vote is null");
            return (Criteria) this;
        }

        public Criteria andVoteIsNotNull() {
            addCriterion("vote is not null");
            return (Criteria) this;
        }

        public Criteria andVoteEqualTo(Integer value) {
            addCriterion("vote =", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotEqualTo(Integer value) {
            addCriterion("vote <>", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThan(Integer value) {
            addCriterion("vote >", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote >=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThan(Integer value) {
            addCriterion("vote <", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThanOrEqualTo(Integer value) {
            addCriterion("vote <=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteIn(List<Integer> values) {
            addCriterion("vote in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotIn(List<Integer> values) {
            addCriterion("vote not in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteBetween(Integer value1, Integer value2) {
            addCriterion("vote between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotBetween(Integer value1, Integer value2) {
            addCriterion("vote not between", value1, value2, "vote");
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

        public Criteria andAdd1IsNull() {
            addCriterion("add1 is null");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNotNull() {
            addCriterion("add1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd1EqualTo(Integer value) {
            addCriterion("add1 =", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotEqualTo(Integer value) {
            addCriterion("add1 <>", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThan(Integer value) {
            addCriterion("add1 >", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThanOrEqualTo(Integer value) {
            addCriterion("add1 >=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThan(Integer value) {
            addCriterion("add1 <", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThanOrEqualTo(Integer value) {
            addCriterion("add1 <=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1In(List<Integer> values) {
            addCriterion("add1 in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotIn(List<Integer> values) {
            addCriterion("add1 not in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Between(Integer value1, Integer value2) {
            addCriterion("add1 between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotBetween(Integer value1, Integer value2) {
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

        public Criteria andAdd2EqualTo(Integer value) {
            addCriterion("add2 =", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotEqualTo(Integer value) {
            addCriterion("add2 <>", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThan(Integer value) {
            addCriterion("add2 >", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThanOrEqualTo(Integer value) {
            addCriterion("add2 >=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThan(Integer value) {
            addCriterion("add2 <", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThanOrEqualTo(Integer value) {
            addCriterion("add2 <=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2In(List<Integer> values) {
            addCriterion("add2 in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotIn(List<Integer> values) {
            addCriterion("add2 not in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Between(Integer value1, Integer value2) {
            addCriterion("add2 between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotBetween(Integer value1, Integer value2) {
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

        public Criteria andAdd3EqualTo(Integer value) {
            addCriterion("add3 =", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotEqualTo(Integer value) {
            addCriterion("add3 <>", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThan(Integer value) {
            addCriterion("add3 >", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThanOrEqualTo(Integer value) {
            addCriterion("add3 >=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThan(Integer value) {
            addCriterion("add3 <", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThanOrEqualTo(Integer value) {
            addCriterion("add3 <=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3In(List<Integer> values) {
            addCriterion("add3 in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotIn(List<Integer> values) {
            addCriterion("add3 not in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Between(Integer value1, Integer value2) {
            addCriterion("add3 between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotBetween(Integer value1, Integer value2) {
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

        public Criteria andAdd4EqualTo(Integer value) {
            addCriterion("add4 =", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotEqualTo(Integer value) {
            addCriterion("add4 <>", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThan(Integer value) {
            addCriterion("add4 >", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThanOrEqualTo(Integer value) {
            addCriterion("add4 >=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThan(Integer value) {
            addCriterion("add4 <", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThanOrEqualTo(Integer value) {
            addCriterion("add4 <=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4In(List<Integer> values) {
            addCriterion("add4 in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotIn(List<Integer> values) {
            addCriterion("add4 not in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4Between(Integer value1, Integer value2) {
            addCriterion("add4 between", value1, value2, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotBetween(Integer value1, Integer value2) {
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

        public Criteria andAdd6EqualTo(String value) {
            addCriterion("add6 =", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotEqualTo(String value) {
            addCriterion("add6 <>", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6GreaterThan(String value) {
            addCriterion("add6 >", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6GreaterThanOrEqualTo(String value) {
            addCriterion("add6 >=", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6LessThan(String value) {
            addCriterion("add6 <", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6LessThanOrEqualTo(String value) {
            addCriterion("add6 <=", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6Like(String value) {
            addCriterion("add6 like", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotLike(String value) {
            addCriterion("add6 not like", value, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6In(List<String> values) {
            addCriterion("add6 in", values, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotIn(List<String> values) {
            addCriterion("add6 not in", values, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6Between(String value1, String value2) {
            addCriterion("add6 between", value1, value2, "add6");
            return (Criteria) this;
        }

        public Criteria andAdd6NotBetween(String value1, String value2) {
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

        public Criteria andAdd7EqualTo(String value) {
            addCriterion("add7 =", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotEqualTo(String value) {
            addCriterion("add7 <>", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7GreaterThan(String value) {
            addCriterion("add7 >", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7GreaterThanOrEqualTo(String value) {
            addCriterion("add7 >=", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7LessThan(String value) {
            addCriterion("add7 <", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7LessThanOrEqualTo(String value) {
            addCriterion("add7 <=", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7Like(String value) {
            addCriterion("add7 like", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotLike(String value) {
            addCriterion("add7 not like", value, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7In(List<String> values) {
            addCriterion("add7 in", values, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotIn(List<String> values) {
            addCriterion("add7 not in", values, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7Between(String value1, String value2) {
            addCriterion("add7 between", value1, value2, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd7NotBetween(String value1, String value2) {
            addCriterion("add7 not between", value1, value2, "add7");
            return (Criteria) this;
        }

        public Criteria andAdd8IsNull() {
            addCriterion("add8 is null");
            return (Criteria) this;
        }

        public Criteria andAdd8IsNotNull() {
            addCriterion("add8 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd8EqualTo(String value) {
            addCriterion("add8 =", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8NotEqualTo(String value) {
            addCriterion("add8 <>", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8GreaterThan(String value) {
            addCriterion("add8 >", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8GreaterThanOrEqualTo(String value) {
            addCriterion("add8 >=", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8LessThan(String value) {
            addCriterion("add8 <", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8LessThanOrEqualTo(String value) {
            addCriterion("add8 <=", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8Like(String value) {
            addCriterion("add8 like", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8NotLike(String value) {
            addCriterion("add8 not like", value, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8In(List<String> values) {
            addCriterion("add8 in", values, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8NotIn(List<String> values) {
            addCriterion("add8 not in", values, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8Between(String value1, String value2) {
            addCriterion("add8 between", value1, value2, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd8NotBetween(String value1, String value2) {
            addCriterion("add8 not between", value1, value2, "add8");
            return (Criteria) this;
        }

        public Criteria andAdd9IsNull() {
            addCriterion("add9 is null");
            return (Criteria) this;
        }

        public Criteria andAdd9IsNotNull() {
            addCriterion("add9 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd9EqualTo(String value) {
            addCriterion("add9 =", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9NotEqualTo(String value) {
            addCriterion("add9 <>", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9GreaterThan(String value) {
            addCriterion("add9 >", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9GreaterThanOrEqualTo(String value) {
            addCriterion("add9 >=", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9LessThan(String value) {
            addCriterion("add9 <", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9LessThanOrEqualTo(String value) {
            addCriterion("add9 <=", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9Like(String value) {
            addCriterion("add9 like", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9NotLike(String value) {
            addCriterion("add9 not like", value, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9In(List<String> values) {
            addCriterion("add9 in", values, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9NotIn(List<String> values) {
            addCriterion("add9 not in", values, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9Between(String value1, String value2) {
            addCriterion("add9 between", value1, value2, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd9NotBetween(String value1, String value2) {
            addCriterion("add9 not between", value1, value2, "add9");
            return (Criteria) this;
        }

        public Criteria andAdd0IsNull() {
            addCriterion("add0 is null");
            return (Criteria) this;
        }

        public Criteria andAdd0IsNotNull() {
            addCriterion("add0 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd0EqualTo(String value) {
            addCriterion("add0 =", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0NotEqualTo(String value) {
            addCriterion("add0 <>", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0GreaterThan(String value) {
            addCriterion("add0 >", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0GreaterThanOrEqualTo(String value) {
            addCriterion("add0 >=", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0LessThan(String value) {
            addCriterion("add0 <", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0LessThanOrEqualTo(String value) {
            addCriterion("add0 <=", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0Like(String value) {
            addCriterion("add0 like", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0NotLike(String value) {
            addCriterion("add0 not like", value, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0In(List<String> values) {
            addCriterion("add0 in", values, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0NotIn(List<String> values) {
            addCriterion("add0 not in", values, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0Between(String value1, String value2) {
            addCriterion("add0 between", value1, value2, "add0");
            return (Criteria) this;
        }

        public Criteria andAdd0NotBetween(String value1, String value2) {
            addCriterion("add0 not between", value1, value2, "add0");
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