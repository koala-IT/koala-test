package com.shen.test.common.biz;

import com.shen.test.common.mapper.TabUserMapper;
import com.shen.test.common.model.BaseDO;
import com.shen.test.common.model.BaseExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //子类
public class TabUserService<T extends BaseDO,E extends BaseExample> extends BaseService<T,E> {
    private Logger logger = Logger.getLogger(TabUserService.class);

    @Autowired
    private TabUserMapper<T,E> tabUserMapper;

    public TabUserService(){
        if (logger != null){
            this.setLogger(logger);
        }
    }

    public TabUserMapper<T, E> getTabUserMapper() {
        return tabUserMapper;
    }

    public void setTabUserMapper(TabUserMapper<T, E> tabUserMapper) {
        this.tabUserMapper = tabUserMapper;
    }
}

