package by.htp.task07.main;
/*
 * 17.  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] m = new int[n][n];
		
	for(int i = 0; i < m.length; i++) {
		for(int j = 0; j < m[i].length; j++) {
			if(i == 0 || j == 0 || i == n - 1 || j == n - 1) {
				m[i][j] = 1;
			} else {
				m[i][j] = 0;
			}
		}
	}
	Method.print(m);
	
	
	
	}
}
