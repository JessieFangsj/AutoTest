package com.course.testng;

import org.testng.annotations.Test;

/**
 * ClassName: expectExceptionTest
 * Package: com.course.testng
 * Description:
 * 异常测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 18:14
 * @Version 1.0
 */
public class expectExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionFailTest() {
        System.out.println("失败的异常测试");
    }

    /**
     * 异常测试期望结果可以抛出异常
     * 因此有异常抛出时，测试才可以通过
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionSuccess() {
        System.out.println("成功的异常测试");
        throw new RuntimeException();
    }
}
