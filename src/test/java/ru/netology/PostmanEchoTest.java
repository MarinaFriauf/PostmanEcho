package ru.netology;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

class PostmanEchoTest {
    @Test
    void shouldReturnSendData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("some data"));
    }
}