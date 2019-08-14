package by.htp.task01.main;
/*

36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
*/
public class Task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234;
		double result = (double) ( ( (a / 100) % 10) * (a % 10) ) / ( (a / 1000) * (a / 10) % 10);
		System.out.println(result);


	}

}
