package com.cjl.dao;

import com.cjl.model.Interview;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
public interface InterviewMapper {
    boolean addInterview(Interview interview);
    boolean updateInterviewFailed(Interview interview);
    boolean updateInterviewSuccess(Interview interview);

    /**
     * 刷新所有面试信息,刷出过期面试信息
     * @return
     */
    boolean updateInterviews();
}
