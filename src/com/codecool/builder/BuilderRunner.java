package com.codecool.builder;

public class BuilderRunner {
    public static void run(){
        // StringBuilder również
        StringBuffer stringBuffer = new StringBuffer();
        String result = stringBuffer.append("a").append("b").append("c").toString();

        System.out.println(result);

        CarBuilder builder = new CarBuilderImpl();

        builder
                .setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0));

        // Do query to database to get transmission type

        Car car = builder.setTransmission(Transmission.SEMI_AUTOMATIC).build();

        System.out.println("Car built: " + car.getCarType());
    }
}
