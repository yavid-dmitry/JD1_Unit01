package by.htp.task01.main;
/*

28. Составить программу перевода радианной меры угла в градусы, 
минуты и секунды.
*/
public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.5;
		
		double aFull = Math.toDegrees(a);
		
		int aGrad = (int) aFull / 1; //перевод в градусы
		
		int aFullSec  = (int) ( (aFull - aGrad) * 3600);
		
		int aMin = aFullSec / 60;
		int aSec = aFullSec % 60;
		System.out.println(aGrad +" градус(а) "+ aMin + " минут(ы) " + aSec + " секунд(ы)");
	}

}
