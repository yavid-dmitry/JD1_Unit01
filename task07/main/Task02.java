package by.htp.task07.main;

/*2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными
 *  числами из [0, 9].
 */

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = Method.initRandomMatrix(2, 3, 9);
		Method.print(m);
	}

}
