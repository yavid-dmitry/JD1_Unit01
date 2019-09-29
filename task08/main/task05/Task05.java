package by.htp.task08.main.task05;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и 
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
 * получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 * 
 * В моем понимании десятичный счетчик, это счетчик который считает от 0 до 9, после 9 сбрасывает
 * обратно на 0.
 */

public class Task05 {

	public static void main(String[] args) {
		Meter meter = new Meter();
		System.out.println("Инициализация счетчика со значением по умолчанию " + meter);
		
		meter = new Meter(69);
		System.out.println("Создаем новый счетчик с заданным значением " + meter);
		MeterLogic.increaseMeter(meter);
		System.out.println("Инкрементируем счетчик: " + meter);
		MeterLogic.decreaseMeter(meter);
		System.out.println("Декрементируем счетчик: " + meter);
		
	}
}