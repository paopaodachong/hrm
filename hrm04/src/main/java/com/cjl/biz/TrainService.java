package com.cjl.biz;

import com.cjl.model.Train;
import com.cjl.model.TrainDetail;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
public interface TrainService {
    boolean addTrain(Train train);
    Integer getIdByTrain(Train train);

}
