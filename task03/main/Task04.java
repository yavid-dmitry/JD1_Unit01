package by.htp.task03.main;

/*
 * 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
 * включительно.
*/

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
	}

}
