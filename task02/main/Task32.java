package by.htp.task02.main;
/*
 * 32. Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них положительной.
 */
public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3;
		double b = -3.8;
		double c = 3.2;
		if ( (a + b) > 0 || (a + c) > 0 || (b + c) > 0) {
			System.out.println("Сумма двух чисел положительна");
		} else {
			System.out.println("Все суммы неположительны");
		}
	}

}
