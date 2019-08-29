package by.htp.task07.main;

import java.util.Random;

/*
 * 37. Переставить строки матрицы случайным образом.
 */
public class Task37 {
	
	static int[][] m = Method.initRandomMatrix(5, 5, 20);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Изначальная матрица:");
		Method.print(m);
		Random rand = new Random();
		int a;
		int b;
		int[] temp;
		for(int i = 0; i < m.length ; i++) {
			a = rand.nextInt(m.length);
			b = rand.nextInt(m.length);
			temp = m[a];
			m[a] = m[b];
			m[b] = temp;
						
		}
		System.out.println("Полученная матрица:");
		Method.print(m);
		
		
	}
}
