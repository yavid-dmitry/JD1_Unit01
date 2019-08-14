package by.htp.task01.main;
/*

32. Текущее показание электронных часов: m ч (0 ≤ т ≤23) n мин (0 ≤ п ≤59) k с (0 ≤к ≤59). 
Какое время будут показывать часы через р ч q мин r с?
*/
public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 23;
		int n = 59;
		int k = 59;
		
		int p = 5;
		int q = 5;
		int r = 5;
		
		int k1 = (k + r) % 60;
		int n1 = (n + q + (k + r) / 60) % 60;
		int m1 = (m + p + (n + q + (k + r) / 60) / 60) % 24;
		System.out.printf("%d часа(ов) %d минут(ы) %d минут(ы)", m1, n1, k1);

	}

}
