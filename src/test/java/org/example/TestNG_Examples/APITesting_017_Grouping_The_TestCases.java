package org.example.TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_017_Grouping_The_TestCases
{
    // we will run this testcases using TestNG.xml
    //TestCase-1
    @Test(groups = {"sanity","reg"})
    public void test_sanity_run()
    {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    //TestCase-2
    @Test(groups = {"reg"})
    public void test_RegressionRun()
    {
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    //TestCase-3
    @Test(groups = {"smoke","reg"})
    public void test_Smoke_Run()
    {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
