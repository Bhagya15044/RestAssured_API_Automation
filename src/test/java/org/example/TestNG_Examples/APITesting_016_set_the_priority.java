package org.example.TestNG_Examples;

import org.testng.annotations.Test;

public class APITesting_016_set_the_priority
{

    /* I kept these numbers in not proper order.
       I want to run in the correct order.
       So given the priority which test case wants to run first.
       If we give negative priority like -1, it will become high priority
       it will run first, later positive priority testcases
     */
    @Test(priority = 1)
    public void test_T1()
    {
        System.out.println("1");
    }

    @Test(priority = 3)
    public void test_T2()
    {
        System.out.println("3");
    }

    @Test(priority = 2)
    public void test_T3()
    {
        System.out.println("2");
    }

    @Test(priority = 4)
    public void test_T4()
    {
        System.out.println("4");
    }
}
