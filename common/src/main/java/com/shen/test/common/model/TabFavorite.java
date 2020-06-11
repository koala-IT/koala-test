package com.shen.test.common.model;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TabFavorite extends TabFavoriteKey {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}