package by.htp.task01.main;

/*

6. Написать код для решения задачи. В n малых бидонах 80 л молока. 
Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?

*/

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int sumN = 80;
		int volumeSmall = sumN / n; //Принято допущение, что объем бидона всегда целочисленный
		
		int m = 20;
		int volumeBig = volumeSmall + 12;
		
		int sumM = volumeBig * m;
		
		System.out.println(sumM);

	}

}
