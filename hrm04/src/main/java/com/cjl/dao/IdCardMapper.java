package com.cjl.dao;

import com.cjl.model.IdCard;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public interface IdCardMapper {
    boolean addIdCard(IdCard idCard);
    IdCard selectIdCardById(Integer idcard_id);
}
