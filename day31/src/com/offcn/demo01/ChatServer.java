package com.offcn.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        //服务器创建对象 然后开启一个接口 接口名6666
        ServerSocket ss=new ServerSocket(6666);
        Socket s = ss.accept();//服务器接收相应的客户端
        //创建一个键盘录入对象
        Scanner sc=new Scanner(System.in);
        // 聊天 放到死循环里面
        while (true){
            //输入 客户端信息  我们要输入
            InputStream inputStream = s.getInputStream();
            byte[] b=new byte[1024];
            int len=inputStream.read(b);
            System.out.println(new String(b,0,len));

            System.out.println("请输入内容");
            String str=sc.nextLine();
            OutputStream outputStream = s.getOutputStream();
            outputStream.write(str.getBytes());

        }
    }
}
