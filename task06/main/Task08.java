package by.htp.task06.main;

/*
 * 8.Даны дроби ( q p) , - натуральные). Составить программу, которая приводит 
 * эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p = { 8, 9, 7, 9, 6, 4, 3 };
		int[] q = { 16, 18, 16, 14, 8, 14, 12 };
		System.out.println("Исходные дроби");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%d/%d=%.3f\t", p[i], q[i], (double) p[i] / q[i]);
		}
		System.out.println();
		// Найдем НОК знаменателей
		int nok = Method.getNok(q);

		for (int i = 0; i < q.length; i++) {
			// Определим числитель и знаменатель
			p[i] = p[i] * (nok / q[i]);
			q[i] = nok;
		}
		System.out.println("Приведенные дроби");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%d/%d=%.3f\t", p[i], q[i], (double) p[i] / q[i]);
		}
		System.out.println();
		
		for (int i = 0; i < p.length - 1; i++) {
			for (int j = p.length - 2; j >= i; j--) {
				if (p[j] > p[j + 1]) {
					int temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;
				}
			}
		}

		System.out.println("Отсортированные дроби");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%d/%d=%.3f\t", p[i], q[i], (double) p[i] / q[i]);

		}

	}
}