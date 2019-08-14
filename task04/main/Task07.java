package by.htp.task04.main;
/*
 * 7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = { {1,2,3,4} , {1,6,7,9} };
		System.out.printf("Наибольшее расстояние между двумя точками %.3f \n", getMaxDistance(a));

	}
	public static double getMaxDistance(double[][] a) {
		double maxDistance = 0;
		for (int i = 0; i < a[0].length ; i++) {
			for(int j = 0; j < a[0].length ; j++) {
				double t = Math.hypot(a[0][i] - a[0][j], a[1][i] - a[1][j]);
				if (t > maxDistance) {
					maxDistance = t;
				}
			}
		}
		
		
		return maxDistance;
	}
}
