package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.Vehicle;
import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.VehicleType;

public class Main {
    public static void main(String[] args) {
        BrandFactory brandFactory = VehicleFactory.getBrandFactory(BrandName.HUNDAI);
        Vehicle vehicle = brandFactory.getVehicle(VehicleType.CAR);
        vehicle.creatVehicle();
    }
}
