package com.codecool.duck;

import java.util.Arrays;

public abstract class Duck {
    protected void quack(String duckName) {
        System.out.println("**Quack from " + duckName + "**");
    }

    protected void fly(String color) {
        System.out.println(color + "↖🦆" + Colors.ANSI_RESET);
    }

    protected void swim(int length, String color) {
        char[] spaces = new char[length];
        Arrays.fill(spaces, ' ');
        System.out.println(color + new String(spaces) + "🦆" + Colors.ANSI_RESET);
    }

    protected void display(String color, String name) {
        swim(2, color);
        quack(name);
        swim(1, color);
        fly(color);
    }
}
