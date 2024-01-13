package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * ClassName: multiThreadOnXml
 * Package: com.course.testng.multiThread
 * Description:
 * Xml文件实现多线程测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 19:15
 * @Version 1.0
 */
public class multiThreadOnXml1 {
    @Test
    public void test1() {
//        System.out.print("test1: ");
        System.out.printf("Thread %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
//        System.out.print("test2: ");
        System.out.printf("Thread %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
//        System.out.print("test3: ");
        System.out.printf("Thread %s%n", Thread.currentThread().getId());
    }
}
