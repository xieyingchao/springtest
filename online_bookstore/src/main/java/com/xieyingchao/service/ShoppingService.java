package com.xieyingchao.service;

import com.xieyingchao.bean.Book;
import com.xieyingchao.mapper.ShoppingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/12/2 21:28
 */
@Service
public class ShoppingService {

    @Autowired
    ShoppingMapper shoppingMapper;

    public List<Book> getAllBookInCart(String cid){
        return shoppingMapper.getAllBookInCart(cid);
    }

    public boolean insertBookToCart(String cid,String bid){
        int flag = shoppingMapper.insertBookToCart(cid,bid);
        if(1 == flag){
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteBookInCart(String cid,String bid){
        int flag = shoppingMapper.deleteBookInCart(cid,bid);
        if(1 == flag) return true;
        else return false;
    }
}
