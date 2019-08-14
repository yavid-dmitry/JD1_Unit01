package by.htp.task05.main;

/*
 * 17. Дана последовательность целых чисел  . Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min( , , , ).
 */
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 8, 14, 6, 1, 68, 1, 23, 1 };
		int min = a[0];
		Method.print(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		int count1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				count1++;
			}
		}
	
		int b[] = new int[a.length - count1];
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				b[count2] = a[i];
				count2++;
			}
		}
		Method.print(b);
	}

}
