package task05;

import java.util.Comparator;

/*
 *5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public enum TypeTransport  implements Type {
    PLANE("Самолет"),
    BUS("Автобус"),
    SHIP("Круизный лайнер");
    private String name;
    private int value;
    private static int typeID = 1;
    TypeTransport(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compare(Type o1, Type o2) {


        return o1.toString().compareTo(o2.toString());
    }

    public int getTypeID() {
        return typeID;
    }
}
