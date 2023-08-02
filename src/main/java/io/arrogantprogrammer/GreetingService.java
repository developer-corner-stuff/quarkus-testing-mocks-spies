package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greet() {

        return "Allow me to introduce myself. My name is Tumnus.";
    }
}
