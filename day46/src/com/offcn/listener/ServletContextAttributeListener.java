package com.offcn.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextAttributeListener implements javax.servlet.ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent s) {
        System.out.println("在sc中添加一个值:"+s.getName()+":"+s.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent s) {
        System.out.println("在sc中移除一个值:"+s.getName()+":"+s.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent s) {
        System.out.println("在sc中替换一个值:"+s.getName()+":"+s.getValue());
    }
}
