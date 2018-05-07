package com.cjl.dao;

import com.cjl.model.Employee;
import com.cjl.model.Train;
import com.cjl.model.TrainDetail;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
public interface TrainDetailMapper {
    boolean addTrainDetail(TrainDetail trainDetail);
    boolean addTrainDetailByTrainIdAndEmployeeId(Integer employee_id,Integer train_id);
    boolean addTrainDetailByTrain(Train train, Employee employee);
    List<TrainDetail> getTrainDetailByEmployeeId(Integer employeeId);
}
