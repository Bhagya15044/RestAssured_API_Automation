package org.example.EX_04_RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_010_POST_BDD_Style
{
    /* the original url taken from the postman testcase in the REST Api folder and name of the test case is create token
     https://restful-booker.herokuapp.com */
    @Test
    public void test_POST_AUTH_TOKEN()
    {
        String Payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(Payload)

                .when()
                .log().all()
                .post()

                .then()
                .log().all()
                .statusCode(200);
    }
}
