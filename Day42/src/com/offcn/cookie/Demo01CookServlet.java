package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo01CookServlet")
public class Demo01CookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                //创建cookie
        Cookie cookie = new Cookie("name", "java");
        Cookie cookie1 = new Cookie("age", 13 + "");
                //设置属性 存活时间
        cookie.setMaxAge(10);
        cookie1.setMaxAge(10);
        //设置属性 访问路径
        cookie.setPath("/");
        cookie1.setPath("/");
                //将cookie相应给客户端
                response.addCookie(cookie);
                response.addCookie(cookie1);
    }
}
