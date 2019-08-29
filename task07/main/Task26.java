package by.htp.task07.main;

import java.io.*;

/*
 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. 
 * Выполнить с массивом следующие действия:
 * а) вычислить сумму отрицательных элементов в каждой строке;
 * б) определить максимальный элемент в каждой строке;
 * в) переставить местами максимальный и минимальный элементы матрицы.
 */
public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = enterMatrix();
		System.out.println("Исходный массив:");
		Method.print(m);
		System.out.println("Сумма отрицательных элементов" + getNegativeSum(m));
		for (int i = 0; i < m.length; i++) {
			System.out.printf("Максимальный элемент %d строки равен %d\n", i, max(m, i));
		}
		System.out.println("Матрица с переставленными максимальным и минимальным элементами");
		int[][] m2 = changeMaxMin(m);
		Method.print(m2);
	}

	private static int[][] changeMaxMin(int[][] m) {
		// TODO Auto-generated method stub
		int max = m[0][0];
		int lineMax = 0, columnMax = 0;
		int min = m[0][0];
		int lineMin = 0, columnMin = 0;
		int[][] m2 = new int[m.length][];
		for (int i = 0; i < m.length; i++) {
			m2[i] = new int[m[i].length];
			for (int j = 0; j < m[i].length; j++) {
				m2[i][j] = m[i][j];
				if (m2[i][j] < min) {
					lineMin = i;
					columnMin = j;
					min = m2[i][j];
				}
				if (m2[i][j] > max) {
					lineMax = i;
					columnMax = j;
					max = m2[i][j];
				}
			}
		}
		
		m2[lineMin][columnMin] = max;
		m2[lineMax][columnMax] = min;

		return m2;
	}

	private static int max(int[][] m, int i) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int j = 0; j < m[i].length; j++) {
			if(max < m[i][j]) {
				max = m[i][j];
			}
		}
		return max;
	}

	private static int getNegativeSum(int[][] m) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] < 0) {
					sum += m[i][j];
				}
			}
		}
		
		return sum;
	}

	public static int[][] enterMatrix() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите массив (числа через пробел, не более 20 строк, закончите введя end)");
		System.out.print(">");

		String[][] string = new String[20][];
		int[][] m;
		int count = 0;
		try {
			while (true) {
				String input;

				input = reader.readLine();

				if (input.matches("end") || count == 19) {
					break;
				}
				string[count] = input.split(" ");
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m = new int[count][];
		for (int i = 0; i < m.length; i++) {
			m[i] = new int[string[i].length];
			for (int j = 0; j < string[i].length; j++) {
				if ("".equals(string[i][j])) {
					string[i][j] = "0";
				}
				m[i][j] = Integer.parseInt(string[i][j]);

			}
		}
		return m;
	}
}
