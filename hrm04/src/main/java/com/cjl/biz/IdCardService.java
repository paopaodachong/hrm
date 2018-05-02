package com.cjl.biz;

import com.cjl.model.IdCard;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public interface IdCardService {
    boolean addIdCard(IdCard idCard);
    IdCard selectIdCardByVistorId(Integer vistor_id);
}
