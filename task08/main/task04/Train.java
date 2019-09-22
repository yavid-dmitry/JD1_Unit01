package by.htp.task08.main.task04;
/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
 * назначения должны быть упорядочены по времени отправления.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Train implements Comparable<Train>{
	private String pointDestination;
	private int numberTrain; 
	private Calendar dateDeparture;
	
	public Train(String pointDestination, int numberTrain, Calendar dateDeparture) {
		super();
		this.pointDestination = pointDestination;
		this.numberTrain = numberTrain;
		this.dateDeparture = dateDeparture;
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm dd-MM-YYYY");
		return "Поезд №"  + numberTrain + " пункт назначения: " + pointDestination + "   отправляется в "
				+ sdf.format(dateDeparture.getTime());
	}

	public String getPointDestination() {
		return pointDestination;
	}

	public void setPointDestination(String pointDestination) {
		this.pointDestination = pointDestination;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public Calendar getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(Calendar dateDeparture) {
		this.dateDeparture = dateDeparture;
	}
	
	@Override
		public int compareTo(Train t) {
			// TODO Auto-generated method stub
		int differencePointDestination = this.getPointDestination().compareTo(t.getPointDestination());
		int differenceTimeDeparture = this.getDateDeparture().compareTo(t.getDateDeparture());
		if(differencePointDestination > 0 ) {
			return 1;
			} else if (differencePointDestination < 0) {
				return -1;
			} else if ( differenceTimeDeparture > 0) {
				return 1;
			} else if ( differenceTimeDeparture < 0) {
				return -1;
			} else {
				return 0;
			}
		}
}
