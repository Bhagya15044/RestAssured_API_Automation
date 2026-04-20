package org.example.EX_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_008_GET_BDDStyle
{
    @Test
    public void test_GET_Positive()
    {
        String Pincode = "560058";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

    }
}
