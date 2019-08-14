package by.htp.task02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом.
 */
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maxDayInMonth = 28;
		String monthString;
		boolean isDateCorrect = true;
		try {
			System.out.println("Введите день месяца");
			String dayString = reader.readLine();
			System.out.println("Введите номер месяца");
			monthString = reader.readLine();
			reader.close();

			int month = Integer.parseInt(monthString);
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				maxDayInMonth = 31;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				maxDayInMonth = 30;
				break;
			}
			case 2: {
				maxDayInMonth = 29;
				break;
			}
			default:{
				System.out.println("Номер месяца введен неверно!"); 
				isDateCorrect = false;
				}
			} 	

			int day = Integer.parseInt(dayString);
			if ((day < 1) || (day > maxDayInMonth)) {
				System.out.println("День месяца введен неверно!");
				isDateCorrect = false;
			} 
			if (isDateCorrect) {
				System.out.println("Дата введена корректно");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
