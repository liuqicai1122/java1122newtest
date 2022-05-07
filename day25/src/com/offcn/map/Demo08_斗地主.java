package com.offcn.map;

import com.sun.scenario.effect.impl.ImagePool;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class Demo08_斗地主 {
    public static void main(String[] args) {
        //根据题意组合牌
        String[] paiNum={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[]  paiFlower={"♥","♠","♦","♣"};
        //定义一个map集合存牌的序号和牌
        HashMap<Integer,String> hm=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        //定义一个list集合存序号 以后直接玩牌的序号
            int count=1;
            hm.put(count,"大王");
            list.add(count);
            count++;
            hm.put(count,"小王");
            list.add(count);
            count++;
        for (int i = 0; i <=paiNum.length-1; i++) {
            for (int j = 0; j <=paiFlower.length-1 ; j++) {
                String pai= paiFlower[j] + paiNum[i];
               // System.out.println(pai);
                hm.put(count,pai);
                list.add(count);
                count++;
            }
        }
        //System.out.println(hm);
       // System.out.println(list);
        //以上我们的54张牌和对应号已经存入  序号我们也单独存入到
        //洗牌 洗的顺序
        Collections.shuffle(list);
        //洗牌成功
        ArrayList<Integer> diPai=new ArrayList<>();
        for (int i = 1; i <4 ; i++) {
            //每一次都从list集合牌顺序 删除最后一个 放到底牌里
            Integer remove = list.remove(list.size() - 1);
            diPai.add(remove);

        }
        System.out.println(diPai);
        //底牌添加三个,创建三个ArrayList 当成三个玩家
        ArrayList<Integer> z=new ArrayList<>();
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();
        while (true){
            if (!list.isEmpty()){
                z.add(list.remove(0));
        }
            if (!list.isEmpty()){
                x.add(list.remove(0));
            }
            if (!list.isEmpty()){
                y.add(list.remove(0));
            }else {
                break;//没牌了 就循环结束了
            }
        }
        //将杂乱的牌从小到大排序
        Collections.sort(z);
        Collections.sort(x);
        Collections.sort(y);
        //我们写一个方法将 真正的牌展示出来
        lookPai(diPai,hm);
        lookPai(z,hm);


    }
    public  static  void lookPai(ArrayList<Integer> al,HashMap<Integer,String> map){
            //通过增强for循环来遍历al
        StringBuilder sb=new StringBuilder("[");
        for (Integer num:al) {
            String pai = map.get(num);
                sb.append(pai+",");
        }
            sb.replace(sb.length()-1,sb.length(),"}");
        System.out.println(sb);
    }
}
