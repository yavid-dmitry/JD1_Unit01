package by.htp.task03.main;

/*
 * 35. Найдите количество четных цифр данного натурального числа.
 */
public class Task35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 234596896;
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
		int evenDigit = 0;
		int digit;

	
		for (int i = razriad; i >= 1; i--) {
			digit = (a % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);
			if (digit % 2 == 0) {
				evenDigit++;
			}

		}

		System.out.println("Количество четных цифр " + evenDigit);

	}

}
