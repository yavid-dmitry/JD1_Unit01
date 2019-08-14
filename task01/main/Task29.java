package by.htp.task01.main;
/*

29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

*/
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 4.0;
		double b = 5.0;
		double c = 6.0;
		
		double alphaRad = Math.acos( (b * b + c * c - a * a) / (2 * b * c) );
		double alphaGrad = Math.toDegrees(alphaRad);
		
		double betaRad = Math.acos( (a * a + c * c - b * b) / (2 * a * c) );
		double betaGrad = Math.toDegrees(betaRad);

		double gammaRad = Math.acos( (a * a + b * b - c * c) / (2 * a * b) );
		double gammaGrad = Math.toDegrees(gammaRad);
		
		System.out.println("Угол альфа " + alphaRad + " радиан или " + alphaGrad + " градусов");
		System.out.println("Угол бета " + betaRad + " радиан или " + betaGrad + " градусов");
		System.out.println("Угол гамма " + gammaRad + " радиан или " + gammaGrad + " градусов");
		
	}

}
