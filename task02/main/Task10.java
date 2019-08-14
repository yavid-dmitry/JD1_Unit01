package by.htp.task02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 10. Составить программу, которая определит площадь какого круга меньше.
 */
public class Task10 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double r1;
		double r2;

		while (true) {
			try {
				System.out.println("Введите радиус первого круга");
				r1 = Double.parseDouble(reader.readLine());
				System.out.println("Введите радиус второго круга");
				r2 = Double.parseDouble(reader.readLine());

				if (r1 < r2) {
					System.out.println("Площадь первого круга меньше");
					reader.close();
					break;
				} else if (r2 < r1) {
					System.out.println("Площадь второго круга меньше");
					reader.close();
					break;
				}

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Ну это же несерьезно! Попробуйте-ка еще разок!");
			}

			catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Ну это же несерьезно! Попробуйте-ка еще разок!");
			}
		}

	}
}