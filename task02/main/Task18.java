package by.htp.task02.main;
/*
 * 18. Подсчитать количество отрицательных среди чисел а, b, с.
 */
public class Task18 {

	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = -3;
		double b = -2;
		double c = 4;
		
		countNegativeDigit(a);
		countNegativeDigit(b);
		countNegativeDigit(c);
		
		System.out.println(count);
	}
	
public static void countNegativeDigit(double a) {
	if (a < 0 ) {
		count++;
	}
}
}
