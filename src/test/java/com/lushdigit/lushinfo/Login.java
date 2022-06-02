package com.lushdigit.lushinfo;

import com.lushdigit.pojo.LoginPogo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Login {

    @Test
    public void login(){
        LoginPogo loginPogo = new LoginPogo();
        loginPogo.setUsername("alice");
        loginPogo.setPassword("a37d3106168770fa4477903703c548c7010ea570");

        Response response = given()
                .body(loginPogo)
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
