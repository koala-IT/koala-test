package com.shen.test.common.model;

import org.springframework.stereotype.Repository;

@Repository
public class TabFavoriteKey extends BaseDO{
    private String rid;

    private Integer uid;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}