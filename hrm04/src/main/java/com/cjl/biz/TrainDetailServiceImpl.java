package com.cjl.biz;

import com.cjl.dao.TrainDetailMapper;
import com.cjl.model.Employee;
import com.cjl.model.Train;
import com.cjl.model.TrainDetail;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/7.
 */
@Service
public class TrainDetailServiceImpl  implements TrainDetailService{
    @Resource
    private TrainDetailMapper trainDetailMapper;

    @Override
    public Boolean addTrainDetaiByTrain(Train train, Employee employee) {
        return trainDetailMapper.addTrainDetailByTrain(train, employee);
    }
    @Override
    public List<TrainDetail> getTrainDetailByEmployeeId(Integer employeeId) {
        return trainDetailMapper.getTrainDetailByEmployeeId(employeeId);
    }
}
