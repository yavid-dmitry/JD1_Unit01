package by.htp.task05.main;

import java.util.Random;

import by.htp.task04.main.Method;

/*
 * 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
 *	игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
 *	передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
 *	которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */
public class Task18 {
	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Выбрали случайные начальные условия
		int[] aStart = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int n[][] = getLockedNumber();
		aStart[n[0][0]] = n[0][1];
		aStart[n[1][0]] = n[1][1];
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
		int[] a = getKey(aStart, k);
		if (a[0] != 0) {
			System.out.println("Решение");
			Method.print(a);
		} else {
			System.out.println("Для выбранных положений кубиков нет решения");
		}

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

										if (checkSolution(a)) {
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
		int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		return b;
	}

	public static boolean checkSolution(int[] a) {
		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] + a[i + 1] + a[i + 2] != 10) {
				return false;
			}
		}
		return true;
	}

	public static int[][] getLockedNumber() {
		int[][] n = new int[2][2];
		// Первый столбец - индекс заблокированного замка, второй столбец - значение
		// этого замка.
		n[0][0] = rand.nextInt(10);
		do {
			n[1][0] = rand.nextInt(10);
		} while (n[0][0] == n[1][0]);
		n[0][1] = rand.nextInt(6) + 1;
		n[1][1] = rand.nextInt(6) + 1;
		return n;
	}
}
