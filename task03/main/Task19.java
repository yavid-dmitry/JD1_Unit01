package by.htp.task03.main;

/*
 * 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
 * равен заданному е. Общий член ряда имеет вид:
 */
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 0.00000000000001;
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
		return 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
	}
}
