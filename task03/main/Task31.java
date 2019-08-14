package by.htp.task03.main;

import java.util.Random;
import java.io.*;

/*
 * 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя.
 */
public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] randomDigits = new int[5];
		initRandom(randomDigits);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] guessDigits = new int[5];

		System.out.println("Введите пять различных чисел:");
		try {

			for (int i = 0; i < 5; i++) {
				System.out.print(">");
				guessDigits[i] = Integer.parseInt(reader.readLine());
				for (int j = 0; j < i; j++) {
					if (guessDigits[i] == guessDigits[j]) {
						System.out.println("Вы повторяетесь, наберите другое число");
						i--;
						break;
					}
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Были загаданы числа:");
		print(randomDigits);
		System.out.println("Ваш вариант: ");
		print(guessDigits);
		
		
		System.out.print("Вы угадали цифры: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (randomDigits[i] == guessDigits[j]) {
					System.out.print(randomDigits[i] + " ");
				}
			}
		}
		System.out.println();
		
		System.out.print("Не угадали числа: ");
		for (int i = 0; i < 5; i++) {
			boolean key = false;
			for (int j = 0; j < 5; j++) {
				if (randomDigits[i] == guessDigits[j]) {
					key = true;
				}
			}
			if(!key) {
				System.out.print(randomDigits[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("Назвали ошибочно: ");
		for (int i = 0; i < 5; i++) {
			boolean key = false;
			for (int j = 0; j < 5; j++) {
				if (randomDigits[j] == guessDigits[i]) {
					key = true;
				}
			}
			if(!key) {
				System.out.print(guessDigits[i] + " ");
			}
		}
		System.out.println();

	}

	public static void initRandom(int[] randomDigits) {
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			randomDigits[i] = rand.nextInt(15) + 1;
			for (int j = 0; j < i; j++) {
				if (randomDigits[i] == randomDigits[j]) {
					i--;
					break;
				}
			}

		}
	}
	
	public static void print(int[] x) {
		for (int i = 0; i < x.length ; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
	}
}
