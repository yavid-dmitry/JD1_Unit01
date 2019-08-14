package by.htp.task05.main;
/*
 * 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int i = 60;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		System.out.println("i = " + i);

		for(int j = 0; j < n; j++) {
			if(a[j] > i) {
				System.out.print(a[j] + " ");
			}	
		}
	}

}
