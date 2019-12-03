package com.example.bookstore.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "book-project")
public interface ServiceFeign {

    @GetMapping("findAll")
    String findAll();
}
