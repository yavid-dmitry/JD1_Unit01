package by.htp.task04.main;

/* 
 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 * См. задачу 13 из линейных.
 */

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = 1.0, y1 = 3.0;
		double x2 = 4.0, y2 = 3.0;
		double x3 = 3.0, y3 = 6.0;
		
		double a = Math.hypot(x2 - x1, y2 - y1);
		double b = Math.hypot(x2 - x3, y2 - y3);
		double c = Math.hypot(x3 - x1, y3 - y1);
		
		System.out.println("Площадь = " + Method.getAreaThreeangle(a, b, c));

		
	}

	
}
