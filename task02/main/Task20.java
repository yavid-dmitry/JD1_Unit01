package by.htp.task02.main;
/*
 * 20. Определить, делителем каких чисел а, b, с является число k.
 */
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 58;
		int b = 43;
		int c = -78;
		int k = 2;
		showDivider(a, k);
		showDivider(b, k);
		showDivider(c, k);
		

	}
public static void showDivider(int a, int k) {
	if ( a % k == 0 ) {
		System.out.println(k + " является делителем числа " + a);
	}
}
}
