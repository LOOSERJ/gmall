package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dong
 * @email 130901881@qq.com
 * @date 2020-03-29 23:21:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
