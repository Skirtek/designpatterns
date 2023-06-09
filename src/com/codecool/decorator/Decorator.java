package com.codecool.decorator;

public abstract class Decorator implements Component {
    private final Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}