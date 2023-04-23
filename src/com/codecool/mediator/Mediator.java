package com.codecool.mediator;

// Mediator interface that defines the common interface for mediator
public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
