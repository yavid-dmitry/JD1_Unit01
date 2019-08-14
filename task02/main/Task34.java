package by.htp.task02.main;

/*
 * 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи 
 * не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
 * то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
 * то печатает сообщение об этом и указывает размер недостающей суммы.
 */
import java.io.*;
import java.math.BigDecimal;

public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal priceBook;
		BigDecimal cash;
		BigDecimal change;

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Сколько стоит книга:");
			priceBook = new BigDecimal(reader.readLine());
			System.out.println("Сколько внесено денег покупателем");
			cash = new BigDecimal(reader.readLine());
			change = cash.subtract(priceBook);
			if (change.doubleValue() == 0) {
				System.out.println("спасибо");
			}
			if (change.doubleValue() < 0) {
				System.out.println("Денег недостаточно добавьте еще " + (-change.doubleValue()));
			}
			if (change.doubleValue() > 0) {
				System.out.println("возьмите сдачу " + change.doubleValue());
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
