package com.offcn.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Demo01SessionServlet")
public class Demo01SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String str="";
        HttpSession session = request.getSession(false);
            if (session==null){
                session = request.getSession();
                str="第一次访问";
            }else {
                str="再一次访问";
            }
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println(str);
    }
}
