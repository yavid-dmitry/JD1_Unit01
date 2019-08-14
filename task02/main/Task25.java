package by.htp.task02.main;

/*
 * 25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение 
 * «Пожароопасная ситуация », если температура в комнате превысила 60° С.
 */
public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature = 25;
		while (true) {
			temperature += 8;
			System.out.println("Температура " + temperature + " градусов");
			if (temperature > 60) {
				System.out.println("Пожароопасная ситуация ");
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
