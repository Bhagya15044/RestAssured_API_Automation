package org.example.TestNG_Examples;

import org.testng.annotations.Test;

public class TestNG_TC_vs_Non_TestNG_TC
{
    // this not a TestNG Testcase
    public void test_post_request()
    {

    }

    //This is TestNG testcase, because we included the @Test Annotation.
    @Test
    public void test_post_request_01()
    {

    }
}
