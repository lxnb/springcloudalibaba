package com.study.inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liuxin
 * @date 2022/3/16
 */
@Configuration
@EnableSwagger2
public class Swagger2Conf {

    @Bean
    public Docket getUserDocket(){
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("库存")//api标题
                .description("库存相关接口")//api描述
                .version("1.0.0")//版本号
                .build();
        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
                .apiInfo(apiInfo)//设置包含在json ResourceListing响应中的api元信息
                .select()//启动用于api选择的构建器
                .apis(RequestHandlerSelectors.basePackage("com.study.inventory.controller"))//扫描接口的包
                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
                .build();
    }

}
