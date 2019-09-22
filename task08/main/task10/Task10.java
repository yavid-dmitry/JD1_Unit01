package by.htp.task08.main.task10;

import java.time.*;

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
public class Task10 {

	public static void main(String[] args) {
		AirlineList list = new AirlineList();
		list.add(new Airline(Airport.DOMODEDOVO, "RA1234", Airplane.AIRBUS_A320, LocalTime.of(10, 15), DayOfWeek.MONDAY,
				DayOfWeek.SATURDAY));
		list.add(new Airline(Airport.DOMODEDOVO, "RA1235", Airplane.AIRBUS_A320, LocalTime.of(20, 15), DayOfWeek.TUESDAY,
				DayOfWeek.FRIDAY));
		list.add(new Airline(Airport.VNUKOVO, "AF3234", Airplane.SUKHOY_S100, LocalTime.of(12, 45), DayOfWeek.MONDAY,
				DayOfWeek.THURSDAY));
		list.add(new Airline(Airport.VNUKOVO, "AF3236", Airplane.SUKHOY_S100, LocalTime.of(19, 35), DayOfWeek.WEDNESDAY,
				DayOfWeek.SATURDAY));
		list.add(new Airline(Airport.SHEREMETYEVO, "AF3239", Airplane.BOING_747, LocalTime.of(16, 0), DayOfWeek.MONDAY,
				DayOfWeek.SUNDAY));
		list.add(new Airline(Airport.SHEREMETYEVO, "AF3241", Airplane.BOING_777, LocalTime.of(13, 55), DayOfWeek.SATURDAY));
		list.add(new Airline(Airport.MINSK_2, "BA4568", Airplane.DC7, LocalTime.of(10, 40), DayOfWeek.MONDAY,
				DayOfWeek.SATURDAY));
		list.add(new Airline(Airport.MINSK_2, "BA4569", Airplane.BOING_747, LocalTime.of(20, 35), DayOfWeek.THURSDAY,
				DayOfWeek.SUNDAY));
		list.add(new Airline(Airport.HITROW, "KM7453", Airplane.BOING_777, LocalTime.of(6, 30), DayOfWeek.TUESDAY,
				DayOfWeek.FRIDAY));
		System.out.println("Рейсы на Минск:");
		print(AirlineListLogic.findAirlineToDestination(list, Airport.MINSK_2));
		System.out.println("Рейсы в понедельник:");
		print(AirlineListLogic.findAirlineInDay(list, DayOfWeek.MONDAY));
		System.out.println("Рейсы в понедельник, после обеда:");
		print(AirlineListLogic.findAirlineInDayInTime(list, DayOfWeek.MONDAY, LocalTime.of(12,00)));
		
	}
public static void print(AirlineList list) {
	for(Airline airline: list) {
		System.out.println(airline);
	}
}
}
