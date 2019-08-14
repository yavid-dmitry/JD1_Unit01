package by.htp.task03.main;
/*
 * 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
 */
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.0;
		double result = a;
		double ai = a;
		System.out.println(ai);
		int n = 4;
		for (int i = 2; i < n; i++) {
			ai += 1;
			result *= ai;
			System.out.println(ai);
		}
		System.out.println(result);
	}

}