package by.htp.task01.main;
/*

23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).

*/
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rSmall = 2.0;
		double rBig = 4.0;
		
		double areaSmall = rSmall * rSmall * Math.PI;
		double areaBig = rBig * rBig * Math.PI;
		
		double result = areaBig - areaSmall;
		
		System.out.println("Площадь кольца = " + result);
	}

}
