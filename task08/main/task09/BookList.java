package by.htp.task08.main.task09;

import java.util.ArrayList;
import java.util.List;

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
public class BookList<Book> extends ArrayList<Book>{



@Override
public boolean add(Book e) {
	// TODO Auto-generated method stub
	return super.add(e);
}
@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return super.contains(o);
}
@Override
public Book get(int index) {
	// TODO Auto-generated method stub
	return super.get(index);
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return super.isEmpty();
}
@Override
public Book remove(int index) {
	// TODO Auto-generated method stub
	return super.remove(index);
}
@Override
public boolean remove(Object o) {
	// TODO Auto-generated method stub
	return super.remove(o);
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return super.size();
}
@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return super.toArray();
}




}


