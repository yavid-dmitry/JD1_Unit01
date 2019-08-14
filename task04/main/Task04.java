package by.htp.task04.main;

/*
 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
*/

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 360, 36, 240 };
		Method.print(a);
		System.out.println("НОК для этих чисел " + Method.getNok(a));

	}

}