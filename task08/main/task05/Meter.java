package by.htp.task08.main.task05;
/*
 * Предусмотрите инициализацию счетчика значениями по умолчанию и 
 * произвольными значениями.
 */
public class Meter {
	private int value;
	
	public Meter() {
		value = 0;
	}
	
	public Meter(int value) {
		this.value = value % 10;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value % 10;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "" + value;
		}
}
