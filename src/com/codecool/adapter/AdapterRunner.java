package com.codecool.adapter;

public class AdapterRunner {
    public static void run(){
        // Create an Adaptee object
        Adaptee adaptee = new Adaptee();

        // Create an Adapter object
        Adapter adapter = new Adapter(adaptee);

        // We can use method from Adaptee class using method from Target interface
        adapter.request();
    }
}
