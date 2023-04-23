package com.codecool.facade;

public class DataProvider {
    private final Cepik cepik = new Cepik();
    private final Bik bik = new Bik();
    private final Ufg ufg = new Ufg();

    public void getDriverData() {
        cepik.fetchData();
        bik.fetchData();
        ufg.fetchData();
    }
}
