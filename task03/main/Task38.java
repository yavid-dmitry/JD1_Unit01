package by.htp.task03.main;

/*
 * 38. Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
 * Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
 */
public class Task38 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a = 123456789;
			int raznost = 0;
			
			int digit;
			int digitNext;
			int razriad = 0;
			boolean isArythmProgression = true;

			for (int i = 1; i < 30; i++) {
				if (a / (int) Math.pow(10, i - 1) != 0) {
					razriad = i;
				} else {
					break;
				}
			}

			for (int i = 1; i < razriad; i++) {
				
					digit = (a % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);
					digitNext = ((a) % ((int) Math.pow(10, i + 1))) / (int) Math.pow(10, i);
					if (i == 1) {
						raznost = digitNext - digit;
					
					} else {
			
						if (digitNext - digit != raznost) {
							isArythmProgression = false;
							
						}
					}
					
			}
			
			if (isArythmProgression) {
				System.out.println("Цифры числа " + a + " - арифметическая прогрессия");
			} else {
				System.out.println("Цифры числа " + a + " не являются арифметической прогрессией");
			}
	}
}