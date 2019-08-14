package by.htp.task05.main;

import by.htp.task04.main.Method;

/*
 * 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
 *	игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
 *	передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
 *	которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */
public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Захардкодили начальные условия
		int[] aStart = { 0, 0, 1, 0, 0, 1, 0, 0, 0, 0 };
		System.out.println("Изначальные установленные ячейки");
		Method.print(aStart);
		// Создали массив из подбираемых индексов
		int[] k = new int[8];
		int count = 0;
		for (int i = 0; i < aStart.length; i++) {
			if (aStart[i] == 0) {
				k[count] = i;
				count++;
			}
		}
		System.out.println("Список подбираемых ячеек(пропущены заранее установленные индексы)");
		Method.print(k);
		System.out.println("Один из вариантов решения");
		Method.print(getKey(aStart, k));

	}

	public static int[] getKey(int[] a, int[] k) {

		for (int a0 = 1; a0 <= 6; a0++) {
			a[k[0]] = a0;
			for (int a1 = 1; a1 <= 6; a1++) {
				a[k[1]] = a1;
				for (int a2 = 1; a2 <= 6; a2++) {
					a[k[2]] = a2;
					for (int a3 = 1; a3 <= 6; a3++) {
						a[k[3]] = a3;
						for (int a4 = 1; a4 <= 6; a4++) {
							a[k[4]] = a4;
							for (int a5 = 1; a5 <= 6; a5++) {
								a[k[5]] = a5;
								for (int a6 = 1; a6 <= 6; a6++) {
									a[k[6]] = a6;
									for (int a7 = 1; a7 <= 6; a7++) {
										a[k[7]] = a7;
										for (int i = 1; i <= 7; i++) {
											if (summOfThree(a, i) == 10) {
												return a;
											}

										}
									}
								}
							}
						}
					}
				}
			}
		}
		int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		return b;
	}

	public static int summOfThree(int[] a, int index) {
		int sum = 0;
		if (a.length - 3 > index) {
			sum = a[index] + a[index + 1] + a[index + 2];
		}
		return sum;
	}
}