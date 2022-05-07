package com.offcn.demo;

import java.io.*;

import java.net.Socket;

public class TcpScoket {
    public static void main(String[] args) throws IOException {
        //创建客户端对象,并指定服务器的ip地址和端口号
        Socket  ios=new Socket("10.10.118.174",10011);
        //创建客户端 输出流
        OutputStream os = ios.getOutputStream();
        //创建文件输入流
        FileInputStream fis=new FileInputStream("d:\\aaa.jpg");
        byte[] b=new byte[1024*8];
        int len;
        while ((len=fis.read())!=-1){
            os.write(b,0,len);
        }
        //给服务器传递一个可以结束的-1
        ios.shutdownInput();
        fis.close();
        //接受服务器的响应 属于输入
        InputStream inputStream = ios.getInputStream();
        byte[] b1=new byte[1024];
        int read = inputStream.read(b1);
        System.out.println(new String(b1,0,read));

        ios.close();

    }
}
