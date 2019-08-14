package by.htp.task01.main;
/*

25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
(предполагается, что а≠0 и что дискриминант уравнения неотрицателен).

*/
public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.0;
		double b = -3.0;
		double c = 1.0;
		
		double diskriminant = b * b - 4 * a * c;
		
		double solution1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
		double solution2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
		
		System.out.println("Корень N1 = " + solution1);
		System.out.println("Корень N2 = " + solution2);
	}

}
