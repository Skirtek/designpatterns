package com.codecool.observer;

public class ConcreteSubscriber1 implements Subscriber {
    private final Subject subject;

    public ConcreteSubscriber1(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("ConcreteSubscriber1 updated with state: " + subject.getState());
    }
}
