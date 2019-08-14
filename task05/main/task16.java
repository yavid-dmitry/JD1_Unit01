package by.htp.task05.main;

import java.util.Random;

/*
 * 16. Даны действительные числа n  . Найти (max   )
 */
public class task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Random rand = new Random();
		double[] a = new double[n * 2];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextDouble() * 100;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%.3f  ", a[i]);
		}
		System.out.println();

		double max = a[0] + a[2 * n - 1];

		for (int i = 0; i < n; i++) {
			if (max < a[i] + a[2 * n - i - 1]) {
				max = a[i] + a[2 * n - i - 1];
			}
		}
		System.out.println("Результат = " + max);
	}
}
