package by.htp.task05.main;

/*
 * 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько 
 * в нем отрицательных, положительных и нулевых элементов.
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = Method.initArray(n, 100);
		
		for (int i = 0; i < n; i++) {
			a[i] -= 50;
		}
		Method.print(a);
		
		int countZero = 0;
		int countPos = 0;
		int countNeg = 0;
		
		for (int i = 0; i < n; i++) {
			if(a[i] < 0) {
				countNeg++;
			} else if(a[i] > 0) {
				countPos++;
			} else {
				countZero++;
			}
		}
		System.out.println("Количество положительных элементов " + 	countPos);
		System.out.println("Количество отрицательных элементов " +	countNeg);
		System.out.println("Количество нулевых элементов " 		 + 	countZero);
		
	}

}
