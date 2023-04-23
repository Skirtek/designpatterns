package com.codecool.decorator;

public class ConcreteDecoratorA extends Decorator {
    ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA operation");
    }
}
