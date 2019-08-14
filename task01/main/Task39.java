package by.htp.task01.main;

/*

39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, 
кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
2x^4 - 3х^3 + 4х^2 - 5х + 6.
*/
public class Task39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2;

		double result = x * (x * (x * (x * 2 - 3) + 4) - 5) + 6;
		System.out.println("Результат " + result + " получен за 8 операций");
		
		
	}
}
