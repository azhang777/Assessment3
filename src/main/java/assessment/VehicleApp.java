package assessment;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class VehicleApp {
    public static void printListOfVehicleNames(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName());
        }
    }
    public static void printListOfFlyableObjects(List<Flyable> flyables) {
        for (Flyable flyable : flyables) {
            System.out.println(flyable);
        }
    }
    public static void sortAndPrintDriveableVehiclesBySpeed(List<Drivable> drivables) {
        Comparator<Drivable> speedComparator = new SpeedComparator();
        drivables.sort(speedComparator);
        for (Drivable drivable : drivables) {
            System.out.println(drivable);
        }
    }
    public static void printPassengerNumbersOnly(Map<Integer, String> passengers) {
        for (Map.Entry<Integer, String> entry : passengers.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
