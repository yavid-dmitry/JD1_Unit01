package by.htp.task07.main;

/*
 * 25. Получить квадратную матрицу порядка n:
 */
public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		int[][] m = new int[n][n];

		int k = 1;
		for(int i = 0, j = 0; j < m[i].length; j++) {
			m[i][j] = k;
			k++;
			
			if(j == n - 1 && i < m.length - 1) {
				i++;
				j = -1;
			}
		}
		
		Method.print(m);
		
		
	}
}
