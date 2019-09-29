package task05;

import java.util.Objects;

/*
 *5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Trip {
    private String name;
    private int price;
    private TypeTrip typeTrip;
    private TypeTransport transport;
    private TypeFood food;
    private int days;

    public Trip(String name, int price, TypeTrip typeTrip, TypeTransport transport, TypeFood food, int days) {
        this.name = name;
        this.price = price;
        this.typeTrip = typeTrip;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypeTrip getTypeTrip() {
        return typeTrip;
    }

    public void setTypeTrip(TypeTrip typeTrip) {
        this.typeTrip = typeTrip;
    }

    public TypeTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeTransport transport) {
        this.transport = transport;
    }

    public TypeFood getFood() {
        return food;
    }

    public void setFood(TypeFood food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Поезда{ " +
                  name + '\'' +
                ", цена=" + price +
                ", тип=" + typeTrip +
                ", транспорт=" + transport +
                ", питание=" + food +
                ", длительность, дней=" + days +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;
        Trip trip = (Trip) o;
        return price == trip.price &&
                days == trip.days &&
                Objects.equals(name, trip.name) &&
                typeTrip == trip.typeTrip &&
                transport == trip.transport &&
                food == trip.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, typeTrip, transport, food, days);
    }
}
