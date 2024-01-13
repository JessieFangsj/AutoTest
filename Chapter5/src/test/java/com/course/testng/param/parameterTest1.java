package com.course.testng.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * ClassName: parameterTest1
 * Package: com.course.testng
 * Description:
 * 参数化测试
 * xml文件参数化
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 18:26
 * @Version 1.0
 */
public class parameterTest1 {
    @Test
    @Parameters({"name", "age"})
    public void paramTest(String name, int age) {
        System.out.println("name: " + name + ", age: " + age);
    }

    @Test
    public void test(){
        System.out.println("test");
    }
}
