package com.lushdigit.lushinfo;

import com.lushdigit.pojo.ProductsPojo;
import com.lushdigit.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class post extends TestBase {
    @Test
    public void CreateProducts(){
        ProductsPojo productsPojo=new ProductsPojo();
        productsPojo.setName("mango jam");
        productsPojo.setAvailable(100);

        Response response = given()
                .body(productsPojo)
                .when()
                .post("products");
        response.then().statusCode(201);// returning status code 200
        response.prettyPrint();
    }
}
