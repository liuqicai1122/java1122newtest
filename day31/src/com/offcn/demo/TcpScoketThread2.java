package com.offcn.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpScoketThread2 implements  Runnable{
    @Override
    public void run() {
        //创建客户端对象,并指定服务器的ip地址和端口号
        Socket s=null;
        try {
            s=new Socket("10.10.118.174",10011);
            OutputStream outputStream = s.getOutputStream();

            FileInputStream fis=new FileInputStream("d:\\aaa.jpg");
            byte[] b=new byte[1024*8];
            int len;
            while ((len=fis.read(b))!=-1){
                outputStream.write(b,0,len);
            }
            s.shutdownInput();//给服务器传递一个可以结束的-1
             fis.close();//关流

            //接收服务器端的响应 属于输入
            InputStream inputStream = s.getInputStream();
            byte[] b1=new byte[1024];
            int read = inputStream.read(b1);
            System.out.println(new String(b1,0,read));
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
