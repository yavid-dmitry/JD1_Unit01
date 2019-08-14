package by.htp.task02.main;
/*
 * 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом,
 *  равным большему из исходных, а если равны, то заменить числа нулями.
 */
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 4;
		if (n == m) {
			m = 0;
			n = 0;
		} else {
			if ( n > m) {
				m = n;
			} else {
				n = m;
			}
		}
		System.out.println(n + " and " + m);
	}

}
