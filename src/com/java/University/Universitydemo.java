package com.java.University;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: mzy
 * @Date: 2019-1-22 18:00
 */
public class Universitydemo{
    public static void main(String[] args) {
        University t1=new University("北京师范大学珠海学院",25000);
        University t2=new University("北京理工大学珠海学院",21000);
        University t3=new University("吉林大学珠海学院",20000);
        University t4=new University("中山大学珠海分校",18000);
        University t5=new University("暨南大学珠海学院",7000);
        ArrayList al=new ArrayList();
        al.add(t1);
        al.add(t2);
        al.add(t3);
        al.add(t4);
        al.add(t5);

        Collections.sort(al);
        System.out.println("学校名称\t\t学生人数");
        System.out.println("==========================");
        for (int i = 0; i < al.size(); i++) {
            University t=(University)al.get(i);
            t.printInfo();
        }
    }
}

