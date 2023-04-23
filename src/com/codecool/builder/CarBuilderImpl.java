package com.codecool.builder;

public class CarBuilderImpl implements CarBuilder {
    private final Car car = new Car();

    @Override
    public CarBuilderImpl setCarType(CarType type) {
        car.setCarType(type);

        return this;
    }

    @Override
    public CarBuilderImpl setSeats(int seats) {
        car.setSeats(seats);

        return this;
    }

    @Override
    public CarBuilderImpl setEngine(Engine engine) {
        car.setEngine(engine);

        return this;
    }

    @Override
    public CarBuilderImpl setTransmission(Transmission transmission) {
        car.setTransmission(transmission);

        return this;
    }

    public Car build() {
        return car;
    }
}
