package by.htp.task07.main;
/*
 * 19.  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] m = new int[n][n];
		
	for(int i = 0; i < m.length; i++) {
		for(int j = 0; j < m[i].length; j++) {
			if( (i <= j  && i <= n - j - 1 && i <= n / 2) || 
					((n - i - 1 <= j  && i >= j && i >= n / 2))) {
				m[i][j] = 1;
			} else {
				m[i][j] = 0;
			}
		}
	}
	Method.print(m);
	
	
	
	}
}
