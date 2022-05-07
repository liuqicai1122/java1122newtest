package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo01CookieServlet")
public class Demo01CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //使用cookie记录客户端访问次数
        int count=1;
        Boolean flag=false;
        Cookie ck=null;
        Cookie[] cookies = request.getCookies();//获取cookies
            if (cookies !=null){
                 for (Cookie cookie: cookies){
                        if ("count".equals(cookie.getName())){
                            flag=true;
                                ck=cookie;
                        }
                 }
            }
            if (flag){ //true 不是第一次访问
                count=Integer.parseInt(ck.getValue())+1;
            }


        Cookie c = new Cookie("count", count + "");
            response.addCookie(c);

            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("这是第"+count+"次访问");
    }
}
