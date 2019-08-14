package by.htp.task02.main;

/*
 * 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, 
 * то найти max(d — a, d — b, d —c).
 */
public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3;
		double b = 3.8;
		double c = 3.2;
		double d = 4.8;
		if (Math.abs(d - a) < 0.00000001) {
			System.out.println("Числу d равно число a " + a);
		} else if (Math.abs(d - b) < 0.00000001) {
			System.out.println("Числу d равно число b " + b);
		} else if (Math.abs(d - c) < 0.00000001) {
			System.out.println("Числу d равно число c " + c);
		} else {
			System.out.println(Math.max(d - a, Math.max(d - b, d - c)));

		}
	}

}
