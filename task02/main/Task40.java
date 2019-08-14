package by.htp.task02.main;
/*
 * 40. Вычислить значение функции:
 */
public class Task40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1;
		double x2 = 14;
		System.out.println("При значении х = " + x1 + " значение функции равно " + function(x1) );
		System.out.println("При значении х = " + x2 + " значение функции равно " + function(x2) );
		
	}
	
	public static double function(double  x) {
		if (x <= 13) {
			return - x * x * x + 9;
		} else {
			return - 3 / (x + 1);
		}
	
	}

}
