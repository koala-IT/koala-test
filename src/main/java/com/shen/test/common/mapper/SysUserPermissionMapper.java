package com.shen.test.common.mapper;

import com.shen.test.common.model.SysUserPermission;
import com.shen.test.common.model.SysUserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserPermissionMapper {
    int countByExample(SysUserPermissionExample example);

    int deleteByExample(SysUserPermissionExample example);

    int deleteByPrimaryKey(String userPermissionId);

    int insert(SysUserPermission record);

    int insertSelective(SysUserPermission record);

    List<SysUserPermission> selectByExample(SysUserPermissionExample example);

    SysUserPermission selectByPrimaryKey(String userPermissionId);

    int updateByExampleSelective(@Param("record") SysUserPermission record, @Param("example") SysUserPermissionExample example);

    int updateByExample(@Param("record") SysUserPermission record, @Param("example") SysUserPermissionExample example);

    int updateByPrimaryKeySelective(SysUserPermission record);

    int updateByPrimaryKey(SysUserPermission record);
}