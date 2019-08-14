package by.htp.task03.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.
 */
public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				System.out.print("Введите числа X и Y, и знак операции(+, –, /, *) \n>");
				double x = Double.parseDouble(reader.readLine());
				if ((int) x == 0) {
					break;
				}

				System.out.print(">");
				double y = Double.parseDouble(reader.readLine());
				if ((int) y == 0) {
					break;
				}

				System.out.print(">");
				String operation = reader.readLine();
				if ("0".equals(operation)) {
					break;
				}

				switch (operation) {
				case "+":
					System.out.println(x + y);
					break;
				case "-":
					System.out.println(x - y);
					break;
				case "/":
					System.out.println(x / y);
					break;
				case "*":
					System.out.println(x * y);
					break;
				default:
					System.out.println("Невозможно выполнить данную операцию на трезвый процессор");

				}

			}
			System.out.println("Всего наилучшего, спасибо что выбрали нашу авиакомпанию");
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
