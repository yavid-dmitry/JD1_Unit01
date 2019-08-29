package by.htp.task07.main;

/*
 * 4. Дана матрица. Вывести на экран первую и последнюю строки.
 */

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = Method.initRandomMatrix(5, 5, 9);
		System.out.println("Полная матрица:");
		Method.print(m);
		System.out.println("Первая и последняя строки:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
			i += m.length - 2;
		}
	}

}