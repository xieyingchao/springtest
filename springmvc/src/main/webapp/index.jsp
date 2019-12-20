<%--
  Created by IntelliJ IDEA.
  User: 谢迎超
  Date: 2019/8/1
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <h1>xyc</h1>
    <a href="controller/hello?username=123&&pwd=456">hello</a>
    <input type="button" id="btn" value="提交">
    <br>

    <form action="controller/testUpload" method="post" enctype="multipart/form-data">
        非文件上传: <input type="text" name="unupload"><br>
        文件上传: <input type="file" name="upload" value="上传">
        <br>
        <input type="submit" value="提交">
    </form>
    <br>
    <form action="controller/testUpload2" method="post" enctype="multipart/form-data">
        文件上传: <input type="file" name="upload"><br>
        <input type="submit" value="提交">
    </form>
</body>
<script>
    $(function () {
        $('#btn').click(function () {
            // alert("dianjil");
            $.ajax({
                url:'controller/testAjax',
                contentType:'application/json;charset=UTF-8',
                data:'{"username":"xieyingchao","password":"123456","money":2000}',
                dataType:'json',
                type:'post',
                success:function (data) {
                    alert(data);
                    alert(data.username);
                }
            });
        });
    });
</script>
</html>
