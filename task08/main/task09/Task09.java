package by.htp.task08.main.task09;

import java.util.*;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Task09 {
	public static void main(String[] args) {
		BookList<Book> list = new BookList<Book>();
		list.add(new Book("Пушкин А.С.", "Руслан и Людимила", "Сбагриус", 1998, 250, 190.07, "Подарочный"));
		list.add(new Book("Пушкин А.С.", "Евгений Онегин", "Сбагриус", 1999, 210, 39.25, "Мягкий"));
		list.add(new Book("Пушкин А.С.", "Сказка о попе и его работнике балде", "Сбагриус", 2008, 90, 56.46,
				"Твердый"));
		list.add(new Book("Чехов А.П.", "Чайка", "БельдяжкиПресс", 2013, 115, 115.37, "Подарочный"));
		list.add(new Book("Достоевский Ф.М.", "Идиот", "БельдяжкиПресс", 2010, 435, 62.15, "Мягкий"));
		list.add(new Book("Достоевский Ф.М.", "Преступление и наказание", "БельдяжкиПресс", 2000, 345, 89,
				"Твердый"));
		list.add(new Book("Лермонов М.Ю.", "Мцыри", "Сбагриус", 1996, 98, 21.49, "Ручной"));
		list.add(new Book("Лермонов М.Ю.", "Избранное", "Сбагриус", 2019, 392, 35.29, "Твердый"));
		System.out.println("Книги Пушкина А.С.:");
		printList(ListLogic.findBookListByAuthor(list, "Пушкин А.С."));
		System.out.println("Книги издательства Сбагриус:");
		printList(ListLogic.findBookListByPublishing(list, "Сбагриус"));
		System.out.println("Книги младше 2000 года");
		printList(ListLogic.findBookListByYear(list, 2000));
		
		
	}

	static public void printList(BookList<Book> list) {
		list.sort(null);
		for(Book book: list) {
			System.out.println(book);
		}
	}
}
