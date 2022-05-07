package com.offcn.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class ListenerTest1 implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext sc = session.getServletContext();
      int count = (Integer)sc.getAttribute("count");
      sc.setAttribute("count",++ count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        int count = (Integer)servletContext.getAttribute("count");
        count--;
        servletContext.setAttribute("count",count);
    }


}

