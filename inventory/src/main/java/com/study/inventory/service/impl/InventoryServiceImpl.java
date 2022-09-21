package com.study.inventory.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.study.inventory.entity.Inventory;
import com.study.inventory.mapper.InventoryMapper;
import com.study.inventory.service.InventoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Resource
    private InventoryMapper inventoryMapper;

    @Override
    public String reduceInventory(String id) {
        LambdaQueryWrapper<Inventory> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Inventory::getProductId,id);
        Inventory inventory = inventoryMapper.selectOne(lambdaQueryWrapper);
        inventory.setInventoryCount(inventory.getInventoryCount()-1);
        inventoryMapper.updateById(inventory);
        return "ok";
    }
}
