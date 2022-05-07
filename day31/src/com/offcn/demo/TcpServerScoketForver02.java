package com.offcn.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServerScoketForver02 {
    public static void main(String[] args) throws IOException {
        //创建 ServerSocket对象 并打开端口号10011
        ServerSocket ss=new ServerSocket(10011);
    //创建随机数对象
        Random ran=new Random();

                while(true){
            //接收Socket客户端
            System.out.println("等待客户文件上传");
            Socket accept = ss.accept();
            //接收客户端 传递过来的文件字节流 属于输入

            InputStream inputStream=null;
                    inputStream= accept.getInputStream();
            byte[]b =new byte[1024];
            int len;
            //获取一个随机数
            int ranNum=ran.nextInt(Integer.MAX_VALUE);
            //创建文件字节输出流,将服务器端的字节流,存到服务器的磁盘里面
            FileOutputStream fos=new FileOutputStream("e:\\copy"+ranNum+".jpg");
            while((len=inputStream.read())!=-1 ){
                fos.write(b,0,len);
            }
            fos.close();
            System.out.println("文件上传成功");
            //服务器 给客户端一个回应
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("文件上传成功".getBytes());

        }

    }
}
