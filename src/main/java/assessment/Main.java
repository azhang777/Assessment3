package assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane("plane",500,100000,new Engine(Size.LARGE));
        Boat boat = new Boat("boat",200,30000,new Engine(Size.SMALL), true);
        Car car = new Car("car",150,35000,new Engine(Size.MEDIUM),4);
        Truck truck = new Truck("truck",140,30000,new Engine(Size.MEDIUM));
        Drone drone = new Drone("drone");
        FlyingCar flyingCar = new FlyingCar("flyingCar",300, 150000,new Engine(Size.MEDIUM),32322);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(plane);
        vehicleList.add(boat);
        vehicleList.add(car);
        vehicleList.add(truck);
        vehicleList.add(flyingCar);
        VehicleApp.printListOfVehicleNames(vehicleList);

        List<Flyable> flyableList = new ArrayList<>();
        flyableList.add(drone);
        flyableList.add(plane);
        flyableList.add(flyingCar);
        VehicleApp.printListOfFlyableObjects(flyableList);

        HashMap<Integer,String> passenger = new HashMap<>();
        Passenger passengers = new Passenger(passenger);
        passenger.put(1,"Andy Zhang");
        passenger.put(2,"Tony Zhang");
        VehicleApp.printPassengerNumbersOnly(passenger);

        List<Drivable> drivableList = new ArrayList<>();
        drivableList.add(flyingCar);
        drivableList.add(truck);
        drivableList.add(boat);
        drivableList.add(car);

        VehicleApp.sortAndPrintDriveableVehiclesBySpeed(drivableList);
        car.printFormattedPriceAfterTax(car.getPriceAfterTax(car));

        boat.printGpsInfo();
        car.printSpeed();
        System.out.println(plane.transportsPassenger());

    }
}

/*
Questions to ask Mikaila:
2. getPriceAfterTax needs a parameter Vehicle?
3. Transports passengers is just returning true false?
 */
