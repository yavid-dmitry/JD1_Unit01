package by.htp.task08.main.task08;

import java.util.Collections;

public class CustomerListLogic {
	
	public static void sortCustomer(CustomerList list, boolean order) {
		if(order) {
		Collections.sort(list.getList());}
		else {
			Collections.reverse(list.getList());
		}
	}
	
	public static void printSortedList(CustomerList list, boolean order) {
		sortCustomer(list, order);
		for(Customer customer: list.getList()) {
			System.out.println(customer);
		}
	}
	
	public static void printCardNumberRange(CustomerList list, long min, long max) {
		sortCustomer(list, true);
		for(Customer customer:list.getList()) {
			long tempCN = customer.getCardNumber();
			if(tempCN >= min && tempCN <= max) {
				System.out.println(customer);
			}
		}
	}
}
