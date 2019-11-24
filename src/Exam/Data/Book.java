package Exam.Data;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String path;
	
	public Book(String name, String path) {
		this.name = name;
		this.setPath(path);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public String toString() {
		return String.format("%s", name);
	}
}
