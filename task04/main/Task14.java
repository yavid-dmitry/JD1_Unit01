package by.htp.task04.main;
/*
 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
		int b = 3324;
				
		if(Method.getRazriad(a) > Method.getRazriad(b)) {
			System.out.printf("Наибольшее количество цифр %d в числе %d", Method.getRazriad(a), a);
		} else {
			System.out.printf("Наибольшее количество цифр %d в числе %d", Method.getRazriad(b), b);
		}
		
	}

}
