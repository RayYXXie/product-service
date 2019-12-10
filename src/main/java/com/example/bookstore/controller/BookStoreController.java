package com.example.bookstore.controller;

import com.example.bookstore.feign.ServiceFeign;
import com.example.bookstore.service.BookStoreService;
import com.example.bookstore.vo.BookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

    @Autowired
    public BookStoreService bookStoreService;

    @Autowired
    private ServiceFeign serviceFeign;

    @RequestMapping("findBookStore")
    public BookStore findBookStore(){

        return bookStoreService.findBookStore();
    }

    @RequestMapping("findAll")    // 这个findAll应该只是restful的名称，没什么特别
    public String findAll(){     // 这个findAll是不是要和SerivceFeign的方法一致？试试换成aaa, 看可不可以
        return serviceFeign.findAll();
    }

}
