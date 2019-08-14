package by.htp.task03.main;

/*
 * 32. Проверить введенную пользователем строку на наличие недопустимых символов. 
 * В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
 */
import java.io.*;

public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print(
					"Введите строку. В качестве первого символа допустимы только буквы и знак подчеркивания.\n Остальные символы могут быть буквами, цифрами и знаком подчеркивания.\n>");
			String string = reader.readLine();
			boolean checkString = true;
			char[] array = string.toCharArray();

			Character ch = new Character(array[0]);
			if (!(Character.isAlphabetic(ch) || ch == '_') ) {
				checkString = false;
			}

			for (int i = 1; i < array.length; i++) {
				ch = array[i];
				if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '_') ) {
					checkString = false;
				}
			}

			
			if (!checkString) {
				System.out.println("Строка имеет недопустимые символы");
			} else {
				System.out.println("Все в порядке!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
