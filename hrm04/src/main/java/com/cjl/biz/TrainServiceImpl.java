package com.cjl.biz;

import com.cjl.dao.TrainDetailMapper;
import com.cjl.dao.TrainMapper;
import com.cjl.model.Employee;
import com.cjl.model.Train;
import com.cjl.model.TrainDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
@Service
public class TrainServiceImpl implements TrainService {

    //根据表单添加培训
    @Resource
    private TrainMapper trainMapper;
    @Resource
    private TrainDetailMapper trainDetailMapper;
    @Override
    public boolean addTrain(Train train) {

        return trainMapper.addTrain(train);


    }

    @Override
    public Integer getIdByTrain(Train train) {
        return trainMapper.getIdByTrain(train);
    }


}
