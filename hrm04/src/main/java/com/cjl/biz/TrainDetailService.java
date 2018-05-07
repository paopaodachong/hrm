package com.cjl.biz;

import com.cjl.model.Employee;
import com.cjl.model.Train;
import com.cjl.model.TrainDetail;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/7.
 */
public interface TrainDetailService {
    Boolean addTrainDetaiByTrain(Train train, Employee employee);
    List<TrainDetail> getTrainDetailByEmployeeId(Integer employeeId);
}
