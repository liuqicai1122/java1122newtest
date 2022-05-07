package com.offcn.cookie;

import com.offcn.cookieutils.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/Demo02CookieServlet")
public class Demo02CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数 id
        String id = request.getParameter("id"); //1 或 2 或 3 或 4
        //获得所有cookie
        Cookie[] cookies = request.getCookies();
        //判断是否为空
        if (cookies==null){//第一次访问
            Cookie cookie = new Cookie("product", id);
                cookie.setMaxAge(24*60*60);
                cookie.setPath("/");
                response.addCookie(cookie);
        }else{      //有cookie
            //调用方法      返回cookie null

            Cookie ck = CookieUtil.findCookie(cookies, "product");
                    if (ck==null){  //没有访问过 第一次访问
                        Cookie cookie = new Cookie("product", id);
                        cookie.setMaxAge(24*60*60);
                        cookie.setPath("/");
                        response.addCookie(cookie);
                    }else { //访问过
                        //解码
                      //  String value = URLDecoder.decode(ck.getValue(), "utf-8");
                        String value = ck.getValue();
                        String[] split = value.split("_");
                        boolean flag = checkExist(split, id);//flag=false 不存在
                        if (! flag){ //没有访问过

                            // Cookie cookie = new Cookie("product",URLEncoder.encode(value + "," + id,"utf-8"));   //2存进来 1_2  3存进来 1_2_3
                            Cookie cookie = new Cookie("product", value + "_" + id);

                            cookie.setPath("/");
                            cookie.setMaxAge(24*60*60);
                            response.addCookie(cookie);
                        }
                    }
        }
            response.sendRedirect("image.jsp");
    }
        //判断id在数组中是否存在
        public  static boolean checkExist(String[] s,String id){
                boolean flag=false;
                for (String s1:s){
                    if(s1.equals(id)) {//存在
                        flag=true;
                        break;
                    }
                }
                return flag;
        }
}
