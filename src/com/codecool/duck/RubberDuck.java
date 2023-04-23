package com.codecool.duck;

public class RubberDuck extends Duck {
    @Override
    protected void quack(String duckName) {
        System.out.println("**Squeak from " + duckName + "**");
    }

    @Override
    protected void fly(String color) {
        // do nothing
    }
}
