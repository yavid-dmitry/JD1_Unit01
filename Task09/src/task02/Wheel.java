package task02;

import java.util.Objects;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel {
    private int diameter;
    private int numberScrew;

    public Wheel(int diameter, int numberScrew) {
        this.diameter = diameter;
        this.numberScrew = numberScrew;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getNumberScrew() {
        return numberScrew;
    }

    public void setNumberScrew(int numberScrew) {
        this.numberScrew = numberScrew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                numberScrew == wheel.numberScrew;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, numberScrew);
    }
}
