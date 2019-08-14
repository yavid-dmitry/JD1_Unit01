package by.htp.task05.main;

/* 
 * 
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 *  
 */

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int k = 6;
		int[] a = Method.initArray(n, 100);
		int sum = 0;
		Method.print(a);
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] % k == 0) {
				sum += a[i];
			}
		}
		System.out.printf("Сумма цифру кратных %d равна %d",k,sum);
	}

}
