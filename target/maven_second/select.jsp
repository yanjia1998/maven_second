
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2020/11/10
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>select</title>
</head>
<body>
<div>
    <table border="1" cellspacing="0">
        <tr>
            <th>用户姓名</th>
            <th>用户地址</th>
            <th>用户性别</th>
        </tr>

        <c:forEach items="${list}"  var="user" >
            <tr>
                <th>${user.name}</th>
                <th>${user.addr}</th>
                <th>${user.sex}</th>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
