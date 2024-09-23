package DESIGN_PATTERNS.CREATIONAL_PATTERNS.FACTORY;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // String str = scn.next();
        // Vehicle vehicle;
        // if (VehicleType.BUS.name().equals(str)) {
        //     vehicle = new Car();
        // } else if (VehicleType.BIKE.name().equals(str)) {
        //     vehicle = new Bike();
        // } else {
        //     vehicle = null;
        // }
        // vehicle.creatVehicle();
        // scn.close();

        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.BIKE);
        vehicle.creatVehicle();
    }
}
