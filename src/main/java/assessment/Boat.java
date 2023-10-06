package assessment;

public class Boat extends Vehicle implements Drivable{
    private boolean hasGPS;

    public Boat(String name, int speed, double price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void printGpsInfo() {
        if (!hasGPS) {
            System.out.println("GPS online " + hasGPS + ": currently locating...");
            return;
        }
        System.out.println("GPS online " + hasGPS + ": in the ocean!");
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
        float taxAmount = initialPrice * vehicle.TAX_AMT;
        return initialPrice + taxAmount;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "engine=" + getEngine() +
                ", price=" + getPrice() +
                ", speed=" + getSpeed() +
                ", TAX_AMT=" + TAX_AMT +
                '}';
    }
}
