package by.htp.task07.main;

/*
 *11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: 
 *первая строка справа налево, вторая строка слева направо, третья строка 
 *справа налево и так далее.
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(5, 5, 20);
		Method.print(m);
		System.out.println("Вариант отображения согласно заданию:");
		for (int i = 0; i < m.length; i++) {
			if (i % 2 == 0) {
				for (int j = m[i].length - 1; j >= 0; j--) {
					System.out.print(m[i][j] + "\t");
				}
			} else {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}