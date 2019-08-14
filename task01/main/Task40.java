package by.htp.task01.main;
/*

Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
*/
public class Task40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
		
		double x2 = x * x;
		double k = 3 * x2;
		double z = x * (2 + 4 * x2);
		
		double y1 = k - z;
		double y2 = z + k + 1;
		System.out.println("Ответы " + y1 + " и " + y2 + " получены за 8 операций");
	}

}
