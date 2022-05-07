package com.offcn.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServerScoket {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象 并打开端口号11221
        ServerSocket ss=new ServerSocket(11221);

        //创建随机数对象
        Random ran=new Random();
        //接受Scoket客户端对象
        System.out.println("等待客户文件上传");
        Socket s = ss.accept();
            //接受客户端 传递过来的文件字节流,属于输入
        InputStream is = s.getInputStream();
        byte[] b=new byte[1024];
        int len;
        //获取一个随机数
        int ranNum=ran.nextInt(Integer.MAX_VALUE);
        //创建文件字节输出流,将服务器端的字节流 ,存到服务器的磁盘里面
        FileOutputStream fos=new FileOutputStream("d:\\copy"+ranNum+".jpg");
        while ((len=is.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        System.out.println("文件上传成功 ");
        //服务器 给客户端一个回应
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("文件上传成功".getBytes());
        //关流
        ss.close();
    }
}
