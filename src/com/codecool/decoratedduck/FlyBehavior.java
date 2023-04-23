package com.codecool.decoratedduck;

import com.codecool.duck.Colors;

public class FlyBehavior extends Decorator {
    FlyBehavior(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(Colors.ANSI_YELLOW + "↖🦆" + Colors.ANSI_RESET);
    }
}
