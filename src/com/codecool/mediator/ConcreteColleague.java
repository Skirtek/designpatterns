package com.codecool.mediator;

public class ConcreteColleague implements Colleague {
    private final Mediator mediator;

    public ConcreteColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
}
