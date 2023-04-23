package com.codecool.factory;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}