package com.lushdigit.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by bhavesh patel
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port=8080;
        //RestAssured.basePath="/student";
    }
}
