package com.java;

/**
 * @Author: mzy
 * @Date: 2019-1-30 10:46
 * 说明:判断ASCII与整型区别,还有打印区别
 */
public class ASCII_Code {
    public void A(char ch){
        int iTmp=(int)ch;
        System.out.println(ch+"的Ascii码是"+iTmp);
    }

    public static void main(String[] args) {
        ASCII_Code code = new ASCII_Code();
        code.A('0');
        code.A('1');
        code.A('2');
        code.A('3');
        code.A('4');
        code.A('5');
        code.A('6');
        code.A('7');
        code.A('8');
        code.A('9');
        code.A('A');
        code.A('B');
        code.A('C');
        System.out.println("注意以下区别:");
        System.out.println("字符串相加:1+'1'+1="+1+'1'+1);
        System.out.println(1+'1'+1);
        System.out.println("字符串相加:1+'2'+1="+1+'2'+1);
        System.out.println(1+'2'+1);
        System.out.println("字符串相加:1+'A'+1="+1+'A'+1);
        System.out.println(1+'A'+1);

    }
}
