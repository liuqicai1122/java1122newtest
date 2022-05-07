import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo002_HomeWork {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream i=new ObjectInputStream(new FileInputStream("E:\\boo.txt"));
      ArrayList<Book> list =(ArrayList<Book>) i.readObject();
        for (Book book:list){
            System.out.println(book.getName()+"     "+book.getAuthor()+"    "+book.getPrice());
        }
        i.close();



    }
}
