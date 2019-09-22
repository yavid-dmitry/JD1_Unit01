package by.htp.task08.main.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, 
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, 
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class AirlineListLogic {
	public static AirlineList findAirlineToDestination(AirlineList list, Airport destination) {
		AirlineList targetList = new AirlineList();
		for (Airline airline : list) {
			if (airline.getDestination() == destination) {
				targetList.add(airline);
			}
		}
		return targetList;
	}

	public static AirlineList findAirlineInDay(AirlineList list, DayOfWeek day) {
		AirlineList targetList = new AirlineList();
		for (Airline airline : list) {
			for (int i = 0; i < airline.getDate().length; i++) {
				if (airline.getDate()[i] == day) {
					targetList.add(airline);
					break;
				}

			}
		}
		return targetList;
	}

	public static AirlineList findAirlineInDayInTime(AirlineList list, DayOfWeek day, LocalTime time) {
		AirlineList targetList = new AirlineList();
		for (Airline airline : list) {
			for (int i = 0; i < airline.getDate().length; i++) {
				if (airline.getDate()[i] == day && airline.getTime().isAfter(time)) {
					targetList.add(airline);
					break;
				}

			}
		}
		return targetList;
	}
}
