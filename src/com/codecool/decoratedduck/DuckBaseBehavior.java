package com.codecool.decoratedduck;

import com.codecool.duck.Colors;

public class DuckBaseBehavior implements Behavior {
    @Override
    public void run() {
        System.out.println(Colors.ANSI_YELLOW + "   " + "🦆" + Colors.ANSI_RESET);
    }
}
