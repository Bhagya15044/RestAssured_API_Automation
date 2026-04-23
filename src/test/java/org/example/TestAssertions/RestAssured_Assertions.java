package org.example.TestAssertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*; // this is a 3rd party library we need to import from outside


public class RestAssured_Assertions
{
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String Token;
    Integer BookingID;

    @Test
    public void test_create_Booking()
    {
        String Payload = "{\n" +
                "    \"firstname\" : \"Bhagya\",\n" +
                "    \"lastname\" : \"Sri\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(Payload).log().all();

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();

        //these are rest assured default assertions
        validatableResponse.statusCode(200);

        /*
        if we want to find that booking is not null, here we use body()
        give the path of the value using JSON finder and copy them here and compare with matchers.not null value
        */

        // booking--> JSON path, here we are checking booking id should not be equal to null.
        validatableResponse.body("booking", Matchers.notNullValue());

        //booking.firstname-->JSON path, here we are checking that first name should be equalTo our given name, firstname==Bhagya
        validatableResponse.body("booking.firstname", Matchers.equalTo("Bhagya"));

       //booking.lastname-->JSON path, here we are checking that last name should be equalTo our given name, Lastname==Sri
        validatableResponse.body("booking.lastname", Matchers.equalTo("Sri"));

        validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));

        assertThat(BookingID).isNotNull().isPositive(); // here we write the testcase in one line with help of .
    }
}
// after running these assertions using TestNG, it will create the allure results folder as well