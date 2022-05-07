<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.offcn.bean.User" %>
<%@ page import="javax.swing.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/15
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  从request作用域中取值  list  --%>
 <%
       // List<User> list = (List<User>)request.getAttribute("llll");

 %>
        <table border="1px" alight="center" cellspacing="0">
                <tr>
                    <td>id</td>
                    <td>用户名</td>
                    <td>密码</td>
                    <td>名字</td>
                    <td>手机号</td>
                    <td>出生日期</td>
                </tr>
           <c:forEach  items="${requestScope.llll}" var="u">
            <tr>
                <td>
                   ${u.id}
                </td>
                <td>
                    ${u.username}
                </td>
                <td>
                    ${u.password}
                </td>
                <td>
                   ${u.name}
                </td>
                <td>
                  ${u.telephone}
                </td>
                <td>
                 ${u.birthday}
                </td>
                <td>
                    <a href="DeleteUserServlet">
                            删除
                    </a>
                </td>
            </tr>

            </c:forEach>
        </table>
</body>
</html>
