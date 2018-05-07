package com.cjl.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
public class Train implements Serializable {
    //培训id
    private Integer train_id;
    //培训主题
    private String train_theme;
    //培训详情
    private String train_desc;

    //培训开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date train_startDate;
    //培训地点
    private String train_address;

    public Train() {
    }

    public Integer getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Integer train_id) {
        this.train_id = train_id;
    }

    public String getTrain_theme() {
        return train_theme;
    }

    public void setTrain_theme(String train_theme) {
        this.train_theme = train_theme;
    }

    public String getTrain_desc() {
        return train_desc;
    }

    public void setTrain_desc(String train_desc) {
        this.train_desc = train_desc;
    }

    public Date getTrain_startDate() {
        return train_startDate;
    }

    public void setTrain_startDate(Date train_startDate) {
        this.train_startDate = train_startDate;
    }

    public String getTrain_address() {
        return train_address;
    }

    public void setTrain_address(String train_address) {
        this.train_address = train_address;
    }
}
