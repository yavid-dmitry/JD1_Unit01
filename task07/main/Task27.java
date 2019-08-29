package by.htp.task07.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все 
 * элементы одного столбца поставить на соответствующие им позиции другого, 
 * а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int column1 = 0;
		int column2 = 1;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Введите номер первого столбца: \n>");
			column1 = Integer.parseInt(reader.readLine());
			System.out.print("Введите номер второго столбца: \n>");
			column2 = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int[][] m = Method.initRandomMatrix(5, 5, 10);
		System.out.println("Изначальная матрица");
		Method.print(m);
		int temp;
		for(int i = 0; i < m.length; i++) {
			temp = m[i][column1];
			m[i][column1] = m[i][column2];
			m[i][column2] = temp;
		}
		System.out.println("Требуемая матрица");
		Method.print(m);
	
	}
}
