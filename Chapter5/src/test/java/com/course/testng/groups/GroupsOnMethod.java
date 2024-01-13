package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * ClassName: GroupsOnMethod
 * Package: com.course.testng.groups
 * Description:
 * 方法分组测试
 *
 * @Author Jessie Fang
 * @Create 2024/1/13 17:43
 * @Version 1.0
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void serverTest1() {
        System.out.println("server test");
    }

    @Test(groups = "server")
    public void serverTest2() {
        System.out.println("server test2");
    }

    @Test(groups = "client")
    public void clientTest1() {
        System.out.println("client test1");
    }

    @Test(groups = "client")
    public void clientTest2() {
        System.out.println("client test2");
    }

    @BeforeGroups("server")
    public void beGroupsServer() {
        System.out.println("BeforeGroups(\"server\")");
    }

    @AfterGroups("server")
    public void afGroupsServer() {
        System.out.println("AfterGroups(\"server\")");
    }

    @BeforeGroups("client")
    public void beGroupsClient() {
        System.out.println("BeforeGroups(\"client\")");
    }

    @AfterGroups("client")
    public void afGroupsClient() {
        System.out.println("AfterGroups(\"client\")");
    }

}
