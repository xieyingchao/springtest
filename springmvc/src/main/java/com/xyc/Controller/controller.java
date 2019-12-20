package com.xyc.Controller;

import com.xyc.domain.Account;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("controller")
public class controller {

    /**
    * @Description TODO
    * @Param username
    * @Param pwd
    * @Return java.lang.String
    * @Author xieyingchao
    * @Date 2019/8/1 16:22
    **/
    @RequestMapping(path = "/hello",params = {"username","pwd"})
    public String control(String username, String pwd){
        System.out.println("hello springmvc");
        System.out.println("username="+username+"pwd="+pwd);
        return "success";
    }

    /**
    * @Description TODO
    * @Param account
    * @Return java.lang.String
    * @Author xieyingchao
    * @Date 2019/8/1 17:30
    **/
    @RequestMapping(value = "/testParam")
    public String testParam(Account account){
        System.out.println("---------");
        System.out.println(account);
        return "success";
    }

    /**
    * @Description ajax异步处理
    * @Param account
    * @Return com.xyc.domain.Account
    * @Author xieyingchao
    * @Date 2019/8/4 16:11
    **/
    @RequestMapping("/testAjax")
    public @ResponseBody Account testAjax(@RequestBody Account account){
        System.out.println("----------执行testAjax");
        System.out.println(account);
        account.setMoney(3000);
        return account;
    }

    /**
    * @Description 文件上传
    * @Param request
    * @Return java.lang.String
    * @Author xieyingchao
    * @Date 2019/8/4 16:11
    **/
    @RequestMapping("/testUpload")
    public String testUpload(HttpServletRequest request) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
//        创建磁盘文件项工厂
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);
//        解析request
        List<FileItem> fileItems = fileUpload.parseRequest(request);
        for (FileItem fileItem:fileItems){
            if (fileItem.isFormField()){
                System.out.println("是普通表单文件");
                System.out.println(fileItem.getString("UTF-8"));
            }else{
                String filename = fileItem.getName();
                UUID uuid = UUID.randomUUID();
                filename = uuid +"_"+ filename;
                fileItem.write(new File(file,filename));
                fileItem.delete();
            }
        }
        return "success";
    }

    /**
    * @Description springmvc文件上传
    * @Param request
    * @Param upload
    * @Return java.lang.String
    * @Author xieyingchao
    * @Date 2019/8/4 17:24
    **/
    @RequestMapping("/testUpload2")
    public String testUpload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("------testUpload2------");
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }

        String filename = upload.getOriginalFilename();
        UUID uuid = UUID.randomUUID();
        filename = uuid +"_"+ filename;
        upload.transferTo(new File(file,filename));
        return "success";
    }
}
