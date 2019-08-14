package by.htp.task06.main;

import by.htp.task05.main.Method;

/*
 * 9. Алгоритм фон Неймана. Упорядочить массив n a ,a , ,a 1 2  по неубыванию
 *  с помощью алгоритма сортировки слияниями:
 *  1) каждая пара соседних элементов сливается в одну группу из двух элементов 
 *  (последняя группа может состоять из одного элемента);
 *  2) каждая пара соседних двухэлементных групп сливается в одну 
 *  четырехэлементную группу и т. д.При каждом слиянии новая укрупненная группа 
 *  упорядочивается.
 */
public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = n - i;
		}
		System.out.println("Исходный массив:");
		Method.print(a);
		int count = 0;
		for (int k = 2; k <= a.length; k *= 2) {
			for (int l = 0; l < a.length; l += k) {
				for (int i = l; i <= l + k && i < a.length - 1; i++) {
					for (int j = l; j <= l + k && j < a.length - 1; j++) {
						if (a[j] > a[j + 1]) {
							int temp = a[j];
							a[j] = a[j + 1];
							a[j + 1] = temp;
							count++;
						}
					}
				}
			}
		}
		Method.print(a);
		System.out.printf("Массив из %d элементов отсортирован за %d перестановок", n, count);
	}
}
