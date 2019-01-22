package com.java;

/**
 * @Author: mzy
 * @Date: 2019-1-22 14:22
 */
public class DiceGame {
    /**
     * 编写程序模拟掷骰子游戏
     * 说明:统计掷5000次,两个骰子的点数之和
     */
    public static void main(String[] args)  {
        int[] a = {0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i <5000; i++) {
            int x=(int)(Math.random()*6);x=x+1;
            int y=(int)(Math.random()*6);y=y+1;
            int z=x+y;
            if (z==2) {a[0]++;}
            else if (z==3) {a[1]++;}
            else if (z==4) {a[2]++;}
            else if (z==5) {a[3]++;}
            else if (z==6) {a[4]++;}
            else if (z==7) {a[5]++;}
            else if (z==8) {a[6]++;}
            else if (z==9) {a[7]++;}
            else if (z==10) {a[8]++;}
            else if (z==11) {a[9]++;}
            else if (z==12) {a[10]++;}
        }
        System.out.println("2："+a[0]+"次  ");
        System.out.println("3："+a[1]+"次  ");
        System.out.println("4："+a[2]+"次  ");
        System.out.println("5："+a[3]+"次  ");
        System.out.println("6："+a[4]+"次  ");
        System.out.println("7："+a[5]+"次  ");
        System.out.println("8："+a[6]+"次  ");
        System.out.println("9："+a[7]+"次  ");
        System.out.println("10："+a[8]+"次  ");
        System.out.println("11："+a[9]+"次  ");
        System.out.println("12："+a[10]+"次  ");
    }
}
