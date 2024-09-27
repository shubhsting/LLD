package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.Bike;

public class Hundai_Bike extends Bike {
    @Override
    public void creatVehicle() {
        System.out.println("created hundai bike!!!");
    }
}
