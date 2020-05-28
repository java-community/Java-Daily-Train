package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：测试ArrayList_contains中,是否存在的bug
 * @Author: mzy
 * @Date: 2020-5-28 10:24
 * 结论：contains的原理是使用equals方法来判断
 */
public class ArrayList_contains_Test {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("PYS001");
        if (obj.contains("PYS001")) {System.out.println("PYS001--在范围内");} else{System.out.println("PYS001--不在范围内"); }
        if (obj.contains("PYS00")) {System.out.println("PYS00--在范围内");} else{System.out.println("PYS00--不在范围内"); }
        if (obj.contains("PYS0011")) {System.out.println("PYS0011--在范围内");} else{System.out.println("PYS0011--不在范围内"); }
        if (obj.contains("pys001")) {System.out.println("pys001--在范围内");} else{System.out.println("pys001--不在范围内"); }
    }
}
