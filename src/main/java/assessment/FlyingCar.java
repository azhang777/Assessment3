package assessment;

public class FlyingCar extends Vehicle implements Flyable,Drivable {

    public FlyingCar(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printSpeed() {
        System.out.println(super.getSpeed());
    }

    @Override
    public boolean transportsPassenger() {
        return false;
    }

    @Override
    public void printVehicleType() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public float getPriceAfterTax(Vehicle vehicle) {
        float initialPrice = vehicle.getPrice();
        float taxAmount = initialPrice * vehicle.TAX_AMT;
        return initialPrice + taxAmount;
    }

    @Override
    public String toString() {
        return "FlyingCar{" +
                "speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", TAX_AMT=" + TAX_AMT + '}';
    }
}
