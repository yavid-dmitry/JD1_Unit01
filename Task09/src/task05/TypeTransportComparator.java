package task05;

import java.util.Comparator;

public class TypeTransportComparator  implements Comparator<Trip> {
    @Override
    public int compare(Trip o1, Trip o2) {
        return o1.getTransport().compareTo(o2.getTransport());
    }
}
