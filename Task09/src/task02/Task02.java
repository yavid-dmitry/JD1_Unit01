package task02;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Task02 {
    public static void main(String[] args) {
        Car car = new Car("Тойота", new Wheel(16, 5), 4,
                new Engine("ZX-6", 105, true), false);
        System.out.print("Нам купили машину! Марки - ");
        printTitleCar(car);
        System.out.println("Мы захотели покататься, но колесо было спущено. Мы попытались заменить его на первое попавшееся.");
        CarLogic.changeWheel(car, new Wheel(19,5));
        System.out.println("Тогда мы купили подходящее колесо и поменяли его");
        CarLogic.changeWheel(car, new Wheel(car.getWheel().getDiameter(),car.getWheel().getNumberScrew()));
        System.out.println("Ну наконец-то мы поедем");
        CarLogic.move(car);
        System.out.println("Оказалось не было бензина. Тогда мы залили бензин и приготовились ехать");
        CarLogic.fillTank(car);
        CarLogic.move(car);
    }
    public static void printTitleCar(Car car){
        System.out.println(car.getTitle());
    }
}
