package com.study.inventory.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("inventory")
@Data
public class Inventory {

    @TableId
    private String inventoryId;
    private String productId;
    private Integer inventoryCount;

}
