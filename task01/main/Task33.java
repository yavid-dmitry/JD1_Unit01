package by.htp.task01.main;

import java.io.*;

/*

33. Ввести любой символ и определить его порядковый номер, 
а также указать предыдущий и последующий символы.
*/
public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = reader.readLine();
			char[] c = s.toCharArray();

			System.out.println( (int) c[0]);
			System.out.println( (char) (c[0] - 1) );
			System.out.println( (char) (c[0] + 1) );
			reader.close();

		} catch (IOException e) {
			System.out.println("А ведь можно было бы правильно ввести)))");
		}
	}

}
