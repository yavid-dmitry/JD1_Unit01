package by.htp.task08.main.task09;

import java.math.BigDecimal;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Book implements Comparable<Book>{
	private int id;
	private static int maxID = 0;
	private String title;
	private String author;
	private String publishing;
	private int yearPublishing;
	private int amountPages;
	private BigDecimal price;
	private String cover;

	public Book(String author, String title, String publishing, int yearPublishing, int amountPages, double price,
			String cover) {
		super();
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.yearPublishing = yearPublishing;
		this.amountPages = amountPages;
		BigDecimal priceBD = new BigDecimal(price);
		priceBD = priceBD.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.price = priceBD;
		
		this.cover = cover;
		maxID++;
		id = maxID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getAmountPages() {
		return amountPages;
	}

	public void setAmountPages(int amountPages) {
		this.amountPages = amountPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return author + " \t- " + title + " \tизд.: " + publishing + "  \tг.изд.: " + yearPublishing
				+ " \t" + amountPages + " стр. \t" + cover + " п-т цена:" + price.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((publishing == null) ? 0 : publishing.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (publishing == null) {
			if (other.publishing != null)
				return false;
		} else if (!publishing.equals(other.publishing))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public static int getMaxID() {
		return maxID;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		int result = this.getAuthor().compareTo(o.getAuthor());
		if(result == 0) {
			result = this.getTitle().compareTo(o.getTitle()); 
		}
		return result;
	}
}
