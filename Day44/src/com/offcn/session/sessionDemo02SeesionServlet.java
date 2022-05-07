package com.offcn.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Demo02SeesionServlet")
public class sessionDemo02SeesionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //记录访问次数
        HttpSession session = request.getSession();
        Integer num = (Integer)session.getAttribute("num");
        if(num==null){
            num=0;
        }
        session.setAttribute("num",++num);

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("第"+num+"次访问");
    }
}
