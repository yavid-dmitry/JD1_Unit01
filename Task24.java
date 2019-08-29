package by.htp.task07.main;
/*
 * 24. Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить действительную 
 * квадратную матрицу порядка n:
 */
public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = new int[n];
		int[][] m = new int[n][n];
		for(int i = 0 ; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for(int i = 0, j = 0; j < m[i].length; j++) {
			m[i][j] = (int)Math.pow(a[j], i + 1);
			
			if(j == n - 1 && i < m.length - 1) {
				i++;
				j = -1;
			}
		}
		
		Method.print(m);
		
		
	}
}
