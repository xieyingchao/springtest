package com.xieyingchao.controller;

import com.xieyingchao.bean.Border;
import com.xieyingchao.mapper.BorderMapper;
import com.xieyingchao.service.BorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 15:45
 */

@RestController
public class BorderController {

    @Autowired
    BorderService borderService;

    @GetMapping("/getBorder")
    public List<Border> getAllBorder(){
        return borderService.getAllBorder();
    }

    @GetMapping("/deleteBorder")
    public boolean deleteBorderById(@RequestParam String id) {
        return borderService.deleteBorderById(id);
    }

    @PostMapping("/updataBorderState")
    public boolean updataBorderState(@RequestBody HashMap<String,String> map){
        String oid = map.get("oid");
        String state = map.get("state");
        return borderService.updateBorderState(oid,state);
    }
}
