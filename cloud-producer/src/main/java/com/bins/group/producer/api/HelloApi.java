package com.bins.group.producer.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer")
public interface HelloApi {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
