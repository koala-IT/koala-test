package com.shen.test.common.mapper;

import com.shen.test.common.model.BaseDO;
import com.shen.test.common.model.BaseExample;
import com.shen.test.common.model.TabCategory;
import com.shen.test.common.model.TabCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TabCategoryMapper<T extends BaseDO,E extends BaseExample> extends BaseMapper<T,E> {

}