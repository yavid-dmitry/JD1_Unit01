package by.htp.task08.main.task07;


/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */
public class Task07 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(1.5, 1.4, 5.0, 6.3, 12.1, 4.3);
		
		System.out.printf("Площадь треугольника %.3f\n", TriangleMethod.getSquare(triangle));
		System.out.printf("Периметр %.3f\n", TriangleMethod.getPerimeter(triangle));
		System.out.printf("Центр пересечения медиан x = %.3f y = %.3f\n", 
				TriangleMethod.getXMedianCenter(triangle), TriangleMethod.getYMedianCenter(triangle));
	}
}