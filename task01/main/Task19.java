package by.htp.task01.main;
/*

19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
*/
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 4.0;
		
		double perimetr = a * 3;
		
		double hp = perimetr / 2;
		double area = Math.sqrt( hp * (hp - a) * (hp - a) * (hp - a) );
		
		double hight = Math.sqrt(a * a - (a / 2) * (a / 2) );
		
		double radiusInside = Math.sqrt(3) / 6 * a;
		
		double radiusOutside = Math.sqrt(3) / 3 * a;
		
		System.out.println("Площадь треугольника = " + area);
		System.out.println("Высота треугольника = " + hight);
		System.out.println("Радиус вписанной окружности = " + radiusInside);
		System.out.println("Радиус описанной окружности = " + radiusOutside);
	
	}

}
