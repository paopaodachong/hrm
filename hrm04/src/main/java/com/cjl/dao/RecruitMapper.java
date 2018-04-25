package com.cjl.dao;

import com.cjl.model.Recruit;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
public interface RecruitMapper {
    boolean add(Recruit recruit);
    List<Recruit> getAll();

}
