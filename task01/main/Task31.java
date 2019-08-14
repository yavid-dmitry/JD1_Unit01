package by.htp.task01.main;
/*

31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в 
стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, 
а против течения реки — t2 ч.
*/
public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v = 5.0;
		double v1 = 2.0;
		double t1 = 2.0;
		double t2 = 3.0;
		
		double distance = (v * t1) + ( (v - v1) * t2);
		System.out.println("Расстояние = " + distance);
		
	}

}
