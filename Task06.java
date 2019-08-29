package by.htp.task07.main;

/*
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, 
 * у которых первый элемент больше последнего.
 */

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(5, 10, 9);
		System.out.println("Полная матрица:");
		Method.print(m);
		System.out.println("Столбцы");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[0][j] > m[m.length - 1][j] && j % 2 != 0) {
					System.out.print(m[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
