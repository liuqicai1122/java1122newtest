package com.coffcn.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Homework01 {
    public static void main(String[] args) {
        String[] names={"A","B","C","D","E","F","G"};
        String[] scores={"A,数学,89","A,语文,86","B,数学88","B,英语,98","C,英语,67","G,数学,60"};
        //求name中谁全部缺考?
        //提示,使用 removeAll方法
        Set <String>name =new HashSet<>();
        for (String str: names) {
            name.add(str);
        }
        //将成绩里面的姓名拆筛选出来<存到set集合里面
         Set<String>setScore=new HashSet<>();
        for (String score:scores) {
            String s = score.split(",")[0];
                    setScore.add(s);
        }
       // System.out.println(setScore);[A, B, C, G]
            //把Set中的相同去掉
        boolean b = name.removeAll(setScore);
        System.out.println(name);

    }


    }

