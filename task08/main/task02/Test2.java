package by.htp.task08.main.task02;

/*
 * 2. Создйте класс Test2 двумя переменными. 
 * Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {

	private int variable1;
	private int variable2;

	public Test2() {
		variable1 = 0;
		variable2 = 0;
	}

	public Test2(int variable1, int variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}

	public int getVariable1() {
		return variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}

}
