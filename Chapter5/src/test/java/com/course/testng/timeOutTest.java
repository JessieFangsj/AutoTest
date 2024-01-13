package com.course.testng;

import org.testng.annotations.Test;

/**
 * ClassName: timeOutTest
 * Package: com.course.testng
 * Description:
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 19:46
 * @Version 1.0
 */
public class timeOutTest {

    @Test(timeOut = 3000)
    public void timeoutTest1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test(timeOut = 3000)
    public void timeoutTest2(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
