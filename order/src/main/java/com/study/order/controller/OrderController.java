package com.study.order.controller;

import com.study.core.param.TestParam;
import com.study.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;
//    @Value("${store.db.datasource}")
//    public String datasource;
//
//
//    @GetMapping("test")
//    public String tset(){
//        return datasource;
//    }

    @GetMapping("/testGet")
    public String testGet(@RequestParam("aa") String aa){
       return orderService.testGet(aa);
    }

    @PostMapping("/testPost")
    public TestParam testPost(@RequestBody TestParam param){
        return orderService.testPost(param);
    }


    @GetMapping("reduceInventory")
    public String reduceInventory(@RequestParam("id") String id){
        return orderService.reduceInventory(id);
    }
}
