package by.htp.task05.main;

/*
 * 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 6, 14, 6, 1, 14, 1, 14, 1 };

		Method.print(a);
		// Создадим массив частоты встречи элементов. Первое значение число, второе его
		// частота
		int[][] fr = new int[a.length][2];
		int indexNewElement = 0;
		// Переберем весь исходный массив.
		for (int i = 0; i < a.length; i++) {
			// Каждое число проверяем,
			boolean oldElement = false;
			for (int j = 0; j < fr.length; j++) {
				// Если уже встречалось - определяем ячейку из массива частот и инкрементируем
				// встречаемость
				if (fr[j][0] == a[i]) {
					oldElement = true;
					fr[j][1]++;
					break;
				}
			}
			// если встречается впервые - заносим в новую ячейку массива частоты
			if (!oldElement) {
				fr[indexNewElement][0] = a[i];
				fr[indexNewElement][1] = 1;
				indexNewElement++;
			}
		}
		// Находим частоту самых часто встречающихся элементов. 
		int maxFrequence = fr[0][1];
		for (int i = 0; i < fr.length; i++) {
			if(fr[i][1] >= maxFrequence) {
				maxFrequence = fr[i][1];
			}
		}
		
		//Находим самый маленький из самых часто встречающихся элементов
		int minFrequentElement = Integer.MAX_VALUE;
		for (int i = 0; i < fr.length; i++) {
			//System.out.println(fr[i][0] + " " +fr[i][1]); //Проверочный вывод массива частот
			if(fr[i][1] == maxFrequence) {
				if(fr[i][0] < minFrequentElement) {
					minFrequentElement = fr[i][0];
				}
			}
		}
		System.out.println("Искомый элемент: " + minFrequentElement);
		
	}
}