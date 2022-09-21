package com.study.inventory.controller;

import com.study.core.param.TestParam;
import com.study.inventory.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {

    @Value("${server.servlet.context-path}")
    private String path;
    @Resource
    private InventoryService inventoryService;

    @GetMapping("test")
    public void test(){
        log.info("----{}----",path);
    }


    @GetMapping("/testGet")
    public String testGet(@RequestParam("aa") String aa){
        log.info(aa);
        return aa;
    }

    @PostMapping("/testPost")
    public TestParam testPost(@RequestBody TestParam param){
        log.info(param.toString());
        return param;
    }


    @GetMapping("/reduceInventory")
    public String reduceInventory(@RequestParam("id") String id){
        return inventoryService.reduceInventory(id);
    }


}
