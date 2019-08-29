package by.htp.task07.main;




/*
 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(5, 5, 20);
		int k = 3;
		int p = 2;
		Method.print(m);
		System.out.println("Строка №" + k);
		for(int j = 0; j < m[k].length; j++) {
			System.out.print(m[k][j] + "\t");
		}
		
		System.out.println("\nСтолбец №" + p);
		
		for(int i = 0; i < m[0].length; i++) {
			System.out.println(m[i][p]);
		}
		
	}

}
