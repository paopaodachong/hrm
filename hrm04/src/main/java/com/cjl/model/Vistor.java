package com.cjl.model;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
public class Vistor {
    private String name;
    private String pass;

    public Vistor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Vistor{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
