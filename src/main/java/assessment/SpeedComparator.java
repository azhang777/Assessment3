package assessment;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Drivable> {

    @Override
    public int compare(Drivable vehicle1, Drivable vehicle2) {
        if (vehicle1.getSpeed() > vehicle2.getSpeed()) {
            return 1;
        }
        else if (vehicle1.getSpeed() < vehicle2.getSpeed()) {
            return -1;
        }
        return 0;
    }
}
