package by.htp.task03.main;
/*
 * 10. Составить программу нахождения произведения квадратов первых двухсот чисел.
 * Условие задачи получается (200! * 200!), так ?
 */
import java.math.*;
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		BigInteger sum = BigInteger.valueOf(1);
		while (i <= 200) {
			sum = sum.multiply(BigInteger.valueOf(i));
			sum = sum.multiply(BigInteger.valueOf(i));
			i++;
		}
		System.out.println(sum);
	}

}
