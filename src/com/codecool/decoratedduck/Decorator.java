package com.codecool.decoratedduck;

public abstract class Decorator implements Behavior {
    private final Behavior behavior;

    Decorator(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void run() {
        behavior.run();
    }
}
