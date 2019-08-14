package by.htp.task03.main;

/*
 * 33. Найдите наибольшую цифру данного натурального числа.
 */
public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 345269;
		System.out.println("Натуральное число " + a);
		int razriad = 0;

		for (int i = 1; i < 30; i++) {
			if (a / (int) Math.pow(10, i - 1) != 0) {
				razriad = i;
			} else {
				break;
			}
		}

		System.out.println("Число имеет разрядность: " + razriad);
		int maxDigit = 0;
		int digit;

	
		for (int i = razriad; i >= 1; i--) {
			digit = (a % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);
			if (digit > maxDigit) {
				maxDigit = digit;
			}

		}

		System.out.println("Максимальная цифра " + maxDigit);

	}

}
