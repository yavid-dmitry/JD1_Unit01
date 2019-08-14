package by.htp.task06.main;

import by.htp.task05.main.Method;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-ым и (k+1) - ым элементами первого,
 *  при этом не используя дополнительный массив. 
 */

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = Method.initArray(20, 100);
		int[] b = Method.initArray(5, 3);
		int k = 10;
		boolean error = false;
		if (b.length + k > a.length) {
			error = true;
		}
		System.out.println("Исходные массивы:");
		Method.print(a);
		Method.print(b);
		System.out.println("Вставляем второй массив в первый с индекса " + k);

		// Вариант решения с новым результирующим массивом
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (i < k) {
				c[i] = a[i];
			} else if (i >= k && i < k + b.length) {
				c[i] = b[i - k];
			} else {
				c[i] = a[i - b.length];
			}
		}
		System.out.println("Новый результирующий массив с:");
		Method.print(c);

		// Вариант через массив а. В массиве a обеспечим перестановку k+1 элемента на
		// позицию b.length + k + 1

		for (int i = 0; i < b.length; i++) {
			if (i + k + 1 + b.length > a.length) {
				break;
			} else {
				a[i + k + b.length] = a[i + k];
			}

		}

		// 2. Вставим в массив а на k+1 место массив b
		if (!error) {
			for (int i = 0; i < b.length; i++) {
				a[i + k] = b[i];
			}
			System.out.println("Результат вставки в исходный массив а:");
			Method.print(a);

		} else {
			System.out.println("Исходные условия некорректны - выход за границы массива");

		}

	}
}
