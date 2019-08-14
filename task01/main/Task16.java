package by.htp.task01.main;
/*

16. Найти произведение цифр заданного четырехзначного числа.

*/

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1234;
		int a = x / 1000;
		int b = (x / 100) % 10;
		int c = (x / 10) % 10;
		int d = x %10;
		
		int result = a * b * c *d;
		
		System.out.println(result);
	}

}
