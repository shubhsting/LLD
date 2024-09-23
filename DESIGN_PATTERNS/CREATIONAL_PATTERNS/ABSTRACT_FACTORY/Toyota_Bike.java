package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.FACTORY.Bike;

public class Toyota_Bike extends Bike {
    @Override
    public void creatVehicle() {
        System.out.println("created toyota bike!!!");
    }
}
