package by.htp.task04.main;

/*
 *  2. Написать метод(методы) для нахождения наибольшего общего делителя и 
 *  наименьшего общего кратного двух натуральных чисел
 */

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {360 , 480};
		Method.print(a);
		System.out.println("Наибольший общий делитель: " + Method.getNod(a));
		System.out.println("Наименьшее общее кратное: " + Method.getNok(a));
				
	}
}