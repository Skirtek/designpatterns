package com.codecool.mediator;

public class MediatorRunner {
    public static void run(){
        // Create mediator
        ConcreteMediator mediator = new ConcreteMediator();

        // Create colleagues
        ConcreteColleague colleague1 = new ConcreteColleague(mediator);
        ConcreteColleague colleague2 = new ConcreteColleague(mediator);

        // Set colleagues in the mediator
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        // Send messages between colleagues through the mediator
        colleague1.sendMessage("Hello from colleague1!");
        colleague2.sendMessage("Hi from colleague2!");
    }
}
