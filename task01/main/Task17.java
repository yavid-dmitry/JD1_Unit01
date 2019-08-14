package by.htp.task01.main;
/*

17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

*/

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 123;
		double y = 456;
		
		double averageArithmeticCube = ( (x * x * x) + (y * y * y) ) / 2;
		double averageGeometric = Math.sqrt( Math.abs(x) * Math.abs(y) );
		
		System.out.println("Среднее арифметическое = " + averageArithmeticCube);
		System.out.println("Среднее геометрическое = " + averageGeometric);

	}

}
