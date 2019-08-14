package by.htp.task05.main;

/*
 * 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается 
 * раньше - положительное или отрицательное.
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[] a = Method.initArray(n, 100);

		for (int i = 0; i < n; i++) {
			a[i] -= 50;
		}
		Method.print(a);
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				System.out.println("Раньше положительное число");
				break;
			} else if (a[i] < 0) {
				System.out.println("Раньше отрицательное число");
				break;
			}
		}

	}

}