package Exam.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Exam.Data.Abstractions.ReadWritable;

public class BookIOData implements ReadWritable {

	private final String metaDataPath = System.getProperty("user.home")
			+ "\\Desktop\\PageCollectorMetaData";
	
	private FileInputStream fileIn;
	private ObjectInputStream objectIn;
	private ObjectOutputStream objectOut;
	private FileOutputStream fileOut;

	private ArrayList<Book> bookList = new ArrayList<>();
	
	@Override
	public void addBookToList(Book book) {
		bookList.add(book);
	}

	@Override
	public void saveBookList() {
		try {
			fileOut = new FileOutputStream(metaDataPath);
			objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(bookList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			message("Collection file not found...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		message("The Object  was succesfully written to a file");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void loadBookList() {
		try {
			bookList.clear();
			fileIn = new FileInputStream(metaDataPath);
			objectIn = new ObjectInputStream(fileIn);
			bookList = (ArrayList<Book>) objectIn.readObject();
			objectIn.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No file found");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	private void message(String m) {
		JOptionPane.showMessageDialog(null, m);
	}
}
