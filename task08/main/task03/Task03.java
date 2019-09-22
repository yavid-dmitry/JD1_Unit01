package by.htp.task08.main.task03;

/*
 * 3. Создайте класс с именем Student, содержащий поля: 
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, 
 * равные только 9 или 10.
 */

public class Task03 {

	


	public static void main(String[] args) {
		Student[] list;
		
		list = new Student[10];
		list[0] = new Student("Павлов П.П.", 14, new int[] { 9, 6, 9, 9, 9 });
		list[1] = new Student("Иванова И.И.", 14, new int[] { 8, 6, 7, 9, 10 });
		list[2] = new Student("Петров П.П.", 14, new int[] { 9, 10, 10, 9, 10 });
		list[3] = new Student("Сидорова С.С.", 14, new int[] { 9, 9, 9, 9, 10 });
		list[4] = new Student("Васильев В.В.", 14, new int[] { 8, 9, 9, 9, 7 });
		list[5] = new Student("Игнатова И.И.", 14, new int[] { 9, 10, 8, 9, 10 });
		list[6] = new Student("Андреев В.В.", 14, new int[] { 8, 6, 7, 9, 10 });
		list[7] = new Student("Протопопова П.П.", 14, new int[] { 10, 8, 9, 9, 10 });
		list[8] = new Student("Трофимов Т.Т.", 14, new int[] { 9, 9, 9, 9, 9 });
		list[9] = new Student("Александрова А.А.", 14, new int[] { 10, 9, 10, 9, 9 });

		StudentLogic.printAllPerfectStudents(list);
	}

	

}
