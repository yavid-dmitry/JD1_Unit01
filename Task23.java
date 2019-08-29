package by.htp.task07.main;

/*
 * 23. Сформировать квадратную матрицу порядка N по правилу: и 
 * подсчитать количество положительных элементов в ней.
 * 
 */
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int sum = 0;
		double[][] m = new double[n][n];
		
	for(int i = 0; i < m.length; i++) {
		for(int j = 0; j < m[i].length; j++) {
			m[i][j] = Math.sin((double)(i * i + j * j) / n );
			if(m[i][j] > 0) {
				sum++;
			}
		}
	}
	Method.print(m);
	System.out.println("Количество положительных элементов " + sum);
	
	
	
	}
}
