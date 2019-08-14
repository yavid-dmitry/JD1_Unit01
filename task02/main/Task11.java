package by.htp.task02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *11. Составить программу, которая определит площадь какого треугольника больше.
 */
public class Task11 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		double a;
		double b;
		double c;

		double k;
		double l;
		double m;

		while (true) {
			try {
				System.out.println("Введите длину первой стороны первого треугольника:");
				a = Double.parseDouble(reader.readLine());
				System.out.println("Введите длину второй стороны первого треугольника:");
				b = Double.parseDouble(reader.readLine());
				System.out.println("Введите длину третьей стороны первого треугольника:");
				c = Double.parseDouble(reader.readLine());

				double perimetr1 = a + b + c;
				double hp1 = perimetr1 / 2;
				double area1 = Math.sqrt(hp1 * (hp1 - a) * (hp1 - b) * (hp1 - c));
				
				System.out.println("Введите длину первой стороны второго треугольника:");
				k = Double.parseDouble(reader.readLine());
				System.out.println("Введите длину второй стороны второго треугольника:");
				l = Double.parseDouble(reader.readLine());
				System.out.println("Введите длину третьей стороны второго треугольника:");
				m = Double.parseDouble(reader.readLine());

				double perimetr2 = k + l + m;
				double hp2 = perimetr2 / 2;
				double area2 = Math.sqrt(hp2 * (hp2 - k) * (hp2 - l) * (hp2 - m));
				

				if (area1 < area2) {
					System.out.println("Первый треугольник меньше ");
					reader.close();
					break;
				} else if (area2 < area1){
					System.out.println("Второй треугольник меньше ");
					reader.close();
					break;
				} else {
					System.out.println("Треугольники равны!!!");
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