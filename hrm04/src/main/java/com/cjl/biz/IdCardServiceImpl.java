package com.cjl.biz;

import com.cjl.dao.IdCardMapper;
import com.cjl.model.IdCard;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
@Service
public class IdCardServiceImpl implements IdCardService {
    @Resource
    private IdCardMapper idCardMapper;

    /**
     * 添加个人信息
     * @param idCard
     * @return
     */
    @Override
    public boolean addIdCard(IdCard idCard) {
        return idCardMapper.addIdCard(idCard);
    }

    /**
     * 根据游客id选取个人信息
     * @param vistor_id
     * @return
     */
    @Override
    public IdCard selectIdCardByVistorId(Integer vistor_id) {
        return idCardMapper.selectIdCardByVistorId(vistor_id);
    }
}
