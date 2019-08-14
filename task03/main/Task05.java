package by.htp.task03.main;

/*5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в
 * диапазоне от 1 до 99 включительно.
*/

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
	}

}
