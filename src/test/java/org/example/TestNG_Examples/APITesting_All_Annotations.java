package org.example.TestNG_Examples;

import org.testng.annotations.*;

public class APITesting_All_Annotations
{
    //below is the correct flow of suite, test, class, method
    //Maximum time we use BeforeMethod, Test, AfterMethod, BeforeTest, AfterTest
    @BeforeSuite
    void demo1()
    {
        System.out.println("Before suite");
    }

    @BeforeTest
    void demo2()
    {
        System.out.println("Before Test");
    }

    @BeforeClass
    void demo3()
    {
        System.out.println("Before class");
    }

    @BeforeMethod
    void demo4()
    {
        System.out.println("Before Method");
    }

    @Test
    void demo_main_Testcase()
    {
        System.out.println("Main Testcase - everything will be written here");
    }

    @AfterMethod
    void demo5()
    {
        System.out.println("After Method");
    }

    @AfterClass
    void demo6()
    {
        System.out.println("After class");
    }

    @AfterTest
    void demo7()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    void demo8()
    {
        System.out.println("After Suite");
    }
}
