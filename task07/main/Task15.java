package by.htp.task07.main;
/*
 * 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] m = new int[n][n];
		
	for(int i = 0; i < m.length; i++) {
		for(int j = 0; j < m[i].length; j++) {
			if(i == j) {
				m[i][j] = n - i ;
			} else {
				m[i][j] = 0;
			}
		}
	}
	Method.print(m);
	
	
	
	}
}
