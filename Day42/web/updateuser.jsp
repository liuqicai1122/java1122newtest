<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/19
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="UpdateUserServlet" method="post">
            <table border="1px" cellspacing="0" width="500" align="center">
                <tr>
                    <td>
                        <input type="hidden"  name="id" value="${requestScope.user.id}">
                    </td>
                </tr>
            <tr>
                <td align="right">
                    用户名
                </td>
                <td>
                    <input type="txet" name="username" value="${requestScope.user.username}">
                </td>
            </tr>
                <tr>
                    <td align="right">
                        密码
                    </td>
                    <td>
                        <input type="txet" name="password" value="${requestScope.user.password}">
                    </td>
                </tr>
                <tr>
                    <td align="right">
                        姓名
                    </td>
                    <td>
                        <input type="txet" name="name" value="${requestScope.user.name}">
                    </td>
                </tr>
                <tr>
                    <td align="right">
                        手机号
                    </td>
                    <td>
                        <input type="txet" name="telephone" value="${requestScope.user.telephone}">
                    </td>
                </tr>
                <tr>
                    <td align="right">
                        出生日期
                    </td>
                    <td>
                        <input type="txet" name="birthday" value="${requestScope.user.birthday}">
                    </td>
                </tr>
                <tr>
                    <td align="center" >
                        <input type="submit" value="更新" >
                    </td>
                </tr>
            </table>
        </form>


</body>
</html>
