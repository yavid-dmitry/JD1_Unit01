package by.htp.task04.main;

/*
 * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12 , 14 , 17};
		Method.print(a);
		System.out.println("Cуммa большего и меньшего из трех чисел " + sumMinMax(a));
	}
	public static int sumMinMax(int[] a) {
		int max = a[0];
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min) { min = a[i]; }
			if(a[i] > max) { max = a[i]; }
		}
		return max + min;
	}
}
