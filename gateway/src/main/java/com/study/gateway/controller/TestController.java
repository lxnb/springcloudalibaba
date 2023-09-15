package com.study.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liuxin
 * @date 2022/3/29
 */
@RestController
@RequestMapping("test")
public class TestController {

//    @Resource
//    private StringRedisTemplate stringRedisTemplate;
//
//    @GetMapping("getValue")
//    public String getValue(){
//        return stringRedisTemplate.opsForValue().get("sys_dict:sys_job_group");
//    }
}
