package by.htp.task02.main;
/*
 * 13. Даны две точки А(х1, у1) и В(х2, у2). 
 * Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
 */
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1.0;
		double y1 = 2.0;
		double x2 = 2.001;
		double y2 = 0.99;
		
		if (Math.hypot(x1, y1) < Math.hypot(x2, y2)) {
			System.out.println("Первая точка ближе");
		} else if (Math.hypot(x1, y1) > Math.hypot(x2, y2)) {
			System.out.println("Вторая точка ближе");
		} else {
			System.out.println("Точки одинаково близки к началу координат");
		}
	}

}
