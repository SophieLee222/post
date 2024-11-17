package ru.netology;

import org.junit.jupiter.api.Test;

import javax.crypto.interfaces.DHKey;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

class MobileBankApiTest {
    @Test
    void shouldReturnDemoAccounts() {
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
                .body("data", org.hamcrest.Matchers.equalTo("Hi"));
        ;
    }
}

