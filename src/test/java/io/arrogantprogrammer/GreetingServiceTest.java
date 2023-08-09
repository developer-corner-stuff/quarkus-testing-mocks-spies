package io.arrogantprogrammer;

import io.quarkus.test.InjectMock;
import io.quarkus.test.component.QuarkusComponentTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusComponentTest
public class GreetingServiceTest {

    @Inject
    GreetingService greetingService;
    @InjectMock
    TumnusService tumnusService;

    @Test
    public void testTumnusQuote() {

        Mockito.when(tumnusService.quote()).thenReturn("Allow me to introduce myself. My name is Tumnus.");
        assertEquals("Allow me to introduce myself. My name is Tumnus.", greetingService.greetingFromTumnus());
    }
}
