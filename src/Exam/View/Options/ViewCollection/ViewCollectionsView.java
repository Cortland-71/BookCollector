package Exam.View.Options.ViewCollection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

import Exam.Data.Book;
import Exam.View.Abstractions.AES;

public class ViewCollectionsView implements AES {
	
	private GridBagConstraints c = new GridBagConstraints();
	
	private DefaultListModel<Book> listModel;
	
	public JPanel getTopPanel() {
		return viewCPanel();
	}
	
	private JPanel viewCPanel() {
		JPanel viewCollectionPanel = new JPanel();
		viewCollectionPanel.setLayout(new BorderLayout());
		viewCollectionPanel.setBackground(new Color(20,20,20));
		viewCollectionPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		viewCollectionPanel.add(north(), BorderLayout.NORTH);
		viewCollectionPanel.add(center(), BorderLayout.CENTER);
		return viewCollectionPanel;
	}
	
	private JPanel north() {
		JPanel north = new JPanel();
		north.setBackground(null);
		north.setLayout(new GridBagLayout());
		north.add(viewFileButton(), c);
		return north;
	}
	
	private JButton viewFileButton;
	private JButton viewFileButton() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10,0,10,0);
		viewFileButton = new JButton("Open");
		AES.setFont(viewFileButton, "Consolas", 0, 12, Color.ORANGE);
		AES.setButton(viewFileButton, Color.ORANGE);
		return viewFileButton;
	}
	
	public JButton getViewFileButton() {
		return viewFileButton;
	}
	public void addButtonListener(ActionListener l) {
		viewFileButton.addActionListener(l);
	}
	
	private JPanel center() {
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		center.setBackground(null);
		center.add(nameLabel(), BorderLayout.NORTH);
		center.add(bookJList(), BorderLayout.CENTER);
		center.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		return center;
	}
	
	private JList<Book> bookJList;
	private JScrollPane pane;
	private JScrollPane bookJList() {
		listModel = new DefaultListModel<Book>();
		bookJList = new JList<Book>(listModel);
		bookJList.setBackground(Color.BLACK);
		AES.setFont(bookJList, "Consolas", 0, 15, Color.ORANGE);
		pane = new JScrollPane(bookJList);
		pane.setBackground(null);
		return pane;
	}
	
	public void addSelectionListener(ListSelectionListener l) {
		bookJList.addListSelectionListener(l);
	}
	
	public JList<Book> getJBookList() {
		return bookJList;
	}
	
	public void addToBookJList(Book i) {
		listModel.addElement(i);
	}
	
	public void clearList() {
		listModel.clear();
	}
	
	private JLabel nameLabel;
	private JLabel nameLabel() {
		nameLabel = new JLabel("Path:");
		AES.setFont(nameLabel, "Constantia", 2, 15, Color.ORANGE);
		return nameLabel;
	}
	public void setNameLabel(String name) {
		nameLabel.setText("Path: " + name);
	}
}
