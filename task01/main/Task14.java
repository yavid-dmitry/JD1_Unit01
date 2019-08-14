package by.htp.task01.main;
/*

14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

*/

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r = 4.0;
		
		double length = 2 * r * Math.PI;
		
		double area = r * r * Math.PI;
		
		System.out.println("Площадь = " + area);
		System.out.println("Длина окружности = " + length);

	}

}
