package com.codecool.observer;

public class ObserverRunner {
    public static void run() {
        Subject subject = new Subject();

        ConcreteSubscriber1 subscriber1 = new ConcreteSubscriber1(subject);
        ConcreteSubscriber2 subscriber2 = new ConcreteSubscriber2(subject);

        subject.setState(10); // Output: ConcreteSubscriber1 updated with state: 10
        //         ConcreteSubscriber2 updated with state: 10

        subject.setState(20); // Output: ConcreteSubscriber1 updated with state: 20
        //         ConcreteSubscriber2 updated with state: 20

        subject.remove(subscriber1);
        subject.setState(30); // Output: ConcreteSubscriber2 updated with state: 30
    }
}
