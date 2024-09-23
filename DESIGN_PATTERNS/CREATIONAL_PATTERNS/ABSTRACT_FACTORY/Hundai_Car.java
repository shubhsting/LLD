package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.FACTORY.Car;

public class Hundai_Car extends Car {
    @Override
    public void creatVehicle() {
        System.out.println("created hundai car!!!");
    }
}
