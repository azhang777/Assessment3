package assessment;

public class Engine {
    private Size size;
    public Engine(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                '}';
    }
}
