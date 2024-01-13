package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * ClassName: SuiteConfig
 * Package: com.course.testng.suite
 * Description:
 * 套件测试
 * 用于进行所有测试套件的配置，测试运行前所需的方法
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 15:43
 * @Version 1.0
 */
public class SuiteConfig {
    @BeforeSuite
    public void beSuite(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void afSuite(){
        System.out.println("AfterSuite");
    }

    @BeforeClass
    public void beClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afClass(){
        System.out.println("AfterClass");
    }

    @BeforeTest
    public void beTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afTest(){
        System.out.println("AfterTest");
    }


}
