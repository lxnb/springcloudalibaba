package com.study.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("u_order")
public class Order {

    @TableId
    private String orderId;
    private String productId;

}
