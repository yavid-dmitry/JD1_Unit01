package by.htp.task01.main;
/*

21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
Поменять местами дробную и целую части числа и вывести полученное значение числа.

*/
public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 123.456;
		
		int y = (int) (x * 1000);
		int z = (y / 1000) + (y % 1000) * 1000;
		
		double result = z / 1000.0;
		System.out.println(result);
	}

}
