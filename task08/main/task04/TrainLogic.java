package by.htp.task08.main.task04;

import java.util.List;

/*
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
 * назначения должны быть упорядочены по времени отправления.
 */
public class TrainLogic {

	public static void printTrain(List<Train> list, int number) {
		for (Train t : list) {
			if (t.getNumberTrain() == number) {
				System.out.println(t);
			}
		}
	}

	public static void printAllTrain(List<Train> list) {
		for (Train t : list) {

			System.out.println(t);

		}
	}

}
