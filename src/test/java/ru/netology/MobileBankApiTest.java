package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanTest {
    @Test
    void shouldReturnSendTo() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Hey") // отправляемые данные (заголовки и query можно выставлять аналогично)
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hey"));
        ;
    }
}

