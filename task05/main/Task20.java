package by.htp.task05.main;
/*
 * 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 *	(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		/*	Составим таблицу индексов массивов старый > новый
		 * 0 > 0
		 * 1 - исчезнет
		 * 2 > 1
		 * 3 - исчезнет
		 * 4 > 2
		 * 5 - исчезнет
		 * 6 > 3
		 * 7 - исчезнет
		 * 8 > 4
		 * i - старый номер, j - новый номер
		 * если(i четное) {j = (i / 2);}
		 */
		
		//Ужмем массив
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 0) {
				a[i/2] = a[i];
			}
		}
		//Обнулим оставшиеся элементы
		for(int i = a.length / 2; i < a.length; i++) {
			a[i] = 0;
		}
		Method.print(a);
			
		
	}

}
