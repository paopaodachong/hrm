package com.cjl.model;

import java.io.Serializable;

/**
 * Created by 陈佳乐 on 2018/5/3.
 */
public class TrainDetail implements Serializable {
    private Integer trainDetail_id;
    private Train train;
    private Employee employee;

    public TrainDetail() {
    }

    public Integer getTrainDetail_id() {
        return trainDetail_id;
    }

    public void setTrainDetail_id(Integer trainDetail_id) {
        this.trainDetail_id = trainDetail_id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
