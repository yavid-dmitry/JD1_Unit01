package by.htp.task08.main.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
* set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
*  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные 
*  на консоль.
	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
	
	Найти и вывести:
		a) список покупателей в алфавитном порядке;
		b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/
public class CustomerList {
	private List<Customer> list;

	public CustomerList() {
		list = new ArrayList<Customer>();
	}
	
	


	public void addCustomer(Customer customer) {
		list.add(customer);
	}
	
	public boolean removeCustomer(Customer customer) {
		return list.remove(customer);
	}
	
	public boolean containsCustomer(Customer customer) {
		return list.contains(customer);
	}




	public List<Customer> getList() {
		return list;
	}




	public void setList(List<Customer> list) {
		this.list = list;
	}
	
	

	
	
	
	
}
