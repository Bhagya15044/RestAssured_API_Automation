package org.example.EX_04_RestAssured_HTTP_Methods.GET;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_009_GET_Non_BDD_style
{
   RequestSpecification r;
   Response rs;
   ValidatableResponse vr;

   // we kept these three in the class level, so we can do reuse them in multiple tests.

    @Test
    public void test_GET_Non_BDD_Style_TC1()
    {

    }

    @Test
    public void test_GET_Non_BDD_Style_TC2()
    {

    }
}
