package by.htp.task07.main; 
/*
 * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(5, 10, 20);
		for(int i = 0; i < m.length; i++) {
			for(int j = 0 ; j < m[i].length; j++) {
				m[i][j] -= 10;
			}
		}
		Method.print(m);
		System.out.println("Сумма:");
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0 ; j < m[i].length; j++) {
				if(m[i][j] < 0) {
				sum += (int)Math.abs(m[i][j]);	
				}
			}
		}
		System.out.println(sum);
		
	}

}
