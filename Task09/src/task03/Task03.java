package task03;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Task03 {
    public static void main(String[] args) {


        City[] citys = {new City("Минск"),
                new City("Брест"),
                new City("Гомель"),
                new City("Борисов"),
                new City("Барановичи"),
                new City("Мозырь")};


        Region minskaya = new Region("Минская", citys[0],
                new District("Минский", citys[0], 5252),
                new District("Борисовский", citys[3], 3792)
        );
        Region brestskaya = new Region("Брестская", citys[1],
                new District("Брестский", citys[1], 4552),
                new District("Барановичский", citys[4], 4192)
        );
        Region gomelskaya = new Region("Гомельская", citys[2],
                new District("Гомельский", citys[2], 5252),
                new District("Мозырьский", citys[5], 3792)
        );

        State belarus = new State("Беларусь", citys[0], minskaya, brestskaya, gomelskaya);

        System.out.println(StateLogic.getStateInfo(belarus));

    }
}
