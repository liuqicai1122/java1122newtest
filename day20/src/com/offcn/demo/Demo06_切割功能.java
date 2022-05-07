package com.offcn.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo06_切割功能 {
    public static void main(String[] args) {
            String str="-1 99  100  75 444 298";
        String[] s = str.split(" +");
        System.out.println(Arrays.toString(s));

    }
}
