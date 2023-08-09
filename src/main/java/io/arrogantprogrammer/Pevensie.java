package io.arrogantprogrammer;


public class Pevensie {

    String name;

    public Pevensie(String name) {
        this.name = name;
    }

    public Pevensie() {
    }

    @Override
    public String toString() {
        return "My name is " + name + " Pevensie";
    }

    public String getName() {
        return name + "Pevensie";
    }
}
