package by.htp.task05.main;

/*
 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси,
 *  содержащую все эти числа.
 */

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = Method.initArray(10, 100);
		Method.print(a);
		
		int result = a[Method.getIndexMaxElement(a)] - a[Method.getIndexMinElement(a)];
		
		System.out.println("Длина числовой оси содержащей все элементы массива " + result);


	}

}
