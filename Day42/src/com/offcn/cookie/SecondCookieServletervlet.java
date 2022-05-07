package com.offcn.cookie;

import com.offcn.JButils.DataUtils;
import com.offcn.JButils.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;

@WebServlet("/SecondCookieServletervlet")
public class SecondCookieServletervlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                //使用cookie记录上次访问时间
                //获取所有的cookie
        String str="第一次访问";
        Cookie[] cookies = request.getCookies();
            if (cookies != null){
                for (Cookie cookie:cookies){
                    if("beforeTime".equals(cookie.getName())){
                        str="上次访问时间"+cookie.getValue();
                        break;
                    }
                }
            }

            //创建cookie

        String date = DateUtil.dateToString(new Date());
        //日期转化成字符串
        Cookie beforeTime = new Cookie("beforeTime", date);
        beforeTime.setMaxAge(20);
        beforeTime.setPath("/");
        response.addCookie(beforeTime);

        response.setContentType("text/html;charset=utf-8");
            response.getWriter().println(str);
    }
}
