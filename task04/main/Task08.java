package by.htp.task04.main;

/*
 * 8. Составить программу, которая в массиве A[N] находит второе по величине число 
 * (вывести на печать число, которое меньше максимального элемента массива, +но больше всех других элементов).
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = Method.initArray(10, 1000);
		Method.print(a);
		System.out.println("Заместитель максимального числа -  " + getDeputyMax(a));
	}

	public static int getDeputyMax(int[] a) {
		int max = a[0];
		int deputyMax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max) {
				if (a[i] > deputyMax) {
					deputyMax = a[i];
				}
			}

		}
		return deputyMax;
	}
}
