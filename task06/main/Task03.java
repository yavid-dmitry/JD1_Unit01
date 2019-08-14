package by.htp.task06.main;

import by.htp.task05.main.Method;

/*
 * 3. Сортировка выбором. Дана последовательность чисел .Требуется переставить
 *  элементы так, чтобы они были расположены по убыванию. Для этого в массиве, 
 *  начиная с первого, выбирается наибольший элемент и ставится на первое место, 
 *  а первый - на место наибольшего. Затем, начиная со второго, эта процедура 
 *  повторяется. Написать алгоритм сортировки выбором.
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = Method.initArray(20, 100);
		System.out.println("Исходный массив:");
		Method.print(a);
		// 1. Проверяем весь массив начиная с i-го элемента в поисках максимального
		for (int i = 0; i < a.length - 1; i++) {
			// меняем местами i-ый с максимальным.
			int max = a[i];
			int indexMax = i;
			for(int j = i; j < a.length; j++) {
				if(a[j] > max) {
					max = a[j];
					indexMax = j;
				}
			}
			int temp = a[indexMax];
			a[indexMax] = a[i];
			a[i] = temp;
		}
		System.out.println("Отсортированный массив:");
		Method.print(a);
	}

}