package by.htp.task03.main;

/*
 * 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
 * его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
 * числом.
 */
public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 34567;
		System.out.println("Натуральное число " + a);
		int razriad = 0;
		int aReverse = 0;

		for (int i = 1; i < 30; i++) {
			if (a / (int) Math.pow(10, i - 1) != 0) {
				razriad = i;
			} else {
				break;
			}
		}

		System.out.println("Число имеет разрядность: " + razriad);
		int sum = 0;
		int digit;

		// Суммируем четные цифры
		for (int i = razriad; i >= 1; i--) {
			digit = (a % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);
			if ((razriad - i + 1) % 2 == 0) {
				sum += digit;
				System.out.println((razriad - i + 1) + "-ая цифра = " + digit);
			}

			aReverse += digit * (int) Math.pow(10, razriad - i);
		}



		System.out.println("Сумма четных цифр " + sum);
		System.out.println("Новое число " + aReverse);
	}

}
