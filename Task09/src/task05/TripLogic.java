package task05;

import java.util.*;

/*
 *5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class TripLogic {

    public static List<Trip> find(Trip[] trips, Type... types) {
        List<Trip> list = new ArrayList<>();
        for (Type type : types) {
            for (Trip trip : trips) {
                if (isTargetType(trip, type)) {
                    if (!list.contains(trip)) {
                        list.add(trip);
                    }
                }
            }
        }
        return list;
    }

    ;

    public static boolean isTargetType(Trip trip, Type type) {
        boolean target;
        switch (type.getTypeID()) {
            case 0:
                target = trip.getTypeTrip().equals((TypeTrip) type);
                return target;
            case 1:
                target = trip.getTransport().equals((TypeTransport) type);
                return target;
            case 2:
                target = trip.getFood().equals((TypeFood) type);
                return target;
        }
        return false;
    }

    public static void sort(Type type, List<Trip> trips) {
        switch (type.getTypeID()) {
            case 0:
                Collections.sort(trips, new TypeTripComparator());
            case 1:
                Collections.sort(trips, new TypeTransportComparator());
            case 2:
                Collections.sort(trips, new TypeFoodComparator());
        }
    }
}

