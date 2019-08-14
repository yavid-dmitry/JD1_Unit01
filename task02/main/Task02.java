package by.htp.task02.main;

/*2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», 
 * в противном случае – слово «no»
 */

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		String result = "";
		if (x < y) {
			result = "yes";
		} else {
			result = "no";
		}
		System.out.println(result);
	}

}