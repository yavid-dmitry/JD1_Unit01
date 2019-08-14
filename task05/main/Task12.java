package by.htp.task05.main;

import java.util.Random;

/*
 * 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, 
 * порядковые номера которых являются простыми числами.
 */
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		double[] a = new double[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextDouble() * 100;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%.3f  ",a[i] );
		}
		System.out.println();
		
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (checkSimple(i) ) {
				sum += a[i];
			}
		}
		System.out.printf("Сумма элементов с простыми индексами равна %.3f", sum);
	}
	public static boolean checkSimple(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
