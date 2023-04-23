package com.codecool.decoratedduck;

import com.codecool.duck.Colors;
import com.codecool.duck.MallardDuck;
import com.codecool.duck.RedheadDuck;
import com.codecool.duck.RubberDuck;

public class DecoratedDuckRunner {
    public static void run(){
        Behavior mallardDuck = new DuckBaseBehavior();
        Behavior mallardDuckWithFly = new FlyBehavior(mallardDuck);
        Behavior mallardDuckWithFlyAndQuack = new QuackBehavior(mallardDuckWithFly);
        mallardDuckWithFlyAndQuack.run();

        Behavior rubberDuck = new DuckBaseBehavior();
        Behavior rubberDuckWithSquak = new SquakBehavior(rubberDuck);
        rubberDuckWithSquak.run();
    }
}
