package com.feedsheep.mall.dao;

import com.feedsheep.mall.MallApplicationTests;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : FeedSheep
 * @version : 1.0
 * @Project : mall
 * @Package : com.feedsheep.mall.dao
 * @ClassName : OrderMapperTest.java
 * @createTime : 2022/4/29 0:50
 * @Email : 874280179@qq.com
 * @Description :
 */
public class OrderMapperTest extends MallApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        System.out.println(orderMapper.selectByPrimaryKey(1));
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}