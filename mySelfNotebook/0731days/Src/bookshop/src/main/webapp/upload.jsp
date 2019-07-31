<%--
  Created by IntelliJ IDEA.
  User: txsli
  Date: 2019/7/31
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    username:<input type="text" name="usn"/><br/>
    img:<input type="file" name="file"/><br/>
    <input type="submit" value="SUBMIT"/>
</form>
</body>
</html>
