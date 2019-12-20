package com.xieyingchao.controller;
import	java.util.List;
import java.util.Map;

import com.xieyingchao.bean.Book;
import com.xieyingchao.mapper.BookMapper;
import com.xieyingchao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 21:13
 */

@RestController
public class BookController {

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BookService bookService;

    @GetMapping("/select/{id}")
    public Book getBook(@PathVariable("id") String id){
        return bookMapper.getBookbyId(id);
    }

    @GetMapping("/delete")
    public boolean deleteBook(@RequestParam String id){
        return bookService.deleteBook(id);
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks(){
        System.out.println(bookMapper.getAllBook());
        return bookMapper.getAllBook();
    }

    @PostMapping("/insertBook")
    public boolean insertBook(@RequestBody Book book){
        System.out.println(book);
        //return true;
        return bookService.insertBook(book);
    }

    @PostMapping("/updataBook")
    public boolean changeBook(@RequestBody Book book){
        System.out.println(book);
        //return true;
        return bookService.changeBook(book);
    }
}
