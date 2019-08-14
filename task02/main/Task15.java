package by.htp.task02.main;
/*
 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить 
 * половиной их суммы, а большее — их удвоенным произведением.
 */
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 4.0;
		double y = 4.1;
		if (x < y) {
			x /= 2;
			y *= 2;
		} else  {
			x *= 2;
			y *= 2;
		}
		System.out.println(x + " and " + y);
	}

}
