package by.htp.task02.main; 
/*
 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		double x = -2.0;
		double result = Math.abs(a * x * x + b * x + c);
		System.out.println(result);

	}

}
