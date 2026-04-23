package org.example.EX_04_RestAssured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_012_PUT_Non_BDD_Style
{
    // To make the put request we need body, token, auth,booking id,payload
    // first, take the token from create token and
    // add it in PUT request headers, which is cookie = token=generated token need to copy and paste.
    // To store the payload, we have 3 formats 1.string, 2. Hashmap,3.classes(POJO)
    //Most popular format is classes.

    RequestSpecification RS;
    Response r;
    ValidatableResponse VR;

    @Test
    public void test_PUT_Non_BDD_style()
    {
        String Token = "05b9505fd9d492e";
        String BookingID = "2858";
        String Payload = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        //Step-1
        RS = RestAssured.given();
        RS.baseUri("https://restful-booker.herokuapp.com");
        RS.basePath("/booking/" + BookingID);
        RS.contentType(ContentType.JSON);
        RS.cookie("token", Token);
        RS.body(Payload).log().all();//because miss the adding of the body(payload)We got the 400 bad request
//        RS.header("api-key","abc"); if we want to add the token
//        RS.header("Bearer","abcxyz");
       //   RS.auth().basic();

        //Step-2
        r = RS.when().log().all().put();

        //Step-3
        VR = r.then().log().all().statusCode(200);
    }

}
