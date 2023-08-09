package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService {

    @Inject
    TumnusService tumnusService;

    public String greet() {

        return "Allow me to introduce myself. My name is Tumnus.";
    }

    public String greetPevensie(Pevensie pevensie) {

        return "Someday you will be old enough to start reading fairy tales again, " + pevensie.getName();
    }

    public String greetingFromTumnus() {

        return tumnusService.quote();
    }
}
