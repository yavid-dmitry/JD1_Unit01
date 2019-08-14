package by.htp.task03.main;
/*
 * 11. Составить программу нахождения разности кубов первых двухсот чисел
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 1;
		for (int i = 2; i <= 200; i++) {
			result -= (long) i*i*i;
		}
		System.out.println(result);
	}

}
