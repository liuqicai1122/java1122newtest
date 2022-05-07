package com.offcn.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s=new Socket("10.10.118.174",6666);

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("说一句话");
            String i = sc.nextLine();
            //服务器输出
            OutputStream outputStream = s.getOutputStream();
            outputStream.write(i.getBytes());

            //输入 客户端给信息我们要输入
            InputStream inputStream = s.getInputStream();
            byte[] b=new byte[1024];
            int read = inputStream.read(b);
            System.out.println(new String(b,0,read));
        }
    }
}
