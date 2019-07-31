package com.test.bookshop.biz.impl;

import com.test.bookshop.biz.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<String> getAllBooks() {
        List<String> books = new ArrayList<>();
        books.add("booka");
        books.add("bookb");
        books.add("bookc");
        return books;
    }
}
