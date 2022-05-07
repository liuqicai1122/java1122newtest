package com.offcn.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns={"/*"})
public class FirstFilter implements Filter {
    public void destroy() {
       // System.out.println("我在服务器销毁时候执行了");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        //System.out.println("执行了");
    }

    public void init(FilterConfig config) throws ServletException {
       // System.out.println("初始化 服务器启动创建了");
    }

}
