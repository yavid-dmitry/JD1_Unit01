package by.htp.task07.main;

/*
 * 38. Найдите сумму двух матриц
 */
public class Task38 {

	static int[][] m1 = Method.initRandomMatrix(5, 5, 20);
	static int[][] m2 = Method.initRandomMatrix(5, 5, 20);
	static int[][] m3 = new int[m1.length][m1[0].length];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Изначальная матрица №1");
		Method.print(m1);
		System.out.println("Изначальная матрица №2");
		Method.print(m2);
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		System.out.println("Суммарная матрица");
		Method.print(m3);
	}

}
