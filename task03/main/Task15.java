package by.htp.task03.main;
/*
 * 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
 */
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) Math.pow(2, 10);
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result += i * i;
		}
		System.out.println(result);
	}

}
