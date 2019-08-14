package by.htp.task05.main;

/*
 * 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 * 
 * Примечание: Я не понял принимается является ли возрастающая только при а1 > a2, или же допускается
 * а1 >= a2. Сделал для варианта а1 > a2. Если надо наоборот - поменять знак на строго меньше
 * в методе checkSequence
 */

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[] a = Method.initArray(n, 100);
		Method.print(a);
		if(checkSequence(a)) {
			System.out.println("Последовательность возрастающая");
		} else {
			System.out.println("Последовательность невозрастающая");
		}
		
		
	}
	public static boolean checkSequence(int[] a) {
		if (a.length == 1) {
			return true;
		}

		for (int i = 1; i < a.length; i++) {
			if (  a[i] <= a[i - 1]){
				return false;
			}
		}
		return true;
	}
}
