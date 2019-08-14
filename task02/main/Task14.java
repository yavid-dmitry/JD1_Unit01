package by.htp.task02.main;
/*
 * 14. Даны два угла треугольника (в градусах). Определить, существует ли 
 * такой треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alpha = 34.3;
		double beta = 90 - 34.3;

		if ( (alpha > 0 && beta > 0) && ( alpha + beta < 180) ) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Такого треугольника не существует");
		}
		if ( (alpha > 0 && beta > 0) && ( Math.abs( (alpha + beta) - 90) < 0.0000001) ) {
			System.out.println("Треугольник прямоугольный");
		} 
	}

}
