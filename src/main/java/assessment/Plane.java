package assessment;

public class Plane extends Vehicle implements Flyable {
    public Plane(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public boolean transportsPassenger() {
        return true;
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
        return "Plane{" +
                "speed=" + getSpeed() +
                ", price=" + getPrice() +
                "TAX_AMT=" + TAX_AMT + '}';
    }
}
