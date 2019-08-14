package by.htp.task06.main;

/*
 * 5. Сортировка вставками. Дана последовательность чисел. Требуется
 * переставить числа в порядке возрастания. Делается это следующим 
 * образом. Пусть i a ,a , ,a 1 2  - упорядоченная последовательность,
 *  т. е. n a  a  a 1 2 . Берется следующее число 1+i a и вставляется 
 *  в последовательность так, чтобы новая последовательность была тоже 
 *  возрастающей. Процесс производится до тех пор, пока все элементы от 
 *  i +1 до n не будут перебраны. Примечание. Место помещения очередного 
 *  элемента в отсортированную часть производить спомощью двоичного поиска. 
 *  Двоичный поиск оформить в виде отдельной функции.
 */

public class Task05 {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = n - i;
		}
		System.out.println("Исходный массив:");
		Method.print(a);

		for (int i = 1; i < a.length; i++) {
			pasteNumber(a, i);
		}

		Method.print(a);
		System.out.printf("Массив из %d элементов отсортирован за %d перестановок", n, count);
	}

	public static void pasteNumber(int[] a, int index) {
		int begin = 0;
		int end = index;
		int i = index;
		

		// блок отвечающий за нахождение точки вставки
		while (true) {
			// Сначала рассмотрим, а вдруг граница рассматриваемого участка меньше элемента
			if (a[index] < a[begin]) {
				i = begin; // будем вставлять перед передней границей
				break;
			}
			//Если равна передней границе 
			if (a[index] == a[begin]) {
				i = begin + 1; // будем вставлять за передней границей
				break;
			}
			//Если равна или больше задней границе
			if (a[index] >= a[end]) {
				i = end + 1;
				break;// будем вставлять за задней границей
			}
			// Если границы соседние индексы или границы равны- вставляем между ними
			if (a[index] > a[begin] && a[index] < a[end] && ((end - begin) == 1 || a[end] == a[begin])) {
				i = end;
				break;
			}
			// если не прокатило все предыдущее - уменьшаем отрезок в два раза
			if (a[begin + (end - begin) / 2] < a[index]) {
				begin = begin + (end - begin) / 2;
			} else {
				end = begin + (end - begin) / 2;
			}
		}
		// Блок отвечающий за вставку значению в нужную точку
		int temp = a[index];
		for (int j = index - 1; j >= i; j--) {
			a[j + 1] = a[j];
			count++;
		}
		a[i] = temp;
		count++;

	}
}
