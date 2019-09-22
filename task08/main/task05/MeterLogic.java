package by.htp.task08.main.task05;

public class MeterLogic {
	public static void increaseMeter(Meter meter) {
		if(meter.getValue() < 9) {
		meter.setValue(meter.getValue() + 1);
		} else {meter.setValue(0);}
	}
	
	public static void decreaseMeter(Meter meter) {
		if(meter.getValue() > 0) {
		meter.setValue(meter.getValue() - 1);
		} else {meter.setValue(9);}
	}
}
