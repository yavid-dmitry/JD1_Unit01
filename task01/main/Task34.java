package by.htp.task01.main;

/*

34. Дана величина А, выражающая объем информации в байтах. 
Перевести А в более крупные единицы измерения информации.
*/
public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1000000000001L;

		long kbFull = a / 1024;
		long mbFull = kbFull / 1024;
		long gbResult = mbFull / 1024;
		long bResult = a % 1024;
		long kbResult = kbFull % 1024;
		long mbResult = mbFull % 1024;
		if (gbResult != 0) {
			System.out.printf("%d гигабайт(а) %d мегабайт(а) %d килобайт(а) %d байт(а)", gbResult, mbResult,
					kbResult, bResult);
		} else if (mbResult != 0) {
			System.out.printf("%d мегабайт(а) %d килобайт(а) %d байт(а)", mbResult, kbResult, bResult);
		} else if (kbResult != 0) {
			System.out.printf("%d килобайт(а) %d байт(а)", kbResult, bResult);
		} else {
			System.out.printf("%d байт(а)", bResult);
		}
	}

}
