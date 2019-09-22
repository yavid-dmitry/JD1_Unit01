package by.htp.task08.main.task08;

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
public class Customer implements Comparable<Customer> {
	private int id;
	private static int idCount;
	private String firstName;
	private String secondName;
	private String lastName;
	private String adress;
	private long cardNumber;
	private long account;

	public Customer(String firstName, String secondName, String lastName, long cardNumber, long account,
			String adress) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.cardNumber = cardNumber;
		this.account = account;
		this.adress = adress;
		idCount++;
		this.id = idCount;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Клиент " + firstName + " " + secondName + " " + lastName + " счет:" + account;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		int dif = 0;
		dif = this.lastName.compareTo(o.lastName);
		if (dif == 0) {
			return dif;
		} else {
			dif = this.firstName.compareTo(o.firstName);
			if (dif == 0) {
				return dif;
			} else {
				dif = this.secondName.compareTo(o.secondName);
			}
			return dif;
		}
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (account ^ (account >>> 32));
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (account != other.account)
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

}
