package by.htp.task06.main;

import java.util.Random;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел. Требуется 
 * указать те места, на которые нужно вставлять элементы последовательности 
 * в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = initNotDecreasedSequence(20);
		int[] b = initNotDecreasedSequence(20);
		// int[] a = { 1, 1, 1, 3, 6 }; //Упрощенный пример для проверки
		// int[] b = { 2, 2, 2, 4 }; //Упрощенный пример для проверки

		System.out.println("Даны две неубывающие последовательности:");
		Method.print(a);
		Method.print(b);
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] <= a[j]) {
					System.out.printf("Элемент последовательности №%d = %d вставим на место %d \n", i, b[i], j);
					break;
				}
				if (b[i] >= a[19]) {
					System.out.printf("Элемент последовательности №%d = %d вставим на место %d \n", i, b[i], a.length - 1);
					break;
				}
			}
		}

	

	}

	public static int[] initNotDecreasedSequence(int n) {
		Random rand = new Random();
		int[] a = new int[n];
		a[0] = rand.nextInt(3);
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + rand.nextInt(3);
		}
		return a;
	}
}