package com.cjl.model;

import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/4/23.
 */
public class IdCard {
    //可作为实名制认证
    //存储的个人信息的序列号
    private Integer idcard_id;
    //身份证号码
    private String idcard_num;
    //身份证名字
    private String idcard_name;
    //身份证性别
    private String gender;
    //生日
    private Date idcard_birthday;
    //家庭住址
    private String idcard_address;
    //对应一个游客,由游客创建
    private Vistor vistor;

    public IdCard() {
    }

    public Integer getIdcard_id() {
        return idcard_id;
    }

    public void setIdcard_id(Integer idcard_id) {
        this.idcard_id = idcard_id;
    }

    public String getIdcard_num() {
        return idcard_num;
    }

    public void setIdcard_num(String idcard_num) {
        this.idcard_num = idcard_num;
    }

    public String getIdcard_name() {
        return idcard_name;
    }

    public void setIdcard_name(String idcard_name) {
        this.idcard_name = idcard_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getIdcard_birthday() {
        return idcard_birthday;
    }

    public void setIdcard_birthday(Date idcard_birthday) {
        this.idcard_birthday = idcard_birthday;
    }

    public String getIdcard_address() {
        return idcard_address;
    }

    public void setIdcard_address(String idcard_address) {
        this.idcard_address = idcard_address;
    }

    public Vistor getVistor() {
        return vistor;
    }

    public void setVistor(Vistor vistor) {
        this.vistor = vistor;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "idcard_id=" + idcard_id +
                ", idcard_num='" + idcard_num + '\'' +
                ", idcard_name='" + idcard_name + '\'' +
                ", gender='" + gender + '\'' +
                ", idcard_birthday=" + idcard_birthday +
                ", idcard_address='" + idcard_address + '\'' +
                ", vistor=" + vistor +
                '}';
    }
}
