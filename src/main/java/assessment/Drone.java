package assessment;

public class Drone implements Flyable{
    private String name;

    public Drone(String name) {
        this.name = name;
    }

    @Override
    public boolean transportsPassenger() {
        return false;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name + '\'' +
                '}';
    }
}
