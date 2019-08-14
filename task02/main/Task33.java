package by.htp.task02.main;

/*
 * 33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в 
 * базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 
 * 9583, 1747 — доступны модули баз А, В, С; 
 * 3331, 7922 — доступны модули баз В, С; 
 * 9455, 8997 — доступен модуль базы С.

 */
import java.io.*;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "9583";
		String a2 = "1747";
		String b1 = "3331";
		String b2 = "7922";
		String c1 = "9455";
		String c2 = "8997";
		int n = 5;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (n > 0) {
		System.out.println("Введите пароль:");
		try {
			String password = reader.readLine();
			if (a1.equals(password) || a2.equals(password) ) {
				System.out.println("Ваш уровень доступа A, B и С"); break;
			}
			if (b1.equals(password) || b2.equals(password) ) {
				System.out.println("Ваш уровень доступа B и С"); break;
			}
			if (c1.equals(password) || c2.equals(password) ) {
				System.out.println("Ваш уровень доступа С"); break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Попробуйте ввести пароль еще раз. У вас осталось " + n + " попытка(ок)");
		n--;
		
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
