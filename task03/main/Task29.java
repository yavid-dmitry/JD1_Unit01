package by.htp.task03.main;

/*
 * 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 12345678;
		int n = 34567890;

		String mString = "" + m;
		String nString = "" + n;

		System.out.println("Для чисел " + m + " и " + n + " общие цифры:");
		for (int i = 0; i < 10; i++) {
			String digit = "" + i;
			
			if (mString.contains(digit) && nString.contains(digit) ) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
	}

}
