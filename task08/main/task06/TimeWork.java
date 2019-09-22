package by.htp.task08.main.task06;

/*
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности 
 * установки времени и изменения его отдельных полей (час, минута, секунда) с 
 * проверкой допустимости вводимых значений. В случае недопустимых значений полей 
 * поле устанавливается в значение 0. Создать методы изменения времени на заданное
 *  количество часов, минут и секунд.
 */
public class TimeWork {
	public static void setTime(Time time, int hours, int minutes, int seconds) {
		time.setHours(hours);
		time.setMinutes(minutes);
		time.setSeconds(seconds);

	}

	public static void changeTime(Time time, int hours, int minutes, int seconds) {
		if(seconds < 0) {
			while(seconds < 0) {
				minutes--;
				seconds += 60;
			}
		}
		int temp = (seconds + time.getSeconds()) / 60;
		time.setSeconds((seconds + time.getSeconds()) % 60);
		minutes += temp;
		if(minutes < 0) {
			while(minutes < 0) {
				hours--;
				minutes += 60;
			}
		}
		temp = (minutes + time.getMinutes()) / 60;
		time.setMinutes((minutes + time.getMinutes()) % 60);
		hours += temp;
		hours = hours + time.getHours();
		while(hours < 0 ) {
			hours += 24;
		}
		time.setHours(hours % 24);
	}

}
