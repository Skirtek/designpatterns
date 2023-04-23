package com.codecool.strategy;

public class StrategyRunner {
    public static void run() {
        int counter = 12;

        Context context = new Context();
        Strategy strategy1 = new ConcreteStrategy1();
        Strategy strategy2 = new ConcreteStrategy2();

        context.setStrategy(strategy1);
        context.executeStrategy(); // Output: Executing Concrete Strategy 1

        context.setStrategy(strategy2);
        context.executeStrategy(); // Output: Executing Concrete Strategy 2

        if (counter > 13) {
            context.setStrategy(strategy1);
        }

        context.executeStrategy();
    }
}
