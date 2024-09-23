package DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle;
        if (VehicleType.CAR.equals(vehicleType)) {
            vehicle = new Car();
        } else if (VehicleType.BIKE.equals(vehicleType)) {
            vehicle = new Bike();
        } else {
            vehicle = null;
        }
        return vehicle;
    }
}
