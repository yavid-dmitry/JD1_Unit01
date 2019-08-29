package by.htp.task07.main;

/*
 * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[][] m = new int[n][n];

		System.out.println("Вариант отображения согласно заданию:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i % 2 == 0) {
					m[i][j] = j + 1;
				} else {
					m[i][j] = m[i].length - j;
				}
			}
		}

		Method.print(m);
	}
}
