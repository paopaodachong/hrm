package com.cjl.model;

import java.io.Serializable;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
public class Vistor implements Serializable{
    private Integer vistor_id;
    private String vistor_name;
    private String vistor_pass;

    public Vistor() {
    }

    public Integer getVistor_id() {
        return vistor_id;
    }

    public void setVistor_id(Integer vistor_id) {
        this.vistor_id = vistor_id;
    }

    public String getVistor_name() {
        return vistor_name;
    }

    public void setVistor_name(String vistor_name) {
        this.vistor_name = vistor_name;
    }

    public String getVistor_pass() {
        return vistor_pass;
    }

    public void setVistor_pass(String vistor_pass) {
        this.vistor_pass = vistor_pass;
    }

    @Override
    public String toString() {
        return "Vistor{" +
                "vistor_id=" + vistor_id +
                ", vistor_name='" + vistor_name + '\'' +
                ", vistor_pass='" + vistor_pass + '\'' +
                '}';
    }
}
