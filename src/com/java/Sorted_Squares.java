package com.java;
        import java.util.Arrays;
        import java.util.Scanner;
/**
 * leetcode编程题:977. 有序数组的平方
 * 地址:https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @Author: mzy
 * @Date: 2019-3-18 10:16
 */
//线下做题
public class Sorted_Squares {
    static int number=4;//数组大小
    static int A[] = new int[number];
    static void input() {
        System.out.println("请输入A序列：");
        Scanner in_t1 = new Scanner(System.in);//循环输入A数组
        for(int i=0;i<number;i++){
            A[i]=in_t1.nextInt();
        }
        System.out.println("输入的A序列为："+Arrays.toString(A));
    }
    public static void main(String[] args) throws Exception {
        input();
        int M[] = new int[number];
        for (int i = 0; i < number; i++) {
            M[i] = A[i] * A[i];
        }
        Arrays.sort(M);
        System.out.println("输出结果:"+Arrays.toString(M));
    }
}

/**
 * 线上做题:
 * class Solution {
 *     public int[] sortedSquares(int[] A) {
 *         int N = A.length;
 *         int[] M = new int[N];
 *         for (int i = 0; i < N; ++i)
 *             M[i] = A[i] * A[i];
 *
 *         Arrays.sort(M);
 *         return M;
 *     }
 * }
 */
