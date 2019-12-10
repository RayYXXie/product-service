package com.example.bookstore.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "book-project")
public interface ServiceFeign {

    @GetMapping("findAll") //  这个findAll有什么用，把它变成abc，我怀疑这个才是关键，所以如果这里变成abc, 现在controller的findAll方法也要变成abc
    String findAll();      //  这个findAll是不是要和controller的一致, 把controller的findAll方法变成aaa, 看可不可以
}
