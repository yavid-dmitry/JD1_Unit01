package by.htp.task06.main;

/*
 *4. Сортировка обменами. Дана последовательность чисел .Требуется переставить 
 * числа в порядке возрастания. Для этого сравниваются два соседних числа Если
 * ,то делается перестановка. Так продолжается до тех пор, пока все элементы не 
 * станут расположены в порядке возрастания. Составить алгоритм сортировки, 
 * подсчитывая при этом количества перестановок.
 */

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = n - i;
		}
		System.out.println("Исходный массив:");
		Method.print(a);
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					count++;
				}

			}
		}
		Method.print(a);
		System.out.printf("Массив из %d элементов отсортирован за %d перестановок", n, count);
	}

}
