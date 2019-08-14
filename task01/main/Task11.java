package by.htp.task01.main;
/*

11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

*/

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 4.0;
		double b = 3.0;
		
		double area = a * b * 0.5;
		double perimetr = a + b + Math.sqrt(a * a + b * b);
		
		System.out.println("Площадь = " + area);
		System.out.println("Периметр = " + perimetr);
	}

}
