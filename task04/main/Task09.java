package by.htp.task04.main;

/*
 * 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 15, 654, 18 };
		Method.print(a);

		if (Method.getNod(a) == 1) {
			System.out.println("Числа взаимно простые");
		} else {
			System.out.printf("Числа имеют общий делитель %d, который больше 1", Method.getNod(a));
		}

	}

}
