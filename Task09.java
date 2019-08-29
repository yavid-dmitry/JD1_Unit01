package by.htp.task07.main;

/*
 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(5, 5, 20);

		Method.print(m);
		System.out.println();
		for(int i = 0; i < m.length; i++) {
			for(int j = 0 ; j < m[i].length; j++) {
				if(i == j) {
				System.out.print(m[i][j] + "\t");
				} else {
					System.out.print("-\t");
				}
			}
			System.out.println();
		}

		
	}

}