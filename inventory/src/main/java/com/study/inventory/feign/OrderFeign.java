package com.study.inventory.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "cloud-order",path ="/cloud-order/order")
public interface OrderFeign {


}
