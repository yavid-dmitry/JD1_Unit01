package by.htp.task07.main;

/*
 * 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task32 {
	static int[][] m = Method.initRandomMatrix(5, 5, 10);
	static int line = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method.print(m);
		System.out.println("Отсортирована по возрастанию строка " + line);
		sortLine(line, true);
		Method.print(m);
		System.out.println("Отсортирована по убыванию строка " + line);
		sortLine(line, false);
		Method.print(m);
	}

	public static void sortLine(int line, boolean increase) {
		int[] t = m[line];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length - 1; j++) {
				if (increase ^ (t[j] < t[j + 1])) {
					int temp = t[j];
					t[j] = t[j + 1];
					t[j + 1] = temp;
				}
				;
			}
		}
	}

}
