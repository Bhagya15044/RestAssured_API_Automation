package org.example.Ex_03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab_06_Testcase
{
    String Pincode = "110048";
    @Test
    public void test_Get_Positive_TC1()
    {
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

    }

    @Test
    public void test_Get_Negative_TC2()
    {
        Pincode = "@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_Get_Negative_TC3()
    {
        Pincode =" ";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);
    }
}
