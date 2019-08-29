package by.htp.task07.main;

/*
 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
 * содержит максимальную сумму.
 */
public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] m = Method.initRandomMatrix(7, 7, 10);
	System.out.println("Изначальная матрица:");
	Method.print(m);
	int[] sum = new int[m[0].length];
	
	for(int i = 0 ; i < m.length; i++) {
		for(int j = 0; j < m[i].length; j++) {
			sum[j] += m[i][j];
		}
	}
	System.out.println("Суммы по столбцам:");
	int max = sum[0];
	for(int i = 0; i < sum.length; i++) {
		if(max < sum[i]) {
			max = sum[i];
		}
		System.out.print(sum[i] + "\t");
	}
	
	System.out.print("\nМаксимальная сумма: " + max);
	
	
	
	}

}
