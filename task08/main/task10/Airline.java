package by.htp.task08.main.task10;
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
import java.time.*;
public class Airline {
private Airport destination;
private String flight;
private Airplane plane;
private LocalTime time;
private DayOfWeek[] date;
public Airline(Airport destination, String flight, Airplane plane, LocalTime time, DayOfWeek...date) {
	super();
	this.destination = destination;
	this.flight = flight;
	this.plane = plane;
	this.time = time;
	this.date = date;
}
public Airport getDestination() {
	return destination;
}
public void setDestination(Airport destination) {
	this.destination = destination;
}
public String getFlight() {
	return flight;
}
public void setFlight(String flight) {
	this.flight = flight;
}
public Airplane getPlane() {
	return plane;
}
public void setPlane(Airplane plane) {
	this.plane = plane;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
public DayOfWeek[] getDate() {
	return date;
}
public void setDate(DayOfWeek...date) {
	this.date = date;
}
@Override
public String toString() {
	String allDate = "";
	for(int i = 0; i < date.length; i++) {
		allDate += date[i] +"; ";
	}
	return "Airline to: " + destination + ", flight: " + flight + ", plane:" + plane + "  " + time
			+ "  " + allDate;
}

}
