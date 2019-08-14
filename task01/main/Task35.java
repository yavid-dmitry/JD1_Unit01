package by.htp.task01.main;

/*

35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

*/
public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 123456789;
		int n = 6789;
		double fraction = (double) m / n;
		System.out.println(fraction);
		System.out.println( "Старшая цифра дробной части = " + (int) (fraction * 10)  % 10);
		System.out.println( "Младшая цифра целой части = " + (int) fraction % 10);
		
		
	}
}
