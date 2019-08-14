package by.htp.task02.main;

/* 1. Составить программу сравнения двух чисел 1 и 2. 
 * Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8..
 */

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		int result = 0;
		if (x < y) {
			result = 7;
		} else {
			result = 8;
		}
		System.out.println(result);
	}

}
