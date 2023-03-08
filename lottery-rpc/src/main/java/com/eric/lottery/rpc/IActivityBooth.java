package com.eric.lottery.rpc;

import com.eric.lottery.rpc.req.ActivityReq;
import com.eric.lottery.rpc.res.ActivityRes;

/**
 * @author 郑涛
 * @version 1.0
 */
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
