package by.htp.task03.main;

/*
 * 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */
public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int digit;

		for (int j = 1000; j < 9999; j++) {
			int sum = 0;
			for (int i = 4; i >= 1; i--) {
				digit = (j % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);
				sum += digit;
				}
			if(sum == 15) {
				System.out.println( j+ "  ");
			}
			
		}
	}
}
