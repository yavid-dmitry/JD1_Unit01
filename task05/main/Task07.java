package by.htp.task05.main;
/*
 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие 
 * данного Z, этим числом. Подсчитать количество замен.
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int z = 60;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		System.out.println("z = " + z);
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] > z) {
				a[i] = z;
				count++;
			}	
		}
		
		Method.print(a);
		System.out.println("Количество замен равно " + count);
	}

}
