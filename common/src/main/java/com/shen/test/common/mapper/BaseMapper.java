//Basemapper:负责大部分的业务逻辑 如增、删、改、查

package com.shen.test.common.mapper;


import com.shen.test.common.querypage.QueryPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by shen on 2016/10/27.
 */
public interface BaseMapper<T,E> {

    int countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(String smsCodeId);

    int insert(T record);

    int insertSelective(T record);

    List<? extends T> selectByExample(E example);

    T selectByPrimaryKey(String smsCodeId);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
    int getQueryTotalCount(Map map);
    
    List<? extends T> getQueryPageList(Map map, QueryPage page);
}
