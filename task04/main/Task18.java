package by.htp.task04.main;

/*
 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for (int i = 1; i <= (int) Math.pow(10, n + 1) - 1; i++) {
			if(checkSequence(Method.getDigits(i))) {
				System.out.println(i);
			}
		}
	}

	public static boolean checkSequence(int[] a) {
		if (a.length == 1) {
			return true;
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] >= a[i]) {
				return false;
			}
		}
		return true;
	}
}
