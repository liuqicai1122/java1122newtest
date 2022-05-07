public class Test02_Student {
    public static void main(String[] args) {
        Student1 student=new Student1();
        System.out.println(student.schoolName);
        Student1 student1=new Student1();
        System.out.println(student1.schoolName);
        //以上我们看不出 节省空间的优势 优势在于可以不需要创建对象 因为 我们写
        //static 时 将他单独放到了 方法区的 静态区 创建对象时候在堆内存开辟的空间 都不会有schoolName
        //访问 通过 类名.其中的变量名
        System.out.println(Student1.schoolName);
        System.out.println(Student1.schoolName);
        //static 静态关键字
        //static 关键字 可以用于成员变量 方法 代码块等
        //static  修饰的 变量 称为静态变量
        //static 修饰的 方法 称为静态方法
        //static 修饰的初始化代码块   称为静态代码块
        //static 修饰的类 静态内部类
    }
}
