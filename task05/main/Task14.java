package by.htp.task05.main;
/*
 * 14. Дан одномерный массив A[N]. Найти:
			max(четные индексы) - min(нечетные индексы)
 */
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		int max = a[0];
		int min = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 0) {
				if(max < a[i]) {
					max = a[i];
				}
			} else {
				if(min > a[i]) {
					min = a[i];
				}
			}
		}
		System.out.println("Результат = " + (max - min));
	}

}
