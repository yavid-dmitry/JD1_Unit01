package by.htp.task02.main;

/*
5. Составить программу: определения наименьшего из двух чисел а и b.
*/

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 5;
		if (a < b) {
		System.out.println("меньше число a");
		} else if (b < a) {
		System.out.println("меньше число b");
		} else if (a == b) {
		System.out.println("числа равны");
		} else {
			System.out.println("Houston, we've had a problem");
		}
	}

}
