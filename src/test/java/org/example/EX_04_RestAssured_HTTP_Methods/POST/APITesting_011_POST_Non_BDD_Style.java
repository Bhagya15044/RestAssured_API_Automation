package org.example.EX_04_RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_011_POST_Non_BDD_Style
{
    RequestSpecification rs;
    Response response;
    ValidatableResponse VR;

    @Test
    public void test_POST_Non_BDDStyle_Create_Token()
    {
        String Payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("-----------part-1---------");

        //Step-1
        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/auth");
        rs.contentType(ContentType.JSON);
        rs.body(Payload).log().all();

        //Step-2
        response = rs.when().log().all().post();
        System.out.println(response.asString());

        //Step-3
        VR = response.then().log().all();
        VR.statusCode(200);
    }
}
