package by.htp.task07.main;
/*
 *  36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой 
 *  получается как среднее арифметическое соседей соответствующего элемента исходной матрицы. 
 *  Построить результат сглаживания заданной матрицы
 */
public class Task36 {
	static int[][] m = Method.initRandomMatrix(10, 10, 20);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Изначальная матрица:");
		Method.print(m);
		double[][] mD = new double[m.length][m[0].length];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				mD[i][j] = getAverage(i, j);
			}
		}
		System.out.println("Сглаженная матрица:");
		Method.print(mD);
	}
	
	public static double getAverage(int line, int column) {
		double average = 0;
		int count = 0;
		//Левая ячейка
		if(column > 0) {
			average += m[line][column - 1];
			count++;
		}
		//Верхняя ячейка
		if(line > 0) {
			average += m[line - 1][column];
			count++;
		}				
		//Правая ячейка
		if(column < m[line].length - 1) {
			average += m[line][column + 1];
			count++;
		}			
		//Нижняя ячейка
		if(line < m.length - 1) {
			average += m[line + 1][column];
			count++;
		}			
		
		return (double) average / count;
	}

}
