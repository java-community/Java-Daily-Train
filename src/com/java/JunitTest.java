package com.java;

import org.junit.*;

/**
 * 说明:junit用法，before,beforeClass,after, afterClass的执行顺序
 * 一个JUnit4的单元测试用例执行顺序为:@BeforeClass -> @Before -> @Test -> @After -> @AfterClass;
 * 各注解说明:
 * @BeforeClass 全局只会执行一次，而且是第一个运行
 * @Before 在测试方法运行之前运行
 * @Test 测试方法
 * @After 在测试方法运行之后允许
 * @AfterClass 全局只会执行一次，而且是最后一个运行
 * @Ignore 忽略此方法
 * @Author: mzy
 * @Date: 2019-1-30 15:53
 */
public class JunitTest {

    @Before
    public void before(){
        System.out.println("Before");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }

    @BeforeClass
    public static void beforeClass(){//必须为静态方法
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass(){//必须为静态方法
        System.out.println("AfterClass");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @After
    public void after(){
        System.out.println("After");
    }


}
