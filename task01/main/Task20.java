package by.htp.task01.main;
/*

20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

*/
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance = 314.0;
		
		double radius = distance / Math.PI;
		
		double area = radius * radius * Math.PI;
		
		System.out.println("Площадь круга = " + area);
	}

}
