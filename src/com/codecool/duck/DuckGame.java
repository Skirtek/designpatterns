package com.codecool.duck;

public class DuckGame {
    public static void run(){
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();

        mallardDuck.display(Colors.ANSI_GREEN, "mallard duck");
        redheadDuck.display(Colors.ANSI_RED, "redhead duck");
        rubberDuck.display(Colors.ANSI_YELLOW, "rubber duck");
    }
}
