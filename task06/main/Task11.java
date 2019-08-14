package by.htp.task06.main;

/*
 * 11. «Хитрая» сортировка. Из массива путем однократного просмотра
 *  выбирается последовательность элементов, расположенных в порядке 
 *  возрастания, переносится в выходной массив и заменяется во 
 *  входном на -1. Затем оставшиеся элементы включаются в полученную 
 *  упорядоченную последовательность методом «погружения», когда 
 *  очередной элемент путем ряда обменов «погружается» до требуемой 
 *  позиции в уже упорядоченную часть массива.
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 1, 5, 9, 8, 4, 5, 6, 7, 8, 1, 5, 9, 3, 8, 7, 9, 5 };
		int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int startIndex = 0;
		int lengthSeq = 1;

		int tempStartIndex = 0;
		int tempLengthSeq = 1;
		// Просматриваем массив на поиск максимальной возрастающей последовательности
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] <= a[i]) {
				tempLengthSeq++;
			} else {
				tempStartIndex = i;
				tempLengthSeq = 1;
			}
			if (tempLengthSeq > lengthSeq) {
				lengthSeq = tempLengthSeq;
				startIndex = tempStartIndex;
			}
		}
		// Вставляем эту последовательность в выходной массив и затираем ее во входном

		for (int j = 0, i = startIndex; i < startIndex + lengthSeq;) {
			b[j] = a[i];
			a[i] = -1;
			i++;
			j++;
		}
		System.out.println("Изначальный массив без извлеченной последовательности");
		Method.print(a);
		System.out.println("Массив с извлеченной последовадельностью");
		Method.print(b);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				for (int j = b.length - 2; j >= 0; j--) {
					if (b[j] > a[i] || b[j] <= 0) {
						b[j + 1] = b[j];
						if (j == 0) {
							b[j] = a[i];
							break;
						}
					} else {
						b[j + 1] = a[i];
						break;
					}

				}

			}
		}
		System.out.println("Отсортированный массив");
		Method.print(b);
	}

}
