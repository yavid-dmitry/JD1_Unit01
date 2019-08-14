package by.htp.task03.main;
/*
 * 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		double result = 0;
		for (int i = 1; i <= n; i++) {
			result += 1.0 / i;
		}
		System.out.println(result);
	}

}
