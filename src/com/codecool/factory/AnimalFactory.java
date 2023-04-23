package com.codecool.factory;

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        if ("dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}
