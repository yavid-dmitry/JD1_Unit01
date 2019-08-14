package by.htp.task01.main;
/*

24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.

*/
public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 10.0;
		double b = 6.0;
		double angleAlpha = 60;
		
		double high = (a - b) / 2 * Math.tan(angleAlpha / 180 * Math.PI);
		double area = b * high + (a-b) / 2 * high;
		
		System.out.println("Площадь трапеции = " + area);
	}

}
