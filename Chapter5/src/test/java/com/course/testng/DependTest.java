package com.course.testng;

import org.testng.annotations.Test;

/**
 * ClassName: DependTest
 * Package: com.course.testng
 * Description:
 * 依赖测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 18:20
 * @Version 1.0
 */
public class DependTest {
    @Test()
    public void test1() {
        System.out.println("test1");
    }

    /**
     * test2依赖test1，只运行test2也会输出test1的结果
     */
    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
        throw new RuntimeException();
    }

    /**
     * test4依赖于test3，test3抛出异常导致失败，test4直接被忽略
     */
    @Test(dependsOnMethods = {"test3"})
    public void test4() {
        System.out.println("test4");
    }
}
