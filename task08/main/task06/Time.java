package by.htp.task08.main.task06;
/*
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности 
 * установки времени и изменения его отдельных полей (час, минута, секунда) с 
 * проверкой допустимости вводимых значений. В случае недопустимых значений полей 
 * поле устанавливается в значение 0. Создать методы изменения времени на заданное
 *  количество часов, минут и секунд.
 */
public class Time {
	private int hours;
	private int minutes;
	private int seconds;


public Time() {
	this.hours = 0;
	this.minutes = 0;
	this.seconds = 0;
}
public Time(int hours, int minutes, int seconds) {
	if(hours > 23 || minutes > 59 || seconds > 59) {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	} else {
	this.seconds = seconds;
	this.minutes = minutes;
	this.hours = hours;
	}
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	if (hours >= 0 && hours <= 23) {
	this.hours = hours;
	}else {
		this.hours = 0;
	}
}
public int getMinutes() {
	return minutes;
}
public void setMinutes(int minutes) {
	if (minutes >= 0 && minutes <= 59) {
	this.minutes = minutes;
	} else {
		this.minutes = 0;
	}
}
public int getSeconds() {
	return seconds;
}
public void setSeconds(int seconds) {
	if (seconds >= 0 && seconds <= 59) {
	this.seconds = seconds;
	} else {
		this.seconds = 0;
	}
}
@Override
public String toString() {
	return "Время: " + hours + "ч " + minutes + "м " + seconds + "с";
}

}
