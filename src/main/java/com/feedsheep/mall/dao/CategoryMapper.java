package com.feedsheep.mall.dao;

import com.feedsheep.mall.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Soft_Sister
 * @version : 1.0
 * @Project : mall
 * @Package : com.feedsheep.mall.dao
 * @ClassName : CategoryMapper.java
 * @createTime : 2022/4/15 0:57
 * @Email : 874280179@qq.com
 * @Description :
 */
public interface CategoryMapper {

    Category findById(@Param("id") int id);

}
