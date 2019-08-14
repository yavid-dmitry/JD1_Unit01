package by.htp.task05.main;

/*
 * 13. Определить количество элементов последовательности натуральных чисел, кратных числу М 
 * и заключенных в промежутке от L до N.
 */
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int m = 5;
		int l = 10;

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		Method.print(a);
		System.out.println("кратны числу M = " + m);
		System.out.printf("в промежутке от L=%d до N=%d \n", l, n);
		int count = 0;
		for (int i = l; i < a.length; i++) {
			if(a[i] % m == 0) {
				count++;
				System.out.print(a[i] + " ");
			}
		}
		System.out.println("\nКоличество чисел кратных М = " + count);
	}

}
