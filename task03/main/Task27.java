package by.htp.task03.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
самого числа. m и n вводятся с клавиатуры.
 */
public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean simple = true;
		System.out.print("Введите числа m и n \n>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			int m = Integer.parseInt(reader.readLine());
			System.out.print(">");
			int n = Integer.parseInt(reader.readLine());
			

			for (int i = m; i <= n; i++) {
				System.out.print("Делители для числa " + i + " : ");
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						System.out.print(j + " ");
						simple = false;
					}
				}
				if (simple) {
					System.out.println("отсутствуют, т.к. число простое");
				} else {
					System.out.println();
					simple = true;
				}

			}
			reader.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
