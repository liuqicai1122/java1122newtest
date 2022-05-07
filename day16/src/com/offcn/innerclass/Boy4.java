package com.offcn.innerclass;

public class Boy4 {
    private  int num =3;
    public  void show () {
        String color = "黑色";
        //局部内部类 在方法中
        class Fei {
            int ciShu = 5;

            public void smoking() {
                System.out.println("一天抽" + ciShu + "一次抽" + num + "肺很快就变" + color);
            }
        }
        //就在方法中 创建对象 条用局部内部类资源
        Fei f= new Fei();
        System.out.println(f.ciShu);
            f.smoking();

    }
    }

