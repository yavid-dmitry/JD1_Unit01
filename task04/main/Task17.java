package by.htp.task04.main;
/*
 * 17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма 
 * его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга 
 * от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 10000;
		for (int i = 1; i <= k ; i++) {
			int temp = Method.getSumOfDigits(i);
			int razriad = Method.getRazriad(i);
			if((int)Math.pow(temp, razriad) == i) {
				System.out.println(i);
			}
		}
	}

}
