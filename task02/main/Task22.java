package by.htp.task02.main;
/*
 * 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */
public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 4.0;
		double y = 4.1;
		if (x < y) {
			x = x + y;
			y = x - y;
			x = x - y;
		}
		System.out.println(x + " и " + y);
	}

}
