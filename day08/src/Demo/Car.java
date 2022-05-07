package Demo;

public class Car {
    //Car 属性 和方法
    // 属性 名字.颜色.轮胎数量
    //方法/行为  跑  要求 ;如果汽车的轮子数量不为4个则显示汽车不能正常运行,如果4个 汽车则可以跑起来
    //名字
    String name;
    //颜色
    String color;
    //轮胎数量
    int num;
     public void run(){
         if(num==4){
             System.out.println("您的"+name+"可以跑");
         }else {
             System.out.println("你这是什么破车,轮胎个数是"+num+"个,可以拿去修理吗?");
         }
     }
}
