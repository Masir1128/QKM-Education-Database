package com.qkm.wiki.domain;

import java.util.ArrayList;
import java.util.List;

public class UsermessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsermessageExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("`role` is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("`role` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("`role` =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("`role` <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("`role` >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("`role` >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("`role` <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("`role` <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("`role` like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("`role` not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("`role` in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("`role` not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("`role` between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("`role` not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNull() {
            addCriterion("agency is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNotNull() {
            addCriterion("agency is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyEqualTo(String value) {
            addCriterion("agency =", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotEqualTo(String value) {
            addCriterion("agency <>", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThan(String value) {
            addCriterion("agency >", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("agency >=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThan(String value) {
            addCriterion("agency <", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThanOrEqualTo(String value) {
            addCriterion("agency <=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLike(String value) {
            addCriterion("agency like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotLike(String value) {
            addCriterion("agency not like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyIn(List<String> values) {
            addCriterion("agency in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotIn(List<String> values) {
            addCriterion("agency not in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyBetween(String value1, String value2) {
            addCriterion("agency between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotBetween(String value1, String value2) {
            addCriterion("agency not between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andDepartIsNull() {
            addCriterion("depart is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsNotNull() {
            addCriterion("depart is not null");
            return (Criteria) this;
        }

        public Criteria andDepartEqualTo(String value) {
            addCriterion("depart =", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotEqualTo(String value) {
            addCriterion("depart <>", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThan(String value) {
            addCriterion("depart >", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThanOrEqualTo(String value) {
            addCriterion("depart >=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThan(String value) {
            addCriterion("depart <", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThanOrEqualTo(String value) {
            addCriterion("depart <=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLike(String value) {
            addCriterion("depart like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotLike(String value) {
            addCriterion("depart not like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartIn(List<String> values) {
            addCriterion("depart in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotIn(List<String> values) {
            addCriterion("depart not in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartBetween(String value1, String value2) {
            addCriterion("depart between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotBetween(String value1, String value2) {
            addCriterion("depart not between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
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

        public Criteria andAdd5EqualTo(String value) {
            addCriterion("add5 =", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotEqualTo(String value) {
            addCriterion("add5 <>", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5GreaterThan(String value) {
            addCriterion("add5 >", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5GreaterThanOrEqualTo(String value) {
            addCriterion("add5 >=", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5LessThan(String value) {
            addCriterion("add5 <", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5LessThanOrEqualTo(String value) {
            addCriterion("add5 <=", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5Like(String value) {
            addCriterion("add5 like", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotLike(String value) {
            addCriterion("add5 not like", value, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5In(List<String> values) {
            addCriterion("add5 in", values, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotIn(List<String> values) {
            addCriterion("add5 not in", values, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5Between(String value1, String value2) {
            addCriterion("add5 between", value1, value2, "add5");
            return (Criteria) this;
        }

        public Criteria andAdd5NotBetween(String value1, String value2) {
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

        public Criteria andAdd10IsNull() {
            addCriterion("add10 is null");
            return (Criteria) this;
        }

        public Criteria andAdd10IsNotNull() {
            addCriterion("add10 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd10EqualTo(String value) {
            addCriterion("add10 =", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10NotEqualTo(String value) {
            addCriterion("add10 <>", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10GreaterThan(String value) {
            addCriterion("add10 >", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10GreaterThanOrEqualTo(String value) {
            addCriterion("add10 >=", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10LessThan(String value) {
            addCriterion("add10 <", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10LessThanOrEqualTo(String value) {
            addCriterion("add10 <=", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10Like(String value) {
            addCriterion("add10 like", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10NotLike(String value) {
            addCriterion("add10 not like", value, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10In(List<String> values) {
            addCriterion("add10 in", values, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10NotIn(List<String> values) {
            addCriterion("add10 not in", values, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10Between(String value1, String value2) {
            addCriterion("add10 between", value1, value2, "add10");
            return (Criteria) this;
        }

        public Criteria andAdd10NotBetween(String value1, String value2) {
            addCriterion("add10 not between", value1, value2, "add10");
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