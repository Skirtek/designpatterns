package com.codecool.builder;

public interface CarBuilder {
    CarBuilderImpl setCarType(CarType type);
    CarBuilderImpl setSeats(int seats);
    CarBuilderImpl setEngine(Engine engine);
    CarBuilderImpl setTransmission(Transmission transmission);
    Car build();
}
