package by.htp.task06.main;

import java.util.Random;

/*
 * 2. Даны две последовательности. Образовать из них новую последовательность чисел
 * так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = initNotDecreasedSequence(20);
		int[] b = initNotDecreasedSequence(10);
		//int[] a = { 1, 1, 1, 3, 6 }; 	//Упрощенный пример для проверки
		//int[] b = { 2, 2, 2, 4 };		//Упрощенный пример для проверки
		
		System.out.println("Даны две неубывающие последовательности:");
		Method.print(a);
		Method.print(b);
		
		int[] c = new int[a.length + b.length];
		int countA = 0;
		int countB = 0;
		boolean aEnd = false;
		boolean bEnd = false;
		for (int i = 0; i < c.length; i++) {
			if ( bEnd || ( a[countA] < b[countB] ^ aEnd) ) {
				c[i] = a[countA];
				countA++;
				if (countA == a.length) {
					countA--;
					aEnd = true;
				}
			} else {
				c[i] = b[countB];
				countB++;
				if (countB == b.length) {
					countB--;
					bEnd = true;
				}
			}
		}
		System.out.println("Результирующий массив с:");
		Method.print(c);

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