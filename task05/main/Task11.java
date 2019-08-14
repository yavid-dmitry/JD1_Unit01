package by.htp.task05.main;

/*
 * 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у 
 * которых остаток от деления на М равен L (0 < L < М-1).
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int i = 60;
		int m = 5;
		int l = 2;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		System.out.println("M = " + m);
		System.out.println("L = " + l);
		for (int j = 0; j < n; j++) {
			if (a[j] > i) {
				if (a[j] % m == l) {
					System.out.print(a[j] + " ");
				}
			}
		}
	}

}
