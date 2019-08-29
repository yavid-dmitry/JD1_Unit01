package by.htp.task07.main;


/*
 * 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task35 {
	static int[][] m = Method.initRandomMatrix(5 ,5 , 50);
	public static void main(String[] args) {
		int max = Method.max(m);
		System.out.println("Изначальная матрица:");
		Method.print(m);
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] % 2 != 0) {
					m[i][j] = max;
				}
			}
		}
		System.out.println("Получена матрица:");
		Method.print(m);

	
	}

}
