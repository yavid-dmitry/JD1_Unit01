package by.htp.task08.main.task07;
/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */
public class TriangleMethod {

	public static double getPerimeter(Triangle triangle) {
		return triangle.getAb() + triangle.getAc() + triangle.getBc();
	}
	
	public static double getSquare(Triangle triangle) {
		double ab = triangle.getAb(); 
		double bc = triangle.getBc();
		double ac = triangle.getAc();
		double hp = getPerimeter(triangle) / 2;
		double square = Math.sqrt(hp * (hp - ab) * (hp - bc) * (hp - ac));
		
		return square;
	}
	
	public static double getXMedianCenter(Triangle triangle) {
		return (triangle.getAx() + triangle.getBx() + triangle.getCx()) / 3;
	}
	
	public static double getYMedianCenter(Triangle triangle) {
		return (triangle.getAy() + triangle.getBy() + triangle.getCy()) / 3;
	}
}
