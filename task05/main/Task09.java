package by.htp.task05.main;
/*
 * 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		int min = Method.getIndexMinElement(a);
		int max = Method.getIndexMaxElement(a);
		
		int temp = a[max];
		a[max] = a[min];
		a[min] = temp;
		
		Method.print(a);
	}

}
