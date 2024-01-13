package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * ClassName: GroupsOnClass3
 * Package: com.course.testng.groups
 * Description:
 * 类分组测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 17:57
 * @Version 1.0
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tea1() {
        System.out.println("GroupsOnClass3 tea1");
    }

    public void tea2() {
        System.out.println("GroupsOnClass3 tea2");
    }
}
