package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dong
 * @email 130901881@qq.com
 * @date 2020-03-30 18:58:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
