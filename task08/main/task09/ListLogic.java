package by.htp.task08.main.task09;

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
public class ListLogic {
	
	
	static BookList findBookListByAuthor(BookList<Book> list, String author) {
		BookList<Book> targetList = new BookList<Book>();

		for (Book book : list) {
			if (author.isEmpty()) {
				if (book.getAuthor().isEmpty()) {
					targetList.add(book);
				}
			} else {
				if (author.equals(book.getAuthor())) {
					targetList.add(book);
				}
			}
		}
		return targetList;
	}
	
	static BookList findBookListByYear(BookList<Book> list, int year) {
		BookList<Book> targetList = new BookList<Book>();

		for (Book book : list) {
			if (book.getYearPublishing() >= year) {
					targetList.add(book);
				}
			} 
		return targetList;
	}
	
	static BookList findBookListByPublishing(BookList<Book> list, String publishing) {
		BookList<Book> targetList = new BookList<Book>();

		for (Book book : list) {
			if (publishing.isEmpty()) {
				if (book.getPublishing().isEmpty()) {
					targetList.add(book);
				}
			} else {
				if (publishing.equals(book.getPublishing())) {
					targetList.add(book);
				}
			}
		}
		return targetList;
	}
	
}
