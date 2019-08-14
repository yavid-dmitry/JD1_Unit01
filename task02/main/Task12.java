package by.htp.task02.main;
/*
 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения 
 * которых неотрицательны, и в четвертую степень — отрицательные.
 */
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.2;
		double b = -3.2;
		double c = 4.0;
		System.out.println(myMethod(a));
		System.out.println(myMethod(b));
		System.out.println(myMethod(c));

	}
	public static double myMethod(double a) {
		if (a >= 0) {
			return a * a;
		} else {
			return Math.pow(a, 4);
		}
	}
}
