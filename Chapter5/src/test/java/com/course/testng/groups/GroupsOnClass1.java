package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * ClassName: GroupsOnClass1
 * Package: com.course.testng.groups
 * Description:
 * 类分组测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 17:56
 * @Version 1.0
 */
@Test(groups = "student")
public class GroupsOnClass1 {
    public void stu1() {
        System.out.println("GroupsOnClass1 stu1");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1 stu2");
    }
}
