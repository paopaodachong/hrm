package com.cjl.biz;

import com.cjl.model.Vistor;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
public interface VistorServicec {
    Vistor login(Vistor vistor);
    boolean register(Vistor vistor);
    Vistor selectById(Integer vistor_id);

}
