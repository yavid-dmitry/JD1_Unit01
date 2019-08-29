package by.htp.task07.main;
/*
 * 29. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(6, 6, 20);
		
		//Сделаем матрицу в том числе и отрицательной
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				m[i][j] -= 10;
			}
		}
		Method.print(m);
		System.out.println("Положительные элементы главной диагонали:");
		for(int i = 0; i < m.length; i++) {
			if(m[i][i] > 0) {
				System.out.print(m[i][i] + "\t");
				
				
			}
		}
			
	}

}
