package com.codecool.decoratedduck;

public class QuackBehavior extends Decorator {
    QuackBehavior(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Quack here");
    }
}
