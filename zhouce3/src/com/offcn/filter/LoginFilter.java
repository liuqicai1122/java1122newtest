package com.offcn.filter;

import com.offcn.bean.User;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns ={"/menu.jsp","/selectAllServlet","/updateServlet"})
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse) resp;
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if (user==null){
            response.sendRedirect("login.jsp?iii=pms");
        }else {//登录
            chain.doFilter(req, resp);///放行
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
