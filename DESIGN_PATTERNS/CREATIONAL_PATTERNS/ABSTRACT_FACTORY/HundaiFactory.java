package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.Vehicle;
import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.VehicleType;

public class HundaiFactory implements BrandFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.CAR.equals(vehicleType))
            return new Hundai_Car();
        else if (VehicleType.BIKE.equals(vehicleType))
            return new Hundai_Bike();
        return null;
    }
}
