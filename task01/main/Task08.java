package by.htp.task01.main;

/*

8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

*/

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 3.0;
		double b = 4.0;
		double c = 5.0;
		
		double result = (b + Math.sqrt(b * b + 4 * a * c) ) / (2 * a) - Math.pow(a, 3) * c + 1 / (b * b);
		
		System.out.println(result);
		
	}

}
