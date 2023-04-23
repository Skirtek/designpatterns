package com.codecool.observer;

public class ConcreteSubscriber2 implements Subscriber {
    private final Subject subject;

    public ConcreteSubscriber2(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("ConcreteSubscriber2 updated with state: " + subject.getState());
    }
}