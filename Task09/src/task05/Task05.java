package task05;

import java.util.List;

/*
 *5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Task05 {
    public static void main(String[] args) {
        Trip[] trips = {
                new Trip("Милан",2341,TypeTrip.SHOP_TOUR,TypeTransport.PLANE,TypeFood.WITHOUT,11),
                new Trip("Париж",3451,TypeTrip.GUIDE,TypeTransport.BUS,TypeFood.ONLY_BREACKFAST,12),
                new Trip("Кельн",3451,TypeTrip.CURE_TOUR,TypeTransport.BUS,TypeFood.ALL_INCLUSIVE,10),
                new Trip("СПБ",1545,TypeTrip.GUIDE,TypeTransport.BUS,TypeFood.WITHOUT,51),
                new Trip("Москва",1451,TypeTrip.SHOP_TOUR,TypeTransport.PLANE,TypeFood.ONLY_BREACKFAST,31),
                new Trip("Одесса",361,TypeTrip.CRUIS,TypeTransport.SHIP,TypeFood.ALL_INCLUSIVE,12),
                new Trip("Варшава",541,TypeTrip.RELAX,TypeTransport.BUS,TypeFood.ONLY_BREACKFAST,11),
                new Trip("Магдебург",5461,TypeTrip.GUIDE,TypeTransport.BUS,TypeFood.WITHOUT,51),
                new Trip("Торунь",54361,TypeTrip.RELAX,TypeTransport.BUS,TypeFood.ALL_INCLUSIVE,61),
                new Trip("Гданьск",4561,TypeTrip.CRUIS,TypeTransport.SHIP,TypeFood.ONLY_BREACKFAST,12),
                new Trip("Лондон",371,TypeTrip.CURE_TOUR,TypeTransport.PLANE,TypeFood.WITHOUT,15),
                new Trip("Марсель",3561,TypeTrip.CRUIS,TypeTransport.SHIP,TypeFood.ONLY_BREACKFAST,23),
                new Trip("Тенерифе",6751,TypeTrip.RELAX,TypeTransport.PLANE,TypeFood.ALL_INCLUSIVE,11),

        };
        System.out.println("Найдем все путевки, где только завтра и отсортируем их по типу");
        List<Trip> list = TripLogic.find(trips,TypeFood.ONLY_BREACKFAST);
        TripLogic.sort(TypeTrip.GUIDE,list);
        print(list);


    }
    public static void print(List<Trip> trips){
        for(Trip trip: trips){
            System.out.println(trip);
        }
    }
}
