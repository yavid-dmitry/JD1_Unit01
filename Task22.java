package by.htp.task07.main;
/*
 * 22.  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] m = new int[n][n];
		
	for(int i = 0; i < m.length; i++) {
		for(int j = 0; j < m[i].length; j++) {
			if(n - i - 1 >= j) {
				m[i][j] = j + i + 1;
			} else {
				m[i][j] = 0;
			}
		}
	}
	Method.print(m);
	
	
	
	}
}
