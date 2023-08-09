package io.arrogantprogrammer;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Set;

public class MockGreetingServiceProfile implements QuarkusTestProfile {

    @Override
    public Set<Class<?>> getEnabledAlternatives(){
        return Set.of(MockGreetingService.class);
    }

}
