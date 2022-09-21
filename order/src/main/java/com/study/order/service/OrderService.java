package com.study.order.service;

import com.study.core.param.TestParam;

public interface OrderService {

    String testGet(String aa);

    TestParam testPost(TestParam param);

    String reduceInventory(String id);

}
