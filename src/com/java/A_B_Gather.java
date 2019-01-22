package com.java;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: mzy
 * @Date: 2019-1-22 14:53
 */
public class A_B_Gather {
    /**
     * @编写一个应用程序输出A和B交集并集和差集
     */
    public static void main(String[] args) {
        //
        HashSet A=new HashSet();
        A.add(new Integer(1));
        A.add(new Integer(2));
        A.add(new Integer(3));
        A.add(new Integer(4));
        //
        HashSet B=new HashSet();
        B.add(new Integer(1));
        B.add(new Integer(3));
        B.add(new Integer(7));
        B.add(new Integer(9));
        B.add(new Integer(11));
        //
        HashSet C=new HashSet(A);
        HashSet D=new HashSet(A);
        A.addAll(B);
        Iterator it=A.iterator();
        System.out.print("A和B的并集：");
        while(it.hasNext()){
            System.out.print(it.next()+"  ");
        }
        System.out.print("\n");
        C.retainAll(B);
        Iterator iC=C.iterator();
        System.out.print("A和B的交集：");
        while(iC.hasNext()){
            System.out.print(iC.next()+"  ");
        }
        System.out.print("\n");
        D.removeAll(B);
        Iterator iD=D.iterator();
        System.out.print("A和B的差集：");
        while(iD.hasNext()){
            System.out.print(iD.next()+"  ");
        }
    }
}
