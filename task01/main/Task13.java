package by.htp.task01.main;
/*

13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

*/

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = 1.0, y1 = 3.0;
		double x2 = 4.0, y2 = 3.0;
		double x3 = 3.0, y3 = 6.0;
		
		double a = getDistance(x1, y1, x2, y2);
		double b = getDistance(x2, y2, x3, y3);
		double c = getDistance(x1, y1, x3, y3);
		
		double perimetr = a + b + c;
		
		double hp = perimetr / 2;
		double area = Math.sqrt( hp * (hp - a) * (hp - b) * (hp - c) );
		
		System.out.println("Площадь = " + area);
		System.out.println("Периметр = " + perimetr);
		
	}

	public static double getDistance (double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
		return distance;
	}
}
