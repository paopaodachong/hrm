package com.cjl.dao;

import com.cjl.model.IdCard;
import com.cjl.model.Vistor;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
public interface VistorMapper {
    Vistor login(Vistor vistor);
    boolean add(Vistor vistor);
    Vistor selectVistorById(Integer vistor_id);
}
