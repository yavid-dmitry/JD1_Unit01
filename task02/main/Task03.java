package by.htp.task02.main;

import java.io.*;

/*3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», 
 * если число а меньше 3; если больше, то вывести слово «no».
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		String input = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		try {
			input = reader.readLine();
			a = Integer.parseInt(input);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		String result = "";
		if (a < x) {
			result = "yes";
		} else {
			result = "no";
		}
		System.out.println(a + " - " + result);
	}

}