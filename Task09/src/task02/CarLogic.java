package task02;
/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class CarLogic {
    public static boolean move(Car car){
        boolean canMove = false;
        canMove = car.getEngine().isWorking() && car.isEnoughFuel();
        if(canMove){
            System.out.println("Ура!!! Поехали!!!!");
        } else {
            System.out.println("Не могу ехать. Двигатель не запускается.");
        }
        return canMove;
    }

    public static boolean changeWheel(Car car, Wheel wheel){
        boolean canChange = false;
        if(wheel.getDiameter() == car.getWheel().getDiameter() && wheel.getNumberScrew() == car.getWheel().getNumberScrew()){
            car.setWheel(wheel); canChange = true;
        }
        if(!canChange){
            System.out.println("Данное колесо не подходит этой машине");
        }
        return canChange;
    }

    public static void fillTank(Car car){
        car.setEnoughFuel(true);
    }
}
