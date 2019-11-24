package Exam.Controllers.ViewCollectionsCon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Exam.Data.Book;
import Exam.View.Window.Window;

public class ViewCon implements ActionListener, ListSelectionListener {
	private Book k;
	private Window window;
	public ViewCon(Window window) {
		this.window = window;
		this.window.getTop().getHubCenter().getVColView().addButtonListener(this);
		this.window.getTop().getHubCenter().getVColView().addSelectionListener(this);
	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		if(window.getTop().getHubCenter().getVColView().getJBookList().getSelectedValue() != null) {
			try {
				Runtime.getRuntime().exec("explorer.exe /select," + k.getPath());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		k = window.getTop().getHubCenter().getVColView().getJBookList().getSelectedValue();
		if(k != null)
			window.getTop().getHubCenter().getVColView().setNameLabel(k.getPath());
		else
			window.getTop().getHubCenter().getVColView().setNameLabel("");
	}
	
	public void setFirstBook(Book b) {
		this.k = b;
	}
}
