package com.shen.test.common.mapper;

import com.shen.test.common.model.SysPermissionModule;
import com.shen.test.common.model.SysPermissionModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionModuleMapper {
    int countByExample(SysPermissionModuleExample example);

    int deleteByExample(SysPermissionModuleExample example);

    int deleteByPrimaryKey(String permissionModuleId);

    int insert(SysPermissionModule record);

    int insertSelective(SysPermissionModule record);

    List<SysPermissionModule> selectByExample(SysPermissionModuleExample example);

    SysPermissionModule selectByPrimaryKey(String permissionModuleId);

    int updateByExampleSelective(@Param("record") SysPermissionModule record, @Param("example") SysPermissionModuleExample example);

    int updateByExample(@Param("record") SysPermissionModule record, @Param("example") SysPermissionModuleExample example);

    int updateByPrimaryKeySelective(SysPermissionModule record);

    int updateByPrimaryKey(SysPermissionModule record);
}