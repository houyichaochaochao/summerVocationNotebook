package com.test.bookshop.web.controller;

import com.test.bookshop.biz.BookService;
import com.test.bookshop.domain.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public ModelAndView getAllBooks(@SessionAttribute("user") User user){
        System.out.println(user.getPwd());
        List<String> books = bookService.getAllBooks();
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("allbooks");
        return mv;
    }
}
