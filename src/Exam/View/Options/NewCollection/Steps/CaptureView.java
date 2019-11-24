package Exam.View.Options.NewCollection.Steps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Exam.View.Abstractions.AES;

public class CaptureView {
	
	private GridBagConstraints c = new GridBagConstraints();
	
	public JPanel south() {
		JPanel south = new JPanel();
		south.setBackground(null);
		south.setLayout(new BorderLayout());
		south.add(ns(), BorderLayout.NORTH);
		south.add(cs(), BorderLayout.CENTER);
		south.add(ss(), BorderLayout.SOUTH);
		return south;
	}
	
	private JPanel ns() {
		JPanel ns = new JPanel();
		ns.setBackground(null);
		ns.setLayout(new GridBagLayout());
		ns.add(infoLabel3(), c);
		ns.add(bookNameField(), c);
		ns.add(bookNameLabel(), c);
		return ns;
	}
	
	private JLabel infoLabel3() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20,0,20,0);
		JLabel infoLabel = new JLabel();
		infoLabel.setText("<html><center>Select the method of page turning, then varify the path the pages will be saved to. The \"Wait\" is set in milliseconds<br/>"
				+ "and represents the time between turning a page and taking a snapshot. Once ready, select \"Start\" to begin the capturing process.</html>");
		AES.setFont(infoLabel, "Consolas", 0, 12, Color.GRAY);
		return infoLabel;
	}
	
	private JLabel bookNameLabel() {
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(0,0,2,0);
		JLabel bookNameLabel = new JLabel("Enter Book Name");
		AES.setFont(bookNameLabel, "Consolas", 2, 10, Color.DARK_GRAY);
		return bookNameLabel;
	}
	
	private JTextField bookNameField;
	private JTextField bookNameField() {
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(0,0,15,0);
		bookNameField = new JTextField();
		AES.setFont(bookNameField, "Constantia", 2, 13, Color.ORANGE);
		bookNameField.setCaretColor(Color.ORANGE);
		bookNameField.setBackground(Color.BLACK);
		bookNameField.setHorizontalAlignment(JTextField.CENTER);
		bookNameField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		bookNameField.setPreferredSize(new Dimension(250,25));
		return bookNameField;
	}
	
	public String getBookNameText() {
		return bookNameField.getText();
	}
	
	private JPanel cs() {
		JPanel cs = new JPanel();
		cs.setBackground(null);
		cs.setLayout(new BorderLayout());
		cs.add(ncs(), BorderLayout.NORTH);
		cs.add(scs(), BorderLayout.SOUTH);
		return cs;
	}
	
	private JPanel ncs() {
		JPanel ncs = new JPanel();
		ncs.setBackground(null);
		ncs.setLayout(new GridBagLayout());
		ncs.add(pageDownRadio(), c);
		ncs.add(rightArrowRadio(), c);
		ncs.add(mouseClickRadio(), c);
		ButtonGroup group = new ButtonGroup();
		group.add(pageDownRadio);
		group.add(rightArrowRadio);
		group.add(mouseClickRadio);
		return ncs;
	}
	
	private JRadioButton pageDownRadio;
	private JRadioButton pageDownRadio() {
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(0,0,15,40);
		pageDownRadio = new JRadioButton("Page down", false);
		pageDownRadio.setBackground(null);
		AES.setFont(pageDownRadio, "Constantia", 2, 13, Color.GREEN);
		return pageDownRadio;
	}
	public JRadioButton getPageDownRadio() {
		return pageDownRadio;
	}
	
	private JRadioButton rightArrowRadio;
	private JRadioButton rightArrowRadio() {
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(0,0,15,40);
		rightArrowRadio = new JRadioButton("Right arrow", false);
		rightArrowRadio.setBackground(null);
		AES.setFont(rightArrowRadio, "Constantia", 2, 13, Color.GREEN);
		return rightArrowRadio;
	}
	public JRadioButton getRightArrowRadio() {
		return rightArrowRadio;
	}
	
	private JRadioButton mouseClickRadio;
	private JRadioButton mouseClickRadio() {
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(0,0,15,0);
		mouseClickRadio = new JRadioButton("Mouse click", true);
		mouseClickRadio.setBackground(null);
		AES.setFont(mouseClickRadio, "Constantia", 2, 13, Color.GREEN);
		return mouseClickRadio;
	}
	public JRadioButton getMouseClickRadio() {
		return mouseClickRadio;
	}
	
	
	private JPanel scs() {
		JPanel scs = new JPanel();
		scs.setBackground(null);
		scs.setLayout(new GridBagLayout());
		scs.add(savePathLabel(), c);
		scs.add(savePathField(), c);
		scs.add(pageStartLabel(), c);
		scs.add(pageStartField(), c);
		scs.add(pageEndLabel(), c);
		scs.add(pageEndField(), c);
		scs.add(waitLabel(), c);
		scs.add(waitField(), c);
		return scs;
	}
	
	private JLabel savePathLabel() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,5);
		JLabel savePathLabel = new JLabel("Save path:");
		AES.setFont(savePathLabel, "Consolas", 2, 12, Color.GREEN);
		return savePathLabel;
	}
	
	private JTextField savePathField;
	private JTextField savePathField() {
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,20);
		savePathField = new JTextField();
		AES.setFont(savePathField, "Constantia", 2, 13, Color.ORANGE);
		savePathField.setCaretColor(Color.ORANGE);
		savePathField.setBackground(Color.BLACK);
		savePathField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		savePathField.setPreferredSize(new Dimension(250,25));
		return savePathField;
	}
	
	public void setPathText(String s) {
		savePathField.setText(s);
	}
	public String getPathText() {
		return savePathField.getText();
	}
	 
	private JLabel pageStartLabel() {
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,5);
		JLabel pageStartLabel = new JLabel("Page start:");
		AES.setFont(pageStartLabel, "Consolas", 2, 12, Color.GREEN);
		return pageStartLabel;
	}
	
	private JTextField pageStartField;
	private JTextField pageStartField() {
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,20);
		pageStartField = new JTextField();
		AES.setFont(pageStartField, "Constantia", 2, 15, Color.ORANGE);
		pageStartField.setCaretColor(Color.ORANGE);
		pageStartField.setBackground(Color.BLACK);
		pageStartField.setHorizontalAlignment(JTextField.CENTER);
		pageStartField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		pageStartField.setPreferredSize(new Dimension(40,25));
		return pageStartField;
	}
	
	public String getStartPageNumber() {
		return pageStartField.getText();
	}
	
	private JLabel pageEndLabel() {
		c.gridx = 4;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,5);
		JLabel pageEndLabel = new JLabel("Page end:");
		AES.setFont(pageEndLabel, "Consolas", 2, 12, Color.GREEN);
		return pageEndLabel;
	}
	
	private JTextField pageEndField;
	private JTextField pageEndField() {
		c.gridx = 5;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,20);
		pageEndField = new JTextField();
		AES.setFont(pageEndField, "Constantia", 2, 15, Color.ORANGE);
		pageEndField.setCaretColor(Color.ORANGE);
		pageEndField.setBackground(Color.BLACK);
		pageEndField.setHorizontalAlignment(JTextField.CENTER);
		pageEndField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		pageEndField.setPreferredSize(new Dimension(40,25));
		return pageEndField;
	}
	
	public String getEndPageNumber() {
		return pageEndField.getText();
	}
	
	private JLabel waitLabel() {
		c.gridx = 6;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,5);
		JLabel waitLabel = new JLabel("Wait milli:");
		AES.setFont(waitLabel, "Consolas", 2, 12, Color.GREEN);
		return waitLabel;
	}
	
	private JTextField waitField;
	private JTextField waitField() {
		c.gridx = 7;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,0);
		waitField = new JTextField();
		AES.setFont(waitField, "Constantia", 2, 15, Color.ORANGE);
		waitField.setCaretColor(Color.ORANGE);
		waitField.setBackground(Color.BLACK);
		waitField.setHorizontalAlignment(JTextField.CENTER);
		waitField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		waitField.setPreferredSize(new Dimension(60,25));
		return waitField;
	}
	
	public void setWaitField(int i) {
		waitField.setText(Integer.toString(i));
	}
	public String getWaitFieldText() {
		return waitField.getText();
	}
	
	private JPanel ss() {
		JPanel ss = new JPanel();
		ss.setBackground(null);
		ss.setLayout(new GridBagLayout());
		ss.add(startButton(), c);
		return ss;
	}
	
	private JButton startButton;
	private JButton startButton() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20,0,40,0);
		startButton = new JButton("Start");
		AES.setFont(startButton, "Consolas", 0, 15, Color.RED);
		AES.setButton(startButton, Color.RED);
		return startButton;
	}
	
	public void addButtonListener(ActionListener l) {
		startButton.addActionListener(l);
		pageDownRadio.addActionListener(l);
		rightArrowRadio.addActionListener(l);
		mouseClickRadio.addActionListener(l);
		
	}
	
	public JButton getStartButton() {
		return startButton;
	}
}
