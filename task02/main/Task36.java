package by.htp.task02.main;
/*
 *  36. Вычислить значение функции:
 */
public class Task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1;
		double x2 = 13;
		System.out.println("При значении х = " + x1 + " значение функции равно " + function(x1) );
		System.out.println("При значении х = " + x2 + " значение функции равно " + function(x2) );
		
	}
	
	public static double function(double  x) {
		if (x <= 3) {
			return x * x - 3 * x + 9;
		} else {
			return 1 / (x * x * x + 6);
		}
	
	}

}
