package by.htp.task05.main;

import java.util.Random;

/*
 * 15. Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать те ее элементы, 
 * которые принадлежат отрезку [с, d].
 */
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		double[] a = new double[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextDouble() * 100;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%.3f  ", a[i]);
		}
		System.out.println();

		double c = 15.0;
		double d = 30.0;
		System.out.printf("Отрезок от %.1f до %.1f \n", c, d);
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= c && a[i] <= d) {
				System.out.printf("%.3f   ",a[i]);
			}
		}

	}
}
