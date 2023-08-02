package io.arrogantprogrammer;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectSpy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GreetingResourceSpy {

    @InjectSpy
    GreetingService greetingService;

    @Test
    public void testGreeting() {

        given()
                .when().get("/hello")
                .then()
                .statusCode(200);

        Mockito.verify(greetingService, Mockito.times(1)).greet();
    }
}
