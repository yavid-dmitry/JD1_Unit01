package by.htp.task07.main;
/*
 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу 
 * и номера строк, в которых число 5 встречается три и более раз.
 */
public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = Method.initRandomMatrix(10, 20, 15);
		Method.print(m);
		
		System.out.println("Номера строк, в который 5 встречается 3 и более раза:");
		for(int i = 0; i < m.length; i++) {
			if(checkLine5(m, i)) {
				System.out.print(i + "\t");
			}
		}
		
		
		
	}
	public static boolean checkLine5(int[][] m, int line) {
		int number5 = 0;
		for(int j = 0; j < m[line].length; j++) {
			if(m[line][j] == 5) {
				number5++;
			}
			
		}
		return number5 >= 3;
	}

}
