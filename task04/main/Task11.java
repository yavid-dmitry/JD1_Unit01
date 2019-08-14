package by.htp.task04.main;

/*
 * 11. Задан массив D. Определить следующие суммы: 
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы 
 * трех последовательно расположенных элементов массива с 
 * номерами от k до m.
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4;
		int m = 9;
		int[] a = Method.initArray(10, 100);
		Method.print(a);

		for (int i = k; i <= m - 3; i++) {
			System.out.println("Сумма трех элементов массива, начиная с индекса №" + i + " : " + summOfThree(a, i));
		}
	}

	public static int summOfThree(int[] a, int index) {
		int sum = 0;
		if (a.length - 3 > index) {
			sum = a[index] + a[index + 1] + a[index + 2];
		}
		return sum;
	}
}
