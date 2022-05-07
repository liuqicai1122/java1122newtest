package Demo;

public class Test {
    public static void main(String[] args) {
        //创建一个车对象
        Car iii= new Car();
        iii.name="风驰天下,大运汽车";
        iii.color="粉色";
        iii.num=1;
        iii.run();
        Factory factory = new Factory();
        factory.repairCar(iii);
        iii.run();
        Student chengJi=new Student();
        ///////////////////////
        chengJi .getSum(67,124,111);//这是作业成绩测试
        double getSum=chengJi.getSum(67,124,111);
        System.out.println(getSum);
        //下面是长方形类Rectangle
        Rectangle i = new Rectangle();
        System.out.println(i.area(4,6));
        System.out.println(i.C(5,5));

    }
}
