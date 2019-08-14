package by.htp.task03.main;
/*
 * 26. Вывести на экран соответствий между символами и их численными обозначениями в памяти
	компьютера (Таблицу ASCII).
 */
public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 0;
		char d = 0;
		for (int i = 33; i <= 127; i++) {
			
			c = (char)i;
			d = (char)(i + 128);
			

			System.out.printf("| %03d |  %s  |    | %03d |  %s  |%n", i , c , i + 128 , d);
		}
	}

}
