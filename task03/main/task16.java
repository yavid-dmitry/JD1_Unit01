package by.htp.task03.main;
/*
 * 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
17.
 */
public class task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 1;
		long ai = 1;
		for (int i = 2; i <= 10; i++) {
			ai += i;
			result *= ai;
			System.out.println(ai);
		}
		System.out.println(result);
	}

}
