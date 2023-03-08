package com.eric.lottery.infrastructure.dao;

import com.eric.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 郑涛
 * @version 1.0
 */
@Mapper
public interface IActivityDao {
    void insert(Activity req);

    Activity queryActivityById(Long activityId);

}
