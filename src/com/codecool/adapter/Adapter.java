package com.codecool.adapter;

// Adapter class that adapts Adaptee to Target
public class Adapter implements Target {
    private final Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
