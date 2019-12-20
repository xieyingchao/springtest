package com.xieyingchao.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xieyingchao.bean.Book;
import com.xieyingchao.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/12/2 21:28
 */
@RestController
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @GetMapping("/getAllBookInCart")
    public List<Book> getAllBookInCart(@RequestParam String cid){

        return shoppingService.getAllBookInCart(cid);
    }

    @GetMapping("/insertBookToCart")
    public Boolean insertBookToCart(@RequestParam String cid,String bid){
        return shoppingService.insertBookToCart(cid,bid);
    }

    @GetMapping("/deleteBookInCart")
    public boolean deleteBookInCart(@RequestParam String cid,String bid){
        return shoppingService.deleteBookInCart(cid,bid);
    }

}
