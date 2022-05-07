package com.offcn.cookie;

import com.offcn.cookieutils.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ClearCookie")
public class ClearCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Cookie cookie= CookieUtil.findCookie(cookies, "product");
               if (cookie!=null){
                   cookie.setMaxAge(0);
                   cookie.setPath("/");   //设置路径和此时保持在一致
                   response.addCookie(cookie);
               }
        response.sendRedirect("image.jsp");


    }
}
