package by.htp.task07.main;

/*
 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
*/

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = Method.initRandomMatrix(5, 5, 9);
		System.out.println("Полная матрица:");
		Method.print(m);
		System.out.println("Четные строки:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
			if (i % 2 == 0) {
				i++;
			}
		}
	}

}
