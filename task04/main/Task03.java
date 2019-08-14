package by.htp.task04.main;

/*
 * 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * 
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 360, 36, 72, 7200 };
		Method.print(a);
		System.out.println("Наибольший общий делитель: " + Method.getNod(a));

	}

}