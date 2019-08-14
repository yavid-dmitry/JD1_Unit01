package by.htp.task03.main;

/*6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
 *   суммирует все числа от 1 до введенного пользователем числа.
 */
import java.io.*;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Введите любое целое положительное число");
			int input = Integer.parseInt(reader.readLine());
			int output = 0;
			for (int i = 1; i <= input; i++) {
				output +=  i;
			}
			
			System.out.println("Результат : " + output);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
