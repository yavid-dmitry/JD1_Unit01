package task05;

/*
 *5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public enum TypeTrip implements Type{
    RELAX("Отдых"),
    GUIDE("Экскурсия"),
    CURE_TOUR("Лечение"),
    SHOP_TOUR("Шопинг"),
    CRUIS("Круиз");
    private String name;
    private static int typeID = 0;

    TypeTrip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    public int getTypeID() {
        return typeID;
    }
}
