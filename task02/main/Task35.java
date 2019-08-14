package by.htp.task02.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * 35. Вычислить число и месяц в невисокосном году по номеру дня.
 * 
 * Я понимаю, что все задачи надо было решать через конструкции if или switch.
 * Однако их я уже давно освоил, а вот с календарем редко работал, поэтому 
 * решил через него. Извините)))
 */
public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 365;
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(Calendar.DAY_OF_YEAR, a);
		SimpleDateFormat date = new SimpleDateFormat("d MMMM");
		System.out.println(date.format(calendar.getTime()));
		
		
	}

}
