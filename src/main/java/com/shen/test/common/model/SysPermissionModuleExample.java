package com.shen.test.common.model;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionModuleExample() {
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

        public Criteria andPermissionModuleIdIsNull() {
            addCriterion("permission_module_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdIsNotNull() {
            addCriterion("permission_module_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdEqualTo(String value) {
            addCriterion("permission_module_id =", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdNotEqualTo(String value) {
            addCriterion("permission_module_id <>", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdGreaterThan(String value) {
            addCriterion("permission_module_id >", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("permission_module_id >=", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdLessThan(String value) {
            addCriterion("permission_module_id <", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdLessThanOrEqualTo(String value) {
            addCriterion("permission_module_id <=", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdLike(String value) {
            addCriterion("permission_module_id like", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdNotLike(String value) {
            addCriterion("permission_module_id not like", value, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdIn(List<String> values) {
            addCriterion("permission_module_id in", values, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdNotIn(List<String> values) {
            addCriterion("permission_module_id not in", values, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdBetween(String value1, String value2) {
            addCriterion("permission_module_id between", value1, value2, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionModuleIdNotBetween(String value1, String value2) {
            addCriterion("permission_module_id not between", value1, value2, "permissionModuleId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(String value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(String value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(String value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(String value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLike(String value) {
            addCriterion("permission_id like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotLike(String value) {
            addCriterion("permission_id not like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<String> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<String> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("module_id like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("module_id not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleTreeIsNull() {
            addCriterion("module_tree is null");
            return (Criteria) this;
        }

        public Criteria andModuleTreeIsNotNull() {
            addCriterion("module_tree is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTreeEqualTo(String value) {
            addCriterion("module_tree =", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeNotEqualTo(String value) {
            addCriterion("module_tree <>", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeGreaterThan(String value) {
            addCriterion("module_tree >", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeGreaterThanOrEqualTo(String value) {
            addCriterion("module_tree >=", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeLessThan(String value) {
            addCriterion("module_tree <", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeLessThanOrEqualTo(String value) {
            addCriterion("module_tree <=", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeLike(String value) {
            addCriterion("module_tree like", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeNotLike(String value) {
            addCriterion("module_tree not like", value, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeIn(List<String> values) {
            addCriterion("module_tree in", values, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeNotIn(List<String> values) {
            addCriterion("module_tree not in", values, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeBetween(String value1, String value2) {
            addCriterion("module_tree between", value1, value2, "moduleTree");
            return (Criteria) this;
        }

        public Criteria andModuleTreeNotBetween(String value1, String value2) {
            addCriterion("module_tree not between", value1, value2, "moduleTree");
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