package com.codecool.decorator;

public class DecoratorRunner {
    public static void run(){
        // Create a ConcreteComponent object
        Component component = new ConcreteComponent();

        // Create ConcreteDecoratorA and ConcreteDecoratorB objects
        Component decoratedComponentA = new ConcreteDecoratorA(component);
        Component decoratedComponentB = new ConcreteDecoratorB(decoratedComponentA);

        // Create a Client object
        Client client = new Client();

        // Client uses the decorated component
        //decoratedComponentA.operation();
        //decoratedComponentB.operation();
        //client.doOperation(decoratedComponentB);
    }
}
