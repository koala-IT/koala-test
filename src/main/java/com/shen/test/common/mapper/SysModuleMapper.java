package com.shen.test.common.mapper;

import com.shen.test.common.model.SysModule;
import com.shen.test.common.model.SysModuleExample;
import com.shen.test.common.model.SysModuleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModuleMapper {
    int countByExample(SysModuleExample example);

    int deleteByExample(SysModuleExample example);

    int deleteByPrimaryKey(String moduleId);

    int insert(SysModuleWithBLOBs record);

    int insertSelective(SysModuleWithBLOBs record);

    List<SysModuleWithBLOBs> selectByExampleWithBLOBs(SysModuleExample example);

    List<SysModule> selectByExample(SysModuleExample example);

    SysModuleWithBLOBs selectByPrimaryKey(String moduleId);

    int updateByExampleSelective(@Param("record") SysModuleWithBLOBs record, @Param("example") SysModuleExample example);

    int updateByExampleWithBLOBs(@Param("record") SysModuleWithBLOBs record, @Param("example") SysModuleExample example);

    int updateByExample(@Param("record") SysModule record, @Param("example") SysModuleExample example);

    int updateByPrimaryKeySelective(SysModuleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysModuleWithBLOBs record);

    int updateByPrimaryKey(SysModule record);
}