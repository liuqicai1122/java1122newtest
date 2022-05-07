package com.coffcn.homework;

import sun.rmi.log.LogInputStream;

import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {
        //分析以下需求，并用代码实现：
        //	(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
        //	(2)编写方法对List集合进行排序
        //	(2)然后利用迭代器遍历集合元素并输出
        //	(3)如：15 18 20 40 46 60 65 70 75 91
        //对集合进行排序



        Random ran1=new Random();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            int ranNum = ran1.nextInt(100)+1;
            boolean b=true;
            for (int index = 0; index < i; index++) {
                if (list.get(index).equals(ranNum)){
                            index--;
                            b=false;
                            break;
                }
            }
            if (true){
                list.add(ranNum);
            }
        }
        //System.out.println(list);//存入了集合里面
        Paixu(list);
       /* for (Object num:list) {
            System.out.println(list);
        }
*/
    }
    //编写方法 对list集合进行排序
    public static  void Paixu(ArrayList<Integer> list){
        int ii=list.size()-1;
        for (int index = 0; index < ii; index++) {
            if (list.get(index).intValue()>list.get(index+1).intValue()){
                list.remove(list.get(index+1));
                list.add(list.get(index));
            }

        }
        System.out.println(list);

        }
}
