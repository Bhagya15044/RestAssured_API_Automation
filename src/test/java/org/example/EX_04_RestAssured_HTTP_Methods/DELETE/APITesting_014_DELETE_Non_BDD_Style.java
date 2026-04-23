package org.example.EX_04_RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_014_DELETE_Non_BDD_Style
{
    @Test
    public void test_DELETE_Non_BDD_style()
    {
        String Token = "5bf50ac4c9613ae";
        String BookingID = "2074";

        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/" + BookingID);
        rs.contentType(ContentType.JSON);
        rs.cookie("token", Token);
       // rs.body(Payload).log().all();

        Response r = rs.when().log().all().delete();

        ValidatableResponse VR = r.then().log().all();
        VR.statusCode(201);
    }
}

