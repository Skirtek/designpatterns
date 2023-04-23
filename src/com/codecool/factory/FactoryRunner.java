package com.codecool.factory;

import java.nio.charset.Charset;

public class FactoryRunner {
    public static void run(){
        // Zwraca bazowy charset zależnie od podanego parametru
        // Metody ma te same
        Charset utf8 = Charset.forName("UTF-8");
        Charset ascii = Charset.forName("ASCII");

        System.out.println(utf8.displayName());
        System.out.println(ascii.displayName());

        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.createAnimal("dog");

        animal.speak();
    }
}
