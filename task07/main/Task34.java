package by.htp.task07.main;

import java.util.Random;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

public class Task34 {
static Random rand = new Random();
static int[][] m = Method.initRandomMatrix(8, 9, 0);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = getValue(i,j);
			}
		}
		
		Method.print(m);
	}
	//Этот метод устанавливает значение ячейки
	
	public static int getValue(int line, int column) {
		if(getSum(line,column) == column) {
			return 0;
		}
		//Проверка, если уже имеющаяся сумма и оставшиеся ячейки равны столбцу
		if(getSum(line, column) + m.length - line == column) {
			return 1;
		}
		return rand.nextInt(2);
	}
	
	//Этот метод возвращает сумма в столбце выше указанной ячейки
	public static int getSum(int line, int column) {
		int sum = 0;
		for(int i = 0; i < line ; i++) {
			sum += m[i][column];
		}
		return sum;
	}
}
