package org.example.ex_01_RA_Concepts;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld
{
    public static void main(String[] args)
    {
        //https://api.postalpincode.in/pincode/560036 --> url we are going to use.

        RestAssured.given().  // here we divide complete url into 2 types. given is prerequisite
                baseUri("https://api.postalpincode.in").
                basePath("pincode/560036")

                .when()  // response which we want to take the response.
                .get()

                .then()
                .log().all()  // log.all basically do printing
                .statusCode(200);



    }
}
