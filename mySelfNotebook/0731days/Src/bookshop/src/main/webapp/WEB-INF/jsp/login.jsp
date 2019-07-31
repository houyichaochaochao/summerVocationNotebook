<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login page</title>
</head>
<body>
LoginPage <br/>
<form action="login" method="post">
username:<input type="text" name="usn"/><br/>
password:<input type="password" name="pwd"/><br/>
age:<input type="text" name="age"/><br/>
salary:<input type="text" name="salary"/><br/>
<input type="submit" value = "登录"/>
</form>
<a href="register">Register</a>
</body>
</html>