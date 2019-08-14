package by.htp.task02.main;
/*
 * 16. На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси или в каком координатном угле).
 */
public class task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 4.0;
		double y = 4.1;
		if ( (x == 0) && (y != 0) ){
			System.out.println("Точка лежит на оси Y");
		} else if ( (y == 0) && (x != 0) ){
			System.out.println("Точка лежит на оси X");
		} else if ( (y == 0) && (x == 0) ){
			System.out.println("Точка лежит в начале координат");
		} else {
			double angle = Math.toDegrees( Math.atan(y / x) );
			System.out.println(angle);
		}
		
		
		
		
	}

}
