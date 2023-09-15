package com.study.order.follback;

import com.study.core.param.TestParam;
import com.study.order.feign.InventoryFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InventoryFallBack implements InventoryFeign {

    @Override
    public String testGet(String aa) {
        log.error("testGet失败");
        return "error";
    }

    @Override
    public TestParam testPost(TestParam param) {
        log.error("testPost失败");
        return null;
    }

    @Override
    public String reduceInventory(String id) {
        System.out.println("调用扣除库存失败");
        return null;
    }
}
