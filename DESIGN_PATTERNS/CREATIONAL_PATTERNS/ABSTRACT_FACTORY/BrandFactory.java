package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.Vehicle;
import DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY.VehicleType;

public interface BrandFactory {
    Vehicle getVehicle(VehicleType vehicleType);
}
