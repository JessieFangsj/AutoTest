package com.course.testng;

import org.testng.annotations.*;


/**
 * ClassName: BasicAnnotation
 * Package: com.course.testng
 * Description:
 * 基本的注解
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 15:13
 * @Version 1.0
 */
public class BasicAnnotation {
    @Test(testName = "测试用例1")
    public void testCase1() {
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("测试方法前运行的方法");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("测试方法之后运行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("类之前运行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("类之后运行");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite测试套件");
    }
}
