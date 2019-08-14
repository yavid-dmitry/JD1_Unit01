package by.htp.task03.main;

/* 
 * 7. Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double b = 14;
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
		if (x > 2) {
			return x;
		} else {
			return -x;
		}

	}

}
