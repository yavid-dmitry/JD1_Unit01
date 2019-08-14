package by.htp.task01.main;
/*

30. Три сопротивления R1 R2, и R3 соединены параллельно. 
Найдите сопротивление соединения.
*/
public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = 2.0;
		double r2 = 4.0;
		double r3 = 5.0;
		
		double r12 = (r1 * r2) / (r1 + r2);
		double result =  (r12 * r3) / (r12 + r3);
		
		System.out.println(result);
	}

}
