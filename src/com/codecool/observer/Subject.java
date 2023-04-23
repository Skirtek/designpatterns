package com.codecool.observer;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
public class Subject {
    private List<Subscriber> subscribers = new ArrayList<>();
    private int state;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setState(int state) {
        this.state = state;
        notifySubscribers();
    }

    public int getState() {
        return state;
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
}
