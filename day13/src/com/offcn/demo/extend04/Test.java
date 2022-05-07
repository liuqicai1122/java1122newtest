package com.offcn.demo.extend04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple instanceof Apple);//true
        System.out.println(apple instanceof Fruit);//true
        //子类之间是没有任何关系的


    }
}
