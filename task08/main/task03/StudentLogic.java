package by.htp.task08.main.task03;

public class StudentLogic {
	static public void printAllPerfectStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (isPerfectStudent(students[i])) {
				System.out.println(students[i].getName() + " из группы " + students[i].getGroup());
			}
		}
	}

	static public void printAllStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].getName() + " из группы " + students[i].getGroup());

		}
	}

	static private boolean isPerfectStudent(Student student) {
		boolean isPerfectStudent = true;
		for (int i = 0; i < student.getProgress().length; i++) {
			if (student.getProgress()[i] < 8) {
				isPerfectStudent = false;
			}
		}
		return isPerfectStudent;
	}

}
