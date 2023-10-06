package assessment;

public abstract class Vehicle extends Product {
    private int speed;
    private float price;
    private Engine engine;
    protected final float TAX_AMT = 0.10f;

    public Vehicle(String name, int speed, double price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = (float) price;
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void printVehicleType();

    public abstract float getPriceAfterTax(Vehicle vehicle);
}
