package by.htp.task03.main;
/*
 * 23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции:
 * Примем значение x в формуле  в радианах
 */
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0;
		double b = 15.0;
		double h = 0.25;
		double x = Math.min(a, b);
		while (x <= Math.max(a, b)) {
			
			System.out.println(x + "\t\t" + function(x));
			x += h;
		}
		
	}
public static double function(double x) {
	return 1 / Math.tan(x / 3)+ (1 / 2) * Math.sin(x);
}
}
