package io.arrogantprogrammer;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @InjectMock
    GreetingService greetingService;

    String expectedString = """
        "This is the land of Narnia," said the Faun, "where we are now; all that lies between the
        lamp-post and the great castle of Cair Paravel on the eastern sea. And you - you have
        come from the wild woods of the west?"
    """;

    @BeforeEach
    void setUp() {
        Mockito.when(greetingService.greet()).thenReturn(expectedString);
    }
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is(expectedString));
    }

}