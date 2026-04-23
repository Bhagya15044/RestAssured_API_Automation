package org.example.TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_DependsOnMethod
{
    /*DependOnMethod means it will depend on other testcase to run first,
     here below example if the server is started only,
     then the next test case will be executed*/

    @Test
    public void ServerStartedOK()
    {
        System.out.println("I will Run First");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "ServerStartedOK" )
    public void test1()
    {
        System.out.println("method 1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "ServerStartedOK" )
    public void test2()
    {
        System.out.println("method 2");
        Assert.assertTrue(true);
    }
}
