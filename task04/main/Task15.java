package by.htp.task04.main;

import java.util.Random;

/*
 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int k = 10;
		int n = 1000;

		for (int i = 0; i < a.length; i++) {
			a[i] = getNumber(k, n);
		}
		Method.print(a);
	}

	public static int getNumber(int k, int n) {
		Random rand = new Random();
		int number = 0;
		int count = 0;
		while (true) {
			number = rand.nextInt(n) + 1;
			if (Method.getSumOfDigits(number) == k) {
				return number;
			}
			count++;
			if (count > 10000) {
				System.out.println("Условия недостожимы");
				number = 0;
				return number;
			}

		}
	}
}
