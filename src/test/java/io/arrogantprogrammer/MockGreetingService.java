package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

@Alternative @ApplicationScoped
public class MockGreetingService extends GreetingService{

    public String greet() {

        return "Allow me to introduce myself. My name is MockTumnus.";
    }

}
