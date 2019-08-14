package by.htp.task02.main;
/*
 * 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
 */
public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3;
		double b = 3.8;
		double c = 3.2;
		double min = a;
		double max = a;
		if (Math.min(a, b) == Math.min(a, c)) {
			min = a;
		}
		if (Math.min(a, b) == Math.min(b, c)) {
			min = b;
		}
		if (Math.min(c, b) == Math.min(a, c)) {
			min = c;
		}
		
		if (Math.max(a, b) == Math.max(a, c)) {
			max = a;
		}
		if (Math.max(a, b) == Math.max(b, c)) {
			max = b;
		}
		if (Math.max(c, b) == Math.max(a, c)) {
			max = c;
		}
		
		System.out.println("Сумма наибольшего и наименьшего: " + (min + max));
	}

}
