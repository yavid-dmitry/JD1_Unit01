package by.htp.task07.main;

/*
 * 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task33 {

		static int[][] m = Method.initRandomMatrix(5, 5, 10);
		static int column = 3;	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Method.print(m);
			System.out.println("Отсортирован по возрастанию столбец " + column);
			sortColumn(column, true);
			Method.print(m);
			System.out.println("Отсортирован по убыванию столбец " + column);
			sortColumn(column, false);
			Method.print(m);
		}
		public static void sortColumn(int column, boolean increase) {
	
			
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j <m.length - 1; j++) {
					if(increase ^ (m[j][column] < m[j + 1][column]) ) {
						int temp =m[j][column];
						m[j][column] = m[j + 1][column];
						m[j + 1][column] = temp;
					};
				}
			}
		}

	}
