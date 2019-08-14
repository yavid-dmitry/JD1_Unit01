package by.htp.task05.main;

/*
 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.  
 */

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = Method.initArray(n, 100);
		
		for(int i = 0; i < n; i++) {
			if(a[i] > 60) {
				a[i] = 0;
			}
		}
		
		int length = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				length++;
			}
		}
		
		int[] arrayZeroIndex = new int[length];
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				arrayZeroIndex[count] = i;
				count++;
			}
		}
		Method.print(a);
		Method.print(arrayZeroIndex);
		
	}

}