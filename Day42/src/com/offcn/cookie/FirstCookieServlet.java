package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FirstCookieServlet")
public class FirstCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用cookie记录客户端是否是第一次访问当前servlet
        //如果是第一次访问servlet 提示欢迎第一次访问
        //如果不是第一次访问 提示欢迎回来
        String str="第一次访问";
        boolean flag=false; //第一次访问
        //获得所有的cookie数组
        Cookie[] cookies = request.getCookies();
        //判断 如果此时cookie数组为null 肯定是第一次访问
        if (cookies!=null){
            for (Cookie cookie:cookies){
                    if("name".equals(cookie.getName())){
                        flag=true;
                        break;
                    }
            }
        }
        if (flag){
            str="欢迎回来";
        }else{//false 是第一次访问
            //创建cookie
            Cookie cookie = new Cookie("name", "hhaha");
            cookie.setMaxAge(6);
            cookie.setPath("/");//有效路径
            //服务器端将cookie相应客户端
            response.addCookie(cookie);

        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(str);

    }
}
