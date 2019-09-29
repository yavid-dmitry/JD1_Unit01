package task05;

import java.util.Comparator;

public class TypeTripComparator implements Comparator<Trip> {
    @Override
    public int compare(Trip o1, Trip o2) {
        return o1.getTypeTrip().compareTo(o2.getTypeTrip());
    }
}
