package by.htp.task04.main;

/*
 * 16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 
 * (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], 
 * где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int simple = 1;
		int simplePrev = 1;
		for (int i = n; i <= 2 * n; i++) {
			if (checkSimple(i)) {
				simple = i;

			}
			if (simple - simplePrev == 2) {
				System.out.println(simplePrev + " " + simple);
			}
			simplePrev = simple;

		}

	}

	public static boolean checkSimple(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
