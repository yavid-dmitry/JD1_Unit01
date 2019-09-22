package by.htp.task08.main.task01;
/*  * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения 
 * этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных.
*/
public class Test1Logic {
	public int sum(Test1 test1) {
		return test1.getVariable1() + test1.getVariable2();
	}

	public int max(Test1 test1) {
		if (test1.getVariable1() > test1.getVariable2() ) {
			return test1.getVariable1();
		} else {
			return test1.getVariable2();
		}
	}
}
