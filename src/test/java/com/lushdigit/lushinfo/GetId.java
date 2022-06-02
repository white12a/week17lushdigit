package com.lushdigit.lushinfo;

import com.lushdigit.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetId extends TestBase {
    @Test
    public void getProductsById() {
        Response response = given()
                .when()
                .get("/products/2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
