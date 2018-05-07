package com.cjl.dao;

import com.cjl.model.Train;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
public interface TrainMapper {
    boolean addTrain(Train train);
    Integer getIdByTrain(Train train);
    Train selectTrainByTrainId(Integer trainId);
}
