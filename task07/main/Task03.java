package by.htp.task07.main;


/*3. Дана матрица. Вывести на экран первый и последний столбцы.
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = Method.initRandomMatrix(5, 5, 9);
		System.out.println("Полная матрица:");
		Method.print(m);
		System.out.println("Первый и последний столбцы:");
		for (int i = 0; i < m.length; i++) {

			System.out.print(m[i][0] + " ");
			System.out.print(m[i][m[i].length - 1] + " ");
			System.out.println();
		}
	}

}
