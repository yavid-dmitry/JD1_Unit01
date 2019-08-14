package by.htp.task03.main;

import java.io.*;
import java.math.BigInteger;

/*
 * 25. Требуется определить факториал числа, которое ввел пользователь.
 */

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Введите число факториал которого будет вычислен \n(Если у вас есть совесть, то это число будет меньше 5000) \n>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			int input = Integer.parseInt(reader.readLine());
			// System.out.println(input);
			
			BigInteger result = BigInteger.valueOf(1);
			for (int i = 1; i <= input; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}

			System.out.println(result);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
