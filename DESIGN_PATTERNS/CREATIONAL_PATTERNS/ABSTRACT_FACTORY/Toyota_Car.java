package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.FACTORY.Car;

public class Toyota_Car extends Car {
    @Override
    public void creatVehicle() {
        System.out.println("created toyota car!!!");
    }
}
