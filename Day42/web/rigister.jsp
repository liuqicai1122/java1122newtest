<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="RigisterServlet" method="post">
            <table>
                <tr>
                    <td align="right" >
                        用户名
                    </td>
                    <td>
                        <input type="text" name="username" placeholder="请输入用户名">
                    </td>
                </tr>
                <tr>
                    <td align="right" >
                        密码
                    </td>
                    <td>
                        <input type="password" name="password" placeholder="请输入密码">
                    </td>
                </tr>
                <tr>
                    <td align="right" >
                        姓名
                    </td>
                    <td>
                        <input type="text" name="name" placeholder="请输入姓名">
                    </td>
                </tr>
                <tr>
                    <td align="right" >
                        电话号
                    </td>
                    <td>
                        <input type="text" name="telephone" placeholder="请输入电话号">
                    </td>
                </tr>
                <tr>
                    <td align="right" >
                        生日
                    </td>
                    <td>
                        <input type="text" name="birthday" placeholder="请输入生日">
                    </td>
                </tr>
            <tr align="center">
                <td colspan="2">
                        <input type="submit" value="注册" >
                </td>
            </tr>
            </table>
        </form>
</body>
</html>
