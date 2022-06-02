package com.lushdigit.lushinfo;

import com.lushdigit.pojo.ProductsPojo;
import com.lushdigit.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch extends TestBase {

    @Test
    public void patchProduct(){
        ProductsPojo productsPojo=new ProductsPojo();
        productsPojo.setName("Marmalade");
        productsPojo.setAvailable(250);

        Response response = given()
                .body(productsPojo)
                .when()
                .put("products/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
