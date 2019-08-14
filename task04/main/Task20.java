package by.htp.task04.main;

/* 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр
 *  и т.д. Сколько таких действий надо произвести, чтобы получился нуль? 
 *  Для решения задачи использовать декомпозицию.
 * 
 */
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 98532;
		int m = n;
		int i = 0;
		while (m > 0) {
			m -= Method.getSumOfDigits(m);
			i++;					
		}
		System.out.printf("Для числа %d количество вычитаний суммы его цифр составит %d",n,i);
	}

}
