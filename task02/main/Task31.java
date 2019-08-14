package by.htp.task02.main;

/*
 * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 119;
		int b = 119;
		int x = 250;
		int y = 120;
		int z = 45;
		boolean goodSize = false;
		int temp = 0;
		// пересортируем размеры отверстия, так чтобы первое было меньшим
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		// рассортируем размеры кирпича по возрастанию
		if (x > y) {
			if (y > z) {
				temp = x;
				x = z;
				z = temp;
			} else {
				temp = x;
				x = y;
				y = temp;
			}
		} else if (y > z) {
			temp = x;
			x = z;
			z = temp;
		}

		// Первый вариант - проходит ли кирпич параллельно отверстию
		if ((a < x) && (b < y)) {
			goodSize = true;
			System.out.println("Кирпич проходит параллельно отверстию");
		}
		// Второй вариант, а пролезет ли по диагонали
		// http://qaru.site/questions/598591/detect-if-one-rect-can-be-put-into-another-rect

		double temp2 = (2 * y * x * b + (y * y - x * x) * Math.sqrt(y * y + x * x - b * b)) / (y * y + x * x);
		boolean conditionForRect = (a >= temp2);

		if (y > b && conditionForRect) {
			goodSize = true;
			System.out.println("Кирпич проходит по диагонали к отверстию");
		}
		if (!goodSize) {
			System.out.println("Кирпич не пройдет!");
		}

	}

}
