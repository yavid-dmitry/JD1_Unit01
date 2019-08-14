package by.htp.task04.main;

/*
 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих только 
 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для решения 
 * задачи использовать декомпозицию.
 */
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int nMin = (int) Math.pow(10, n);
		int nMax = (int) Math.pow(10, n + 1) - 1;
		int sum = 0;
		for (int i = nMin; i <= nMax; i++) {
			if (checkOddDigits(i) == n) {
				sum += i;
			}
		}
		int evenInSum = Method.getRazriad(sum) - checkOddDigits(sum);
		System.out.printf("Для разрядности %d сумма чисел с нечетными цифрами %d, в которой %d четная(ые)", n, sum,
				evenInSum);
	}

	public static int checkOddDigits(int a) {
		int[] array = Method.getDigits(a);
		int odd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				odd++;
			}
		}
		return odd;
	}

}
