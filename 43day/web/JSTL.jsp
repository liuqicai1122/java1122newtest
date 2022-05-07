<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/18
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <c:if test="${requestScope.user2.age==20}">
            啊哈哈哈哈
        </c:if>
    <br>
        <c:choose>
            <c:when test="${requestScope.user2.age > 18}">
                已成年
            </c:when>
            <c:otherwise>
                未成年
            </c:otherwise>
        </c:choose>

</body>
</html>
