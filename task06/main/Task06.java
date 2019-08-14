package by.htp.task06.main;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его 
 * по возрастанию. Делается это следующим образом: сравниваются два соседних элемента
 * i i+1 a и a . Если +1  i i a a , то продвигаются на один элемент вперед. 
 * Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад. 
 * Составить алгоритм этой сортировки.
 */

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int count = 0;
		double[] a = new double[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = n - i;
		}
		System.out.println("Исходный массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < a.length - 1;) {
			if(a[i] > a[i+1]) {
				double temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				count++;
				if(i > 0){
					i --;					
				}
			} else {
				i++;
			}
		}
		System.out.println("Отсортированный массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}		
		System.out.println();
		System.out.printf("Массив из %d элементов отсортирован за %d перестановок", n, count);
	}

}
