package by.htp.task03.main;
/*
 * 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, 
 * то получили исходное число. Найти это число.
 */
public class Task39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 100; i < 999; i++) {
			if( (i % 100) * 7 == i) {
				System.out.println("Исходное число - " + i);
			}
		}

		
	}

}
