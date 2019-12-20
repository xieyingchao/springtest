package com.xieyingchao.controller;
import java.util.List;
import java.util.Map;

import com.xieyingchao.bean.Book;
import com.xieyingchao.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 11:43
 */

@Controller
public class QueryController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    BookMapper bookMapper;

    @ResponseBody
    @RequestMapping("/query")
    public Map<String, Object> map(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select bid,bname from book");
        return maps.get(0);
    }

    @ResponseBody
    @GetMapping("/selectall")
    public Book getBook(@RequestParam("id") String bid){
        return bookMapper.getBookbyId(bid);
    }

}
