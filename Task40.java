package by.htp.task07.main;

import java.util.Date;
import java.util.Random;

/*
 * 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, 
 * составленная из чисел 1, 2, 3, ..., 2n так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой.Построить такой квадрат. Пример магического квадрата порядка 3:
 */
public class Task40 {
//На домашнем мощном компьютере n = 7  считает менее чем за 10 секунд
// n = 8 считает где-то за 120 секунд
	
	public static int n = 7;
	// Найдем сумму по диагонали(она же по строке или столбцу)
	public static int sumDiag = n * (n * n + 1) / 2;

	public static void main(String[] args) {
		Date d1 = new Date();
		Random rand = new Random();
		// Определим массив последовательными числами
		int[][] square = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				square[i][j] = i * n + j + 1;
			}
		}

		int cell1[] = { 1, 2 };
		int cell2[] = { 1, 1 };
		int temp = 0;
		int countLine = 0;
		int sumTemp = 0;
		boolean nextTry = false;

		int countColumn = 0;
		int count = 0;
		do {
			nextTry = false;
			countLine = 0;
			countColumn = 0;
			while (countLine < n) {
				count++;
				// Выберем для замены ячейку 1 и 2
				cell1[0] = countLine;
				cell1[1] = rand.nextInt(n);
				if (countLine < n) {
					cell2[0] = countLine + rand.nextInt(n - countLine);
				} else {
					cell2[0] = countLine;
				}
				cell2[1] = rand.nextInt(n);

				// заменим ячейки 1 и 2
				temp = square[cell1[0]][cell1[1]];
				square[cell1[0]][cell1[1]] = square[cell2[0]][cell2[1]];
				square[cell2[0]][cell2[1]] = temp;

				// Проверим сумму count строки, если все ок - перепрыгиваем на следующую строку

				for (int i = 0; i < n; i++) {
					sumTemp += square[countLine][i];
				}
				if (sumTemp == sumDiag) {
					countLine++;
					// System.out.println(countLine);
				}
				sumTemp = 0;
				if (count > 1000) {
					// Этот счетчик если решения для этого варианта не существует
					count = 0;
					nextTry = true;
					break;

				}
			}
			if (nextTry) {
				continue;
			}
			// столбцы
			while (countColumn < n - 1) {
				// Выберем для замены ячейку 1 и 2
				count++;
				cell1[1] = countColumn;
				cell1[0] = rand.nextInt(n);
				cell2[1] = countColumn + rand.nextInt(n - countColumn);
				cell2[0] = cell1[0];

				// заменим ячейки 1 и 2
				temp = square[cell1[0]][cell1[1]];
				square[cell1[0]][cell1[1]] = square[cell2[0]][cell2[1]];
				square[cell2[0]][cell2[1]] = temp;

				// Проверим сумму count строки, если все ок - перепрыгиваем на следующую строку

				for (int i = 0; i < n; i++) {
					sumTemp += square[i][countColumn];
				}
				if (sumTemp == sumDiag) {
					countColumn++;
					// System.out.println(countColumn);
				}
				sumTemp = 0;
				if (count > 1000) {
					count = 0;
					nextTry = true;
					break;

				}
			}

			countColumn = 0;
			countLine = 0;
		} while (nextTry || !checkYourMajesty(square));

		print(square);
		Date d2 = new Date();
		System.out.println("Время вычисления " + (d2.getTime() - d1.getTime()) / 1000 + " cекунд");

	}

	public static boolean checkYourMajesty(int[][] square) {
		boolean check = true;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += square[i][i];
		}
		if (sum != sumDiag) {
			return false;
		} else {
			for (int i = 0; i < n; i++) {
				sum -= square[i][n - 1 - i];
			}
			if (sum != 0) {
				return false;
			}
		}

		return check;
	}

	public static void print(int[][] m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j] + "\t");

			}
			System.out.println();
		}
	}

}
