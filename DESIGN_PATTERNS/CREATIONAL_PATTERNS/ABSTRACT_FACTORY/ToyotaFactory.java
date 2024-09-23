package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.FACTORY.Vehicle;
import DESIGN_PATTERNS.FACTORY.VehicleType;

public class ToyotaFactory implements BrandFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.CAR.equals(vehicleType))
            return new Toyota_Car();
        else if (VehicleType.BIKE.equals(vehicleType))
            return new Toyota_Bike();
        return null;
    }
}
