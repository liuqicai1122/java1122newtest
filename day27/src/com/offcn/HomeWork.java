package com.offcn;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer,String> map=new TreeMap();
        BufferedReader br=new BufferedReader((new FileReader("home.txt")));
        BufferedWriter bw=new BufferedWriter((new FileWriter("home1.txt")));



        String str;
        //将每行分割成两个 数字存入ket 第二个存入value
        while ((str=br.readLine())!= null){
            String[] split = str.split("\\.");
                map.put(Integer.parseInt(split[0]),split[1]);

        }
        //System.out.println(map);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> ent: entries) {
            ent.getKey();
            ent.getValue();
            bw.write(ent.getKey()+"."+ent.getValue());
            bw.newLine();
        }
        br.close();
        bw.close();

}

}
