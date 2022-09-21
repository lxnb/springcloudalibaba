package com.study.order.service.impl;

import com.study.core.param.TestParam;
import com.study.order.entity.Order;
import com.study.order.feign.InventoryFeign;
import com.study.order.mapper.OrderMapper;
import com.study.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private InventoryFeign inventoryFeign;
    @Resource
    private OrderMapper orderMapper;

    @Override
    public String testGet(String aa) {
        return inventoryFeign.testGet(aa);
    }

    @Override
    public TestParam testPost(TestParam param) {
        return inventoryFeign.testPost(param);
    }

    @Override
    @Transactional
    //@GlobalTransactional
    public String reduceInventory(String id) {
        //新增订单
        Order order=new Order();
        order.setOrderId(UUID.randomUUID().toString().replace("-",""));
        order.setProductId(id);
        int insert = orderMapper.insert(order);
        //扣减库存
        String s = inventoryFeign.reduceInventory(id);
        //手动报错测试分布式事务
        int a=1/0;
        return "ok";
    }
}
