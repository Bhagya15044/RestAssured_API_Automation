package org.example.TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_AlwaysRun
{
    //Always run the testcase whether it is skipped or something
    @Test
    public void test_new_register()
    {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_login_page()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal()
    {
        Assert.assertTrue(true);
    }
}
