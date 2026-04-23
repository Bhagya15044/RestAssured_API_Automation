package org.example.TestNG_Examples;

import org.testng.annotations.Test;

public class APITesting_Invocation_count
{
    // invocation count means you will run the testcase multiple times

    @Test(invocationCount = 2)
    public void test_01()
    {
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test_02()
    {
        System.out.println("Bye");
    }
}
