package com.eric.lottery.rpc.req;

import java.io.Serializable;

/**
 * @author 郑涛
 * @version 1.0
 */
public class ActivityReq implements Serializable {
    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
