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

    @RequestMapping("findAll")
    public String findAll(){
        return serviceFeign.findAll();
    }

}
