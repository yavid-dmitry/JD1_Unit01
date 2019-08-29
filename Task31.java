package by.htp.task07.main;

/*
 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней.
 */
public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[50][20];
		int temp = 0;
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(temp + "\t");
				if(temp > 9 && temp < 100) {
					count++;
				}
				temp++;	
			}
			System.out.println();
		}
		System.out.println("Количество двузначных чисел " + count);
	}

}
