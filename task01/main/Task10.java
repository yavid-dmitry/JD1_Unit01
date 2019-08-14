package by.htp.task01.main;
/*

10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

*/

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10.0;
		double y = 20.0;
		
		double result = ( (Math.sin(x) + Math.cos(y) ) / (Math.cos(y) - Math.sin(x) ) ) * Math.tan(x * y);

		System.out.println(result);
	}

}
