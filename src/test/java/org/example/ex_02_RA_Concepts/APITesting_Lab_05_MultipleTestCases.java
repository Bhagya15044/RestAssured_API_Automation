package org.example.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab_05_MultipleTestCases
{
    public static void main(String[] args)
    {
        // postal pin code test case
        //https://api.zippopotam.us --> original url

        // Test case -1
        String Pincode = "110048";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

        // Test case -2
        Pincode = "@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

        // Test case -3
        Pincode =" ";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

    }
}
