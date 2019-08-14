package by.htp.task03.main;
/*
 * 36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, 
 * которое делится на их произведение. Найти эти числа.
 */
public class Task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i < 100; i++) {
			for(int j = 10; j < 100; j++) {
				if( (i*100 + j) % (i * j) == 0 ) {
					System.out.println("Числа удовлетворяющие условию задачи: " + i + " и " + j);
				}
			}
		}
	}

}
