package com.study.order.feign;

import com.study.core.param.TestParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cloud-inventory",path ="/cloud-inventory/inventory")
public interface InventoryFeign {

    @GetMapping("/testGet")
    String testGet(@RequestParam("aa") String aa);

    @PostMapping("/testPost")
    TestParam testPost(@RequestBody TestParam param);


    //扣库存
    @GetMapping("/reduceInventory")
    String reduceInventory(@RequestParam("id") String id);
}
