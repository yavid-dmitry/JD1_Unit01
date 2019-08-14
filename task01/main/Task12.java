package by.htp.task01.main;
/*

12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

*/

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1.0 , y1 = 2.0;
		double x2 = 3.0 , y2 = 4.0;
		
		double distance = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
		
		System.out.println(distance);
	}

}
