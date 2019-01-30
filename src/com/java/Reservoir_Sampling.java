package com.java;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * 说明:蓄水池采样算法（Reservoir Sampling）
 * 采样问题经常会被遇到，比如：
 * 从 100000 份调查报告中抽取 1000 份进行统计。
 * 从一本很厚的电话簿中抽取 1000 人进行姓氏统计。
 * 从 Google 搜索 "Ken Thompson"，从中抽取 100 个结果查看哪些是今年的。
 * 这些都是很基本的采用问题。
 * 要求:保证每个元素被采样到的概率是相同的
 * 总结:适用于对一个不清楚规模的数据集进行采样。
 * @Author: mzy
 * @Date: 2019-1-30 15:12
 */
public class Reservoir_Sampling {
    private int[] pool; // 所有数据
    private final int N = 100000; // 数据规模
    private Random random = new Random();

    @Before
    public void setUp() throws Exception {
        // 初始化
        pool = new int[N];
        for (int i = 0; i < N; i++) {
            pool[i] = i;
        }
    }

    private int[] sampling(int K) {
        int[] result = new int[K];
        for (int i = 0; i < K; i++) { // 前 K 个元素直接放入数组中
            result[i] = pool[i];
        }

        for (int i = K; i < N; i++) { // K + 1 个元素开始进行概率采样
            int r = random.nextInt(i + 1);
            if (r < K) {
                result[r] = pool[i];
            }
        }

        return result;
    }

    @Test
    public void test() throws Exception {
        for (int i : sampling(100)) {
            System.out.println(i);
        }
    }
}
