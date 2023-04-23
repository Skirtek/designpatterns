package com.codecool.strategy;

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Concrete Strategy 1");
    }
}