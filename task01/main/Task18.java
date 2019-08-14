package by.htp.task01.main;
/*

18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

*/
public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 4.0;
		double areaSide = x * x;
		double areaAllSides = areaSide * 6;
		double volume = x * x * x;
		
		System.out.println("Площадь грани = " + areaSide);
		System.out.println("Площадь всей поверхности = " + areaAllSides);
		System.out.println("Объем куба = " + volume);

	}

}
