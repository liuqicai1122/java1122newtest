import java.io.*;

public class Demo01_HomeWork {
    public static void main(String[] args) throws IOException {
        FileInputStream i=new FileInputStream(new File("D:\\aaa.jpg"));
        FileOutputStream ii=new FileOutputStream(new File("e:\\aaa.jpg"));
        int len=0;
        while ((len=i.read())!= -1){
            ii.write(len);
        }




        ii.close();
        i.close();


    }
}
