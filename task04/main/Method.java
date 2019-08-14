package by.htp.task04.main;

import java.util.Random;

public class Method {
	// Метод для нахождения наибольшего общего делителя массива натуральных чисел
	public static int getNod(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		int nod = 1;
		for (int i = 1; i < max; i++) {
			boolean delitel = true;
			for (int j = 0; j < a.length; j++) {
				if (a[j] % i != 0) {
					delitel = false;
				}
			}
			if (delitel) {
				nod = i;
			}
		}
		return nod;
	}

	// Метод для нахождения наименьшего общего кратного массива натуральных чисел
	public static int getNok(int[] a) {
		int[] temp = { a[0], a[1] };
		int nok = a[0] * a[1] / Method.getNod(temp);
		for (int i = 2; i < a.length; i++) {
			temp = new int[] { nok, a[i] };
			nok = nok * a[i] / Method.getNod(temp);
		}
		return nok;
	}

	/*
	 * Инициализируем массив случайными натуральными числами. length - длина
	 * массива, max - верхняя граница случайных чисел элементов массива
	 */
	public static int[] initArray(int length, int max) {
		int[] a = new int[length];
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			a[i] = rand.nextInt(max + 1);
		}
		return a;
	}

	// Вывод на консоль элементов массива
	public static void print(int[] a) {
		System.out.print("Массив чисел: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	// Расчет площади треугольника по трем его сторонам
	public static double getAreaThreeangle(double a, double b, double c) {
		double perimetr = a + b + c;
		double hp = perimetr / 2;
		double area = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
		return area;
	}

	// Высчитывает количество цифр в натуральном числе
	public static int getRazriad(int a) {
		int razriad = 0;
		for (int i = 1; i < 30; i++) {
			if (a / (int) Math.pow(10, i - 1) != 0) {
				razriad = i;
			} else {
				break;
			}
		}
		return razriad;
	}

	/*
	 * Создает массив цифр состовляющих натурального числа. 0-ой элемент - старшая цифра 
	 * последний - младшая цифра
	 */
	public static int[] getDigits(int a) {

		int razriad = getRazriad(a);
		int[] digit = new int[razriad];

		for (int i = 0; i < getRazriad(a); i++) {
			digit[i] = (a % ((int) Math.pow(10, razriad - i))) / (int) Math.pow(10, razriad - i - 1);

		}

		return digit;
	}
	
	//Возвращает сумму цифр натурального числа a
	public static int getSumOfDigits(int a) {
		int[] digits = getDigits(a);
		int sum = 0;
		for(int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}
		return sum;
	}

}