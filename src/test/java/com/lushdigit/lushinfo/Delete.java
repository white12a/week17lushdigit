package com.lushdigit.lushinfo;

import com.lushdigit.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    @Test
    public void delete(){
        Response response = given()
                .when()
                .delete("/delete/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
