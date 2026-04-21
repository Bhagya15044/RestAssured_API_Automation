package org.example.EX_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_009_GET_Non_BDD_style
{
   RequestSpecification r;
   Response rs;
   ValidatableResponse vr;
    String Pincode ;

   // we kept these three in the class level, so we can do reuse them in multiple tests.

    @Test
    public void test_GET_Non_BDD_Style_TC1()
    {
        Pincode = "210048";
        //Step-1: given (we prepared the request specification.)
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+ Pincode);

        // step-2: when(making the request )
        rs = r.when().log().all().get();
        // if we want to see response as string
        System.out.println(rs.asString());

        //step-3: Then(validating the response)
        vr = rs.then().log().all().statusCode(200);
        // we can write the further testcases or assertions also here.

    }

    @Test
    public void test_GET_Non_BDD_Style_NegativeTC()
    {
        Pincode = "@";
        //Step-1: given (we prepared the request specification.)
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+ Pincode);

        // step-2: when(making the request )
        rs = r.when().log().all().get();
        // if we want to see response as string
        System.out.println(rs.asString());

        //step-3: Then(validating the response)
        vr = rs.then().log().all().statusCode(200);
        // we can write the further testcases or assertions also here.
    }
}
