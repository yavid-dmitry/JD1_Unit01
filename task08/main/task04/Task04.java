package by.htp.task08.main.task04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

/*
 *44. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива 
 * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
 * назначения должны быть упорядочены по времени отправления.
 */

public class Task04 {

	public static void main(String[] args) {
		ArrayList<Train> list = new ArrayList<Train>();
		list.add(new Train("Москва", 515, new GregorianCalendar(2019,Calendar.SEPTEMBER,30,18,23)));
		list.add(new Train("Москва", 516, new GregorianCalendar(2019,Calendar.SEPTEMBER,30,10,55)));
		list.add(new Train("Москва", 517, new GregorianCalendar(2019,Calendar.SEPTEMBER,31,5,2)));
		list.add(new Train("Минск", 525, new GregorianCalendar(2019,Calendar.SEPTEMBER,30,18,20)));
		list.add(new Train("Минск", 527, new GregorianCalendar(2019,Calendar.SEPTEMBER,30,11,40)));
		int numberTrain = 515;
		System.out.println("Для поезда номер " + 515 + " информация следующая:");
		TrainLogic.printTrain(list, numberTrain);
		System.out.println("Изначальный массив поездов:");
		TrainLogic.printAllTrain(list);
		System.out.println("Отсортированный массив поездов");
		Collections.sort(list);
		TrainLogic.printAllTrain(list);
	}

}

