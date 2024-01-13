package com.course.testng.param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * ClassName: dataProviderTest
 * Package: com.course.testng.param
 * Description:
 * DataProvider参数化
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 18:43
 * @Version 1.0
 */
public class dataProviderTest {
    @Test(dataProvider = "data")
    public void dataProTest(String name, int age) {
        System.out.print("dataProTest: ");
        System.out.println("name: " + name + ", age: " + age);
    }

    @DataProvider(name = "data")
    public Object[][] dataPro() {
        return new Object[][]{
                {"tom", 20},
                {"jerry", 15}
        };
    }

    @Test(dataProvider = "methodData")
    public void methodProTest1(String name, int age) {
        System.out.print("methodProTest1: ");
        System.out.println("name: " + name + ", age: " + age);
    }

    @Test(dataProvider = "methodData")
    public void methodProTest2(String name, int age) {
        System.out.print("methodProTest2: ");
        System.out.println("name: " + name + ", age: " + age);
    }

    /**
     * 根据方法传递对应的参数
     *
     * @param method 方法
     * @return 方法对应的参数
     */
    @DataProvider(name = "methodData")
    public Object[][] methodPro(Method method) {
        Object[][] objects = null;

        if (method.getName().equals("methodProTest1")) {
            objects = new Object[][]{
                    {"cindy", 20},
                    {"lily", 15}
            };
        } else if (method.getName().equals("methodProTest2")) {
            objects = new Object[][]{
                    {"abby", 20},
                    {"betty", 15}
            };
        }

        return objects;
    }

}
