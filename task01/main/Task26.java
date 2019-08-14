package by.htp.task01.main;
/*

26. Найти площадь треугольника, две стороны которого равны а и b, 
а угол между этими сторонами у.
*/
public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 4.0;
		double b = 5.0;
		double angleY = 60;
		
		double height = b * Math.sin(angleY * Math.PI / 180);
		double area = 0.5 * a * height;
		System.out.println("Площадь треугольника = " + area);
		
	}

}
