package com.shen.test.common.model;

import org.springframework.stereotype.Repository;

@Repository
public class SysUserPermission extends BaseDO{
    private String userPermissionId;

    private String userId;

    private String permissionId;

    private String moduleId;

    public String getUserPermissionId() {
        return userPermissionId;
    }

    public void setUserPermissionId(String userPermissionId) {
        this.userPermissionId = userPermissionId == null ? null : userPermissionId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }
}