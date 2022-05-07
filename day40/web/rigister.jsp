<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/28
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    <table border="1px" cellspacing="0" align="center" width="500px" height="400px">
        <tr>
            <td align="right">用户名</td>
            <td>
                <input type="text" name="username" id="username" placeholder="请输入用户名">
                <span id="usernamespan"></span>
            </td>
        </tr>
        <tr>
            <td align="right">密码</td>
            <td>
                <input type="password" name="password" id="password" placeholder="请输入密码">
            </td>
        </tr>
        <tr>
            <td align="right">姓名</td>
            <td>
                <input type="text" name="uname" id="uname">
            </td>
        </tr>
        <tr>
            <td align="right">手机号</td>
            <td>
                <input type="text" name="phone" id="phone">
            </td>
        </tr>
        <tr >
            <td align="right">出生日期</td>
            <td>
                <input type="text" name="birthday" id="birthday">
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="注册">
            </td>
        </tr>
    </table>
  </form>
</body>
    <script src="js/jquery.js"></script>
        <script>
            $(function () {
            //失去焦点时候
                $("#username").blur(
                    function () {
                        $.ajax({
                            url:"CheckUsername",//请求路径
                            data:{"username":$(this).val()},//给服务器参数
                            type:"post",//请求方式
                            //成功 回调函数    obj参数 服务器响应数据
                            success:function (obj) {  //yes可用 no不可用
                                    if (obj=="yes"){//用户名可用
                                            $("#usernamespan").html("用户名可用");
                                    }else {
                                        $("#usernamespan").html("用户名已被注册");
                                    }
                                $("#usernamespan").css({color:"red",fontsize:"14px"});
                            }
                        })

                    }
                )
            })
        </script>
</html>
