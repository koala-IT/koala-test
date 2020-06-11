package com.shen.test.common.mapper;

import com.shen.test.common.model.*;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TabFavoriteMapper<T extends BaseDO,E extends BaseExample> extends BaseMapper<T,E> {

}