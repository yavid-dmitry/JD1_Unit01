package task02;

import java.util.Objects;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    private String title;
    private Wheel wheel;
    private int wheelNumber;
    private Engine engine;
    private boolean isEnoughFuel;

    public Car(String title, Wheel wheel, int wheelNumber, Engine engine, boolean isEnoughFuel) {
        this.title = title;
        this.wheel = wheel;
        this.wheelNumber = wheelNumber;
        this.engine = engine;
        this.isEnoughFuel = isEnoughFuel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isEnoughFuel() {
        return isEnoughFuel;
    }

    public void setEnoughFuel(boolean enoughFuel) {
        isEnoughFuel = enoughFuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return wheelNumber == car.wheelNumber &&
                isEnoughFuel == car.isEnoughFuel &&
                Objects.equals(title, car.title) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, wheel, wheelNumber, engine, isEnoughFuel);
    }
}
