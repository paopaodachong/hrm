package com.cjl.dao;

import com.cjl.model.Train;
import com.cjl.model.TrainDetail;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
public interface TrainDetailMapper {
    boolean addTrainDetail(TrainDetail trainDetail);
    boolean addTrainDetailByTrainIdAndEmployeeId(Integer train_id,Integer employee_id);
}
