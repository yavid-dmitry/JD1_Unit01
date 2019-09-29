package task05;

import java.util.Comparator;

public class TypeFoodComparator implements Comparator<Trip> {
    @Override
    public int compare(Trip o1, Trip o2) {
        return o1.getFood().compareTo(o2.getFood());
    }
}
