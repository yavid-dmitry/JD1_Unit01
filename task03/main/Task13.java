package by.htp.task03.main;



/*
 * Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
 */
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = -5.0;
		double step = 0.5;
		while (x <= 5) {
			System.out.println("f(" + x + ") = " + function(x));
			x += step;
		}
	}

	public static double function(double x) {

		return 5 - x * x / 2;
	}

}
