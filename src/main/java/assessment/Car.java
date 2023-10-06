package assessment;

public class Car extends Vehicle implements Drivable {
    private int numberOfDoors;
    private final float extraTax = 0.05f;
    public Car(String name, int speed, double price, Engine engine, int numberOfDoors) {
        super(name, speed, price, engine);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void printNumberOfDoors() {
        System.out.println(getNumberOfDoors());
    }

    @Override
    public void printSpeed() {
        System.out.println(super.getSpeed());
    }

    @Override
    public void printVehicleType() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public float getPriceAfterTax(Vehicle vehicle) {
        float initialPrice = vehicle.getPrice();
        float totalTax = vehicle.TAX_AMT + extraTax;
        float taxAmount = initialPrice * totalTax;
        return initialPrice + taxAmount;
    }

    public  void printFormattedPriceAfterTax(float finalPrice) {
        System.out.printf("%.2f\n", finalPrice);
    }
    @Override
    public String toString() {
        return "Car{" +
                "extraDiscount=" + extraTax +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                '}';
    }
}
