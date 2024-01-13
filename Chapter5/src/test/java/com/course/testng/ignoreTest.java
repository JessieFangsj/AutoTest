package com.course.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * ClassName: ignoreTest
 * Package: com.course.testng
 * Description:
 * 忽略测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 17:00
 * @Version 1.0
 */
public class ignoreTest {
    @Test
    public void ignoreTest1() {
        assertTrue((1+1)==3);
        System.out.println("test1");
    }

    @Test(enabled = false)
    public void ignoreTest2() {
        System.out.println("test2");
    }

    @Test(enabled = true)  // enable的默认参数是true
    public void ignoreTest3() {
        System.out.println("test3");
    }
}
