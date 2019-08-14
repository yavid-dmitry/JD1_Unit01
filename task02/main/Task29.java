package by.htp.task02.main;
/*
 * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = 3;
		double y1 = 4;
		double x2 = -3.8;
		double y2 = -3.8;
		double x3 = 4;
		double y3 = 4;
		
		double a = Math.hypot(x2 - x1, y2 - y1);
		double b = Math.hypot(x3 - x1, y3 - y1);
		double c = Math.hypot(x3 - x2, y3 - y2);
		
		if ( Math.abs(a + b - c) < 0.000001 || Math.abs(a + c - b) < 0.000001 || Math.abs(c + b - a) < 0.000001) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки не расположены на одной прямой");
		}
			
	}

}
