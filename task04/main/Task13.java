package by.htp.task04.main;
/*
 * 13. Дано натуральное число N. Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N.
 */
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19945678;
		int[] digits = Method.getDigits(a);
		Method.print(digits);
	}

}
