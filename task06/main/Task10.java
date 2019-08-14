package by.htp.task06.main;
/*
 * 10. Сортировка подсчетом. Выходной массив заполняется значениями -1. 
 * Затем для каждого элемента определяется его место в выходном массиве 
 * путем подсчета количества элементов строго меньших данного. Естественно, 
 * что все одинаковые элементы попадают на одну позицию, за которой 
 * следует ряд значений -1. После этого оставшиеся в выходном массиве 
 * позиции со значением -1 заполняются копией предыдущего значения.
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = n - i;
			b[i] = -1;
		}
		System.out.println("Исходный массив:");
		Method.print(a);
		
		for(int i = 0; i < a.length; i++) {
			int sum = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] < a[i]) {
					sum++;
				}
			}
			b[sum] = a[i];
		}
		
		for(int i = 0; i < b.length; i++) {
			if(b[i] == -1) {
				b[i] = b[i-1];
			}
		}
		System.out.println("Отсортированный массив");
		Method.print(b);
		
	}

}
