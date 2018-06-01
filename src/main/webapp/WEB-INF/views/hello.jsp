<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/4/17
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello-World</title>
</head>
<body>

    <table cellpadding="0" cellspacing="0" border="1">
        <tr>
            <td>主键</td>
            <td>城市名</td>
            <td>城市代码</td>
            <td>城市描述</td>
            <td>城市人口</td>
        </tr>
        <c:forEach items="${all}" var="hello">
            <tr>
                <td>${hello.id}</td>
                <td>${hello.name}</td>
                <td>${hello.countryCode}</td>
                <td>${hello.district}</td>
                <td>${hello.population}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
