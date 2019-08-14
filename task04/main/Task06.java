package by.htp.task04.main;

/*
 * 6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
*/

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 4.0;
		
		
		
		System.out.printf("Площадь правильного шестиугольника = %.3f" , Method.getAreaThreeangle(a, a , a) * 6);
		
	
	}

}
