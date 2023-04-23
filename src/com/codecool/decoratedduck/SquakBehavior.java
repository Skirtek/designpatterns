package com.codecool.decoratedduck;

public class SquakBehavior extends Decorator {
    SquakBehavior(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Squak here");
    }
}