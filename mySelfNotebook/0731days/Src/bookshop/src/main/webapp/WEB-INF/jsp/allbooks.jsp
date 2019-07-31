<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: txsli
  Date: 2019/7/31
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AllBooks</title>
</head>
<body>

${sessionScope.usn} - ${sessionScope.pwd} - ${sessionScope.user.age}<br/>
<c:forEach var="book" items="${books}">
    ${book} <br/>
</c:forEach>

</body>
</html>
