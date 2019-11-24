package Exam.Data.Abstractions;

import java.util.ArrayList;

import Exam.Data.Book;

public interface ReadWritable {

	public abstract void addBookToList(Book book);

	public abstract ArrayList<Book> getBookList();

	public abstract void loadBookList();

	public abstract void saveBookList();

}