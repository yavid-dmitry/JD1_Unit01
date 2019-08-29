package by.htp.task07.main;

import java.util.Random;

public class Method {
	public static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void print(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%.3f\t", m[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] initRandomMatrix(int x, int y, int maxNumber) {
		int m[][] = new int[x][y];
		Random rand = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = rand.nextInt(maxNumber + 1);
			}
		}
		return m;
	}

	public static int max(int[][] m) {
		int max = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				max = m[i][j] > max ? m[i][j] : max;
			}
		}
		return max;
	}
}
