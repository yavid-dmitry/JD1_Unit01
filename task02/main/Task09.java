package by.htp.task02.main;

/*
 * 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
 */
import java.io.*;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		
		while (true) {
		try {
			System.out.println("Введите длину первой стороны треугольника:");
			a = Double.parseDouble(reader.readLine());
			System.out.println("Введите длину второй стороны треугольника:");
			b = Double.parseDouble(reader.readLine());
			System.out.println("Введите длину третьей стороны треугольника:");
			c = Double.parseDouble(reader.readLine());
			
			
			if ( ( Math.abs(a - b) < 0.0000001) && ( Math.abs(a - c) < 0.0000001) && ( Math.abs(b - c) < 0.0000001) ) {
				System.out.println("Треугольник равносторонний :)");
				reader.close();
				break;
			} else {
				System.out.println("Треугольник неравносторонний!");
				reader.close();
				break;
			}
			
			
		} 
		catch (NumberFormatException e) {
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
