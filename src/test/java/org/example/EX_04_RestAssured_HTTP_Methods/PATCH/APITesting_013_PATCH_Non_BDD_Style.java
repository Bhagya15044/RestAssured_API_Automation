package org.example.EX_04_RestAssured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_013_PATCH_Non_BDD_Style
{
    @Test
   public void test_PATCH_Non_BDD_Style()
   {
       String Token = "7ccd2dbc4bb6efb";
       String BookingID = "604";
       String Payload = "{\n" +
               "    \"firstname\" : \"James\",\n" +
               "    \"lastname\" : \"Brown\"\n" +
               "}";

       // here i taken request specification, response, validatable response locally , no reuse .

       RequestSpecification rs = RestAssured.given();
       rs.baseUri("https://restful-booker.herokuapp.com");
       rs.basePath("/booking/" + BookingID);
       rs.contentType(ContentType.JSON);
       rs.cookie("token", Token);
       rs.body(Payload).log().all();

       Response r = rs.when().log().all().patch();

       ValidatableResponse VR = r.then().log().all();
       VR.statusCode(200);
   }
}
/*
    first generate the token
    add this into create booking id headers cookie: token = generated token and run it,
     we will get the booking id
    keep that id in the patch request and run it.
    then add the token, booking in the intellij(string token , string booking id).
*/