package com.xieyingchao;

import com.xieyingchao.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnlineBookstoreApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {

        System.out.println(bookMapper.deleteBookById("201"));
    }

}
