package by.htp.task08.main.task01;
/*
 *  * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения 
 * этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных.
 */
public class Test1 {
	private int variable1;
	private int variable2;

	public Test1() {
		variable1 = 0;
		variable2 = 0;
	}

	public int getVariable1() {
		return variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void printVariable1() {
		System.out.println(variable1);
	}

	public void printVariable2() {
		System.out.println(variable2);
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}
}