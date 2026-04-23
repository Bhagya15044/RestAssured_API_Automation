package org.example.TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_015_BeforeTest
{
    /*
        To make the PUT request, we need these below prerequisites
        1. Get Token
        2. Get booking ID
        3. Test PUT (which we will use above two methods)
        4. Close All The Things.
    */

    // before making the request, I need to get the token from the postman
    @BeforeTest
    public void test_GetToken()
    {
        System.out.println("Before Get Token");
    }

    @BeforeTest
    public void test_Get_BookingID()
    {
        System.out.println("Before Get Booking ID");
    }

    // This is the Main Testcase where we will write all the tests here
    @Test
    public  void test_PUT_Method()
    {
        // token and booking ID initialization
        System.out.println("PUT Request");
    }

    //we will do closing the things (Clean all after the testing completed)
    @AfterTest
    public void CloseAllTheThings()
    {
        System.out.println("Close the things");
    }
}
