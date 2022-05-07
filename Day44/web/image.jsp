<%@ page import="com.offcn.cookieutils.CookieUtil" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/21
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="Demo02CookieServlet?id=1">
           图片1 <img src="D:\image\1.jpeg">
        </a>
        <a href="Demo02CookieServlet?id=2">
            图片2 <img src="D:\image\2.jpg">
        </a>
        <a href="Demo02CookieServlet?id=3">
            图片3 <img src="D:\image\3.jpg">
        </a>
        <a href="Demo02CookieServlet?id=4">
            图片4 <img src="D:\image\4.jpg">
        </a>
        <br>
        浏览记录:
        <%
            Cookie[] cookies = request.getCookies();
            Cookie cookie = CookieUtil.findCookie(cookies, "product");
            if (cookie!=null){
                String value = cookie.getValue();
                String[] s = value.split("_");
                for (String ss:s){
        %>
        <%=ss%>
        <img src="img src=D:\image\<%=ss%>.jpg" style="width: 150px">

    <%}
    }
    %>
        <hr>
        <a href="ClearCookie">
            清除浏览器记录
        </a>

</body>
</html>
