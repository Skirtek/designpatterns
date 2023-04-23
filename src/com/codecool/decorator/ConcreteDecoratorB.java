package com.codecool.decorator;

public class ConcreteDecoratorB extends Decorator {
    ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorB operation");
    }
}
