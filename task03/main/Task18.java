package by.htp.task03.main;


/*
 * 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше 
 * или равен заданному е. Общий член ряда имеет вид:
 */

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 0.00001;
		double sum = 0;
		long start = System.currentTimeMillis();
		int count = 0;
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (Math.abs(row(i)) >= e) {
				sum += row(i);
				count = 0;
			} else {
				count++;
			}
			if (count > 100) {
				break;
			}
		}
		long finish = System.currentTimeMillis();
		System.out.println("Сумма = " + sum + " - ответ получен за " + (finish - start) + " ms");
	}

	public static double row(int n) {
		return Math.pow(-1, n - 1) / n;
	}
}
