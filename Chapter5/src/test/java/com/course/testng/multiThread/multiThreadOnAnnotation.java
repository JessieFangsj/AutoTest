package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * ClassName: multiThreadOnAnnotation
 * Package: com.course.testng.multiThread
 * Description:
 * 注解方式实现多线程测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 19:04
 * @Version 1.0
 */
public class multiThreadOnAnnotation {
    /**
     * 单线程
     */
    @Test(invocationCount = 10)  // invocationCount ：指定测试方法需要被调用的次数
    public void threadTest1(){
        System.out.printf("Thread Id: %s   ", Thread.currentThread().getId());
        System.out.println("多线程测试");
    }
    
    @Test(invocationCount = 10, threadPoolSize = 3)  // 线程池为3
    public void threadTest2(){
        System.out.printf("Thread Id: %s   ", Thread.currentThread().getId());
        System.out.println("多线程测试");
    }
}
