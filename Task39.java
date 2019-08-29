package by.htp.task07.main;
/*
 * 39. Найдите произведение двух матриц.
 */
public class Task39 {

	static int[][] a = Method.initRandomMatrix(8, 2, 5);
	static int[][] b = Method.initRandomMatrix(2, 6, 5);
	static int[][] m = new int[a.length][b[0].length];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Изначальная матрица №1");
		Method.print(a);
		System.out.println("Изначальная матрица №2");
		Method.print(b);
		int sum;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				sum = 0;
				for(int k = 0; k < a[0].length; k++) {
					sum += a[i][k] * b[k][j];
				}
				m[i][j] = sum; 
			}
		}
		System.out.println("Производная матрица");
		Method.print(m);
	}

}
