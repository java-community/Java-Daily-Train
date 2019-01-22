package com.java;

import java.util.Random;

/**
 * @Author: mzy
 * @Date: 2019-1-22 18:11
 */
public class DiceGame2 {
/**
 * @编写程序模拟掷骰子游戏
 */
    public static void main(String[] args){
        int[] a = new int[11];//老师说已初始化
        Random r=new Random();
        for (int i = 1; i <=5000; i++) {
            int n1=r.nextInt(6)+1;
            int n2=r.nextInt(6)+1;
            int z=n1+n2;
            a[z-2]++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+2+":"+a[i]+"次");
        }
    }
}
