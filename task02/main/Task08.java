package by.htp.task02.main;
/*
 * Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 5;
		if (a * a < b * b) {
		System.out.println("меньше число квадрат a");
		} else if (b * b < a * a) {
		System.out.println("меньше число квадрат b");
		} else if (a * a == b * b) {
		System.out.println("квадраты чисел равны");
		} else {
			System.out.println("Houston, we've had a problem");
		}
	}

}
