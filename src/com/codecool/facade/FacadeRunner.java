package com.codecool.facade;

public class FacadeRunner {
    public static void run(){
        DataProvider dataProvider = new DataProvider();
        dataProvider.getDriverData();
    }
}
