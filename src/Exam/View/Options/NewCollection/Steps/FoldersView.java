package Exam.View.Options.NewCollection.Steps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Exam.View.Abstractions.AES;

public class FoldersView {
	
	private GridBagConstraints c = new GridBagConstraints();
	
	public JPanel north() {
		JPanel north = new JPanel();
		north.setBackground(null);
		north.setLayout(new BorderLayout());
		north.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		north.add(nn(), BorderLayout.NORTH);
		north.add(cn(), BorderLayout.CENTER);
		return north;
	}
	
	private JPanel nn() {
		JPanel nn = new JPanel();
		nn.setBackground(null);
		nn.setLayout(new GridBagLayout());
		nn.add(infoLabel(), c);
		return nn;
	}
	
	private JLabel infoLabel() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20,0,20,0);
		JLabel infoLabel = new JLabel();
		infoLabel.setText("<html><center>First create a parent folder for the book to be placed in. Then create as many "
				+ "additional folders inside that new folder as<br/>"
	    + "needed to house each chapter. The program will automaticly create numbers for you at the end of the folder name starting at 0.</html>");
		AES.setFont(infoLabel, "Consolas", 0, 12, Color.GRAY);
		return infoLabel;
	}
	
	private JPanel cn() {
		JPanel cn = new JPanel();
		cn.setBackground(null);
		cn.setLayout(new GridBagLayout());
		cn.add(pathLabel(), c);
		cn.add(pathField(), c);
		cn.add(numLabel(), c);
		cn.add(numField(), c);
		cn.add(makeFolderButton(), c);
		return cn;
	}
	
	private JLabel pathLabel() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,0,20,5);
		JLabel pathLabel = new JLabel("Path:");
		AES.setFont(pathLabel, "Consolas", 2, 12, Color.GREEN);
		return pathLabel;
	}
	
	private JTextField pathField;
	private JTextField pathField() {
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(0,0,20,20);
		pathField = new JTextField();
		AES.setFont(pathField, "Constantia", 2, 13, Color.ORANGE);
		pathField.setCaretColor(Color.ORANGE);
		pathField.setBackground(Color.BLACK);
		pathField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		pathField.setPreferredSize(new Dimension(300,25));
		return pathField;
	}
	
	private JLabel numLabel() {
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(0,0,20,5);
		JLabel numLabel = new JLabel("# of folders:");
		AES.setFont(numLabel, "Consolas", 2, 12, Color.GREEN);
		return numLabel;
	}
	
	private JTextField numField;
	private JTextField numField() {
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(0,0,20,20);
		numField = new JTextField();
		AES.setFont(numField, "Constantia", 2, 15, Color.ORANGE);
		numField.setCaretColor(Color.ORANGE);
		numField.setBackground(Color.BLACK);
		numField.setHorizontalAlignment(JTextField.CENTER);
		numField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		numField.setPreferredSize(new Dimension(40,25));
		return numField;
	}
	
	private JButton makeFolderButton;
	private JButton makeFolderButton() {
		c.gridx = 4;
		c.gridy = 0;
		c.insets = new Insets(0,0,20,0);
		makeFolderButton = new JButton("Make");
		AES.setFont(makeFolderButton, "Constantia", 2, 15, Color.ORANGE);
		AES.setButton(makeFolderButton, Color.ORANGE);
		makeFolderButton.setPreferredSize(new Dimension(100,25));
		return makeFolderButton;
	}
	
	public void setPathText(String path) {
		pathField.setText(path);
	}
	
	public String getPathText() {
		return pathField.getText();
	}
	
	public void setNumField(String i) {
		numField.setText(i);
	}
	
	public String getNumOfFoldersText() {
		return numField.getText();
	}
	
	public JButton getMakeFolderButton() {
		return makeFolderButton;
	}
	//Listener
	public void addButtonListener(ActionListener l) {
		makeFolderButton.addActionListener(l);
	}

	
}
