package com.java.University;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: mzy
 * @Date: 2019-1-22 17:56
 */
public class University  implements Comparable{
    String uniName;  //学校名称
    int population;    //学生人数
    University(){
    }
    University(String uniName,int population){
        this.uniName=uniName;
        this.population=population;
    }
    public int compareTo(Object o){
        University t=(University)o;
        return t.population-this.population;
    }
    void printInfo(){
        System.out.println(uniName+"\t"+population);
    }
}
