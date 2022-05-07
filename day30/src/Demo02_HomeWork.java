import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo02_HomeWork {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> list=new ArrayList();
        list.add(new Book("《C++从入门到放弃》",250,"刘奇才"));
        list.add(new Book("《Java从跨平台到跨行业》",150,"大哥"));
        list.add(new Book("《Mysql从删库到跑路》",100,"大佬"));
        list.add(new Book("《零基础学c语言，学完负基础》",333,"马化腾"));
        list.add(new Book("《服务器运维管理从网络异常到硬盘全红》",222,"刘奇才"));
        ObjectOutputStream   oos=new ObjectOutputStream(new FileOutputStream("E:\\boo.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
