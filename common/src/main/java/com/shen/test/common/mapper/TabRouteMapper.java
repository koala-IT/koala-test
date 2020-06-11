package com.shen.test.common.mapper;

import com.shen.test.common.model.BaseDO;
import com.shen.test.common.model.BaseExample;
import com.shen.test.common.model.TabRoute;
import com.shen.test.common.model.TabRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TabRouteMapper<T extends BaseDO,E extends BaseExample> extends BaseMapper<T,E> {

}