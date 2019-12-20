package com.xieyingchao.service;

import com.xieyingchao.bean.Book;
import com.xieyingchao.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 23:35
 */
@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getAllBook(){
        return bookMapper.getAllBook();
    }

    public boolean deleteBook(String id){
        int result = bookMapper.deleteBookById(id);
        if(1 == result){
            return true;
        }else{
            return false;
        }
    }

    public boolean insertBook(Book book){
        int result = bookMapper.insertBook(book);
        if(1 == result){
            return true;
        }else{
            return false;
        }
    }

    public boolean changeBook(Book book){
        int result = bookMapper.updataBook(book);
        if(1 == result){
            return true;
        }else {
            return false;
        }
    }
}
