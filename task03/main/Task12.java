package by.htp.task03.main;

/*
 * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности.
 */
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 1;
		long ai = 1;
		for (int i = 2; i <= 10; i++) {
			ai += 6;
			result *= ai;
		}
		System.out.println(result);
	}

}
