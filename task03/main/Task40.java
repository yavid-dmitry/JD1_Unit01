package by.htp.task03.main;

/*
 * 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка 
 * на все свои цифры.
 */
public class Task40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12358;

		for (int a = 1; a < n; a++) {
			int digit;

			int razriad = 0;
			boolean isTargetDigit = true;
			// Находим разрядность этого числа
			for (int i = 1; i < 30; i++) {
				if (a / (int) Math.pow(10, i - 1) != 0) {
					razriad = i;
				} else {
					break;
				}
			}
			// Находим каждую цифру этого числа
			for (int i = 1; i <= razriad; i++) {

				digit = (a % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);
				// И проверяем является ли она делителем, если нет - снимаем флаг.
				// В этом месте пользуемся свойством оператора && не проверять второе условие, если 
				// первое ложно.
				// И если возможна ситуация деления на нуль - сначала проверим делитель на != 0 
				if ( ( digit != 0 && a % digit != 0) || (digit == 0) ) {
					isTargetDigit = false;
				}

			}
			// Если флаг по прежнему положителен - выводим число.
			if (isTargetDigit) {
				System.out.println(a);
			}
		}

	}

}
