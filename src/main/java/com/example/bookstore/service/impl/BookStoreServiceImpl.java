package com.example.bookstore.service.impl;

import com.example.bookstore.service.BookStoreService;
import com.example.bookstore.vo.BookStore;
import org.springframework.stereotype.Service;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    @Override
    public BookStore findBookStore() {

        BookStore bookStore = new BookStore("东方书城", "计算机");
        return bookStore;
    }
}
