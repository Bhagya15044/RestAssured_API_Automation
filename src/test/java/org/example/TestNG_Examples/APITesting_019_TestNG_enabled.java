package org.example.TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_019_TestNG_enabled
{
    /*
       For Testcase 2 we added the enabled=false feature,
       it skipped the testcase2 and executed remaining testcases
    */
    @Test
    public void test1()
    {
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test2()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void test3()
    {
        Assert.assertTrue(true);
    }
}
