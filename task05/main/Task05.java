package by.htp.task05.main;

/*
 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = Method.initArray(10, 100);
		Method.print(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		if (count > 0) {
			int[] result = new int[count];
			int temp = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					result[temp] = a[i];
					temp++;
				}
			}
			Method.print(result);
		} else {
			System.out.println("Ни одного четного числа в исходном массиве.");
		}

	}

}
