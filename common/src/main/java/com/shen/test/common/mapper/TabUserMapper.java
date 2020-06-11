package com.shen.test.common.mapper;

import com.shen.test.common.model.BaseDO;
import com.shen.test.common.model.BaseExample;
import com.shen.test.common.model.TabUser;
import com.shen.test.common.model.TabUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TabUserMapper<T extends BaseDO,E extends BaseExample> extends BaseMapper<T,E> {

}