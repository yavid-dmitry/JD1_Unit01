package by.htp.task02.main;
/*
 * 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, 
 * и заменить их абсолютными значениями, если это не так.
 */
public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 3;
		double b = -3.8;
		double c = 3.2;
		
		if ((a > b) && (b >c)) {
			a *= 2;
			b *= 2;
			c *= 2;
		}  else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		
		System.out.println(a + " " + b + " " + c);
	}

}
