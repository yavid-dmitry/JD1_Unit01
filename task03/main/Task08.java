package by.htp.task03.main;
/*
 * 8. Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 12;
		double b = 16;
		double h = 0.5;

		double x;
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		x = a;
		while (x < b) {
			System.out.println("При значении х = " + x + " значение функции равно " + function(x));
			x += h;
		}

	}

	public static double function(double x) {
		double c = 5;
		if (x == 15) {
			return (x + c) * 2;
		} else {
			return (x - c) + 6;
		}

	}

}
