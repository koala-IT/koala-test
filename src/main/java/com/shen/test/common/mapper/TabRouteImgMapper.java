package com.shen.test.common.mapper;

import com.shen.test.common.model.TabRouteImg;
import com.shen.test.common.model.TabRouteImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabRouteImgMapper {
    int countByExample(TabRouteImgExample example);

    int deleteByExample(TabRouteImgExample example);

    int deleteByPrimaryKey(String rgid);

    int insert(TabRouteImg record);

    int insertSelective(TabRouteImg record);

    List<TabRouteImg> selectByExample(TabRouteImgExample example);

    TabRouteImg selectByPrimaryKey(String rgid);

    int updateByExampleSelective(@Param("record") TabRouteImg record, @Param("example") TabRouteImgExample example);

    int updateByExample(@Param("record") TabRouteImg record, @Param("example") TabRouteImgExample example);

    int updateByPrimaryKeySelective(TabRouteImg record);

    int updateByPrimaryKey(TabRouteImg record);
}