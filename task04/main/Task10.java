package by.htp.task04.main;

import java.math.BigInteger;

/*
 * 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				result = result.multiply(getFactorial(i));
			}
		}
		System.out.println(result);
	}

	public static BigInteger getFactorial(int a) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= a; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
