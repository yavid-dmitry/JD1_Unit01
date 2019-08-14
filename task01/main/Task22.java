package by.htp.task01.main;
/*

22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.

*/
public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 10000;
		int hour = t / 3600;
		int minute = (t % 3600) / 60;
		int second = t % 60;
		
		System.out.printf("%d ч  %d мин  %d с.", hour, minute, second);
		
	}

}
