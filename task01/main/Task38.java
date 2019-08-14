package by.htp.task01.main;

/*

38. Для данных областей составить линейную программу, которая печатает true, 
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
*/
public class Task38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 3.0;

		// Фигура а
		boolean resultA = false;
		resultA = ((y <= -x + 4) && (y <= x + 4)) && (y >= 0);
		System.out.println("Точка принадлежит области а: " + resultA);

		// Фигура b
		boolean resultB = false;
		if (y > 0) {
			resultB = (y <= 4) && (x >= -2 && x <= 2);
		} else {
			resultB = (y <= -3) && (x >= -4 && x <= 4);
		}
		System.out.println("Точка принадлежит области b: " + resultB);

		// Фигура c
		boolean resultC = false;
		if (y > 0) {
			resultC = ( ( x * x  + y * y <=  4 * 4) && x >= 0);
			;
		} else {
			resultC = ( ( x * x  + y * y <= 5 * 5) && x >= 0);
		}
		System.out.println("Точка принадлежит области c: " + resultC);
	
	}

}
