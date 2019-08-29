package by.htp.task07.main;
/*
 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
массива.
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = Method.initRandomMatrix(5, 10, 20);

		Method.print(m);
		System.out.println("Сумма:");
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0 ; j < m[i].length; j++) {
				if(m[i][j] == 7) {
				sum++;
				}
			}
		}
		System.out.println(sum);
		
	}

}