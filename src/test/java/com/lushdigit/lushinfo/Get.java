package com.lushdigit.lushinfo;

import com.lushdigit.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get extends TestBase {

    @Test
    public void getAllProducts(){

        Response response= given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
