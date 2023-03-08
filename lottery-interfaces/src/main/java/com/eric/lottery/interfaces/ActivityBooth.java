package com.eric.lottery.interfaces;


import com.eric.lottery.common.Constants;
import com.eric.lottery.common.Result;
import com.eric.lottery.infrastructure.dao.IActivityDao;
import com.eric.lottery.infrastructure.po.Activity;
import com.eric.lottery.rpc.IActivityBooth;
import com.eric.lottery.rpc.dto.ActivityDto;
import com.eric.lottery.rpc.req.ActivityReq;
import com.eric.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;


import javax.annotation.Resource;

/**
 * @author 郑涛
 * @version 1.0
 */
@Service
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);

    }
}
