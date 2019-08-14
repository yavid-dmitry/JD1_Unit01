package by.htp.task01.main;
/*

27. Дано значение a. Не используя никаких функций и никаких операций, 
кроме умножения, получить значение а8 за три операции и а10 за четыре операции.

*/
public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.0;
		double aPow2 = a * a;
		double aPow4 = aPow2 * aPow2;
		double aPow8 = aPow4 * aPow4;
		
		double aPow10 = aPow8 * aPow2;
		
		System.out.println("а в степени 8 = " + aPow8);
		System.out.println("а в степени 10 = " + aPow10);
	}

}