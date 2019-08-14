package by.htp.task03.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 30. Написать программу, переводящую римские числа в арабские.
 */
public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Внимание! Данная программа не проверяет правильность формирования римских чисел!");
		System.out.print("Введите число римскими цифрами\n>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		try {
			String input = reader.readLine();
			// System.out.println(input);
			char[] ch = input.toCharArray();
			// Сначала перевели последнюю римскую цифру
			result = getNumber(ch[ch.length - 1]);
			// Затем циклом добавляем каждую следующую цифру от конца, если она больше или
			// равна
			// предыдущей. Иначе - отнимаем.
			for (int i = ch.length - 2; i >= 0; i--) {
				if (getNumber(ch[i]) < getNumber(ch[i + 1])) {
					result -= getNumber(ch[i]);
				} else {
					result += getNumber(ch[i]);
				}
			}
			System.out.println(result);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getNumber(char input) {
		switch (input) {
		case 'I':
			return 1;

		case 'V':
			return 5;

		case 'X':
			return 10;

		case 'L':
			return 50;

		case 'C':
			return 100;

		case 'D':
			return 500;

		case 'M':
			return 1000;
		default:
			System.out.println("!!!!!!!!");
			return -10000;
		}
	}
}