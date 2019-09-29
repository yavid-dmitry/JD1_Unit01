package task02;

import java.util.Objects;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Engine {
    private String title;
    private int powerHP;
    private boolean isWorking;

    public Engine(String title, int powerHP, boolean isWorking) {
        this.title = title;
        this.powerHP = powerHP;
        this.isWorking = isWorking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(int powerHP) {
        this.powerHP = powerHP;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return powerHP == engine.powerHP &&
                isWorking == engine.isWorking &&
                Objects.equals(title, engine.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, powerHP, isWorking);
    }
}
