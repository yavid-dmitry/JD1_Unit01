package by.htp.task04.main;

/*
 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
 *  вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		double y = 6.0;
		double z = 3.0;
		double t = 7.0;

		double sum1 = Method.getAreaThreeangle(x, y, Math.hypot(x, y));
		double sum2 = Method.getAreaThreeangle(x, y, Math.hypot(x, y));

		sum1 += Method.getAreaThreeangle(z, t, Math.hypot(x, y));
		sum2 -= Math.abs(Method.getAreaThreeangle(z, t, Math.hypot(x, y)));
		System.out.printf("Задан четырехугольник со сторонами %.1f  %.1f  %.1f  %.1f \n", x, y, z, t);
		System.out.println("Площадь четырехугольника №1: " + sum1);
		System.out.println("Площадь четырехугольника №2: " + sum2);
	}

}
