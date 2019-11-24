package Exam.View.Hub;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Exam.View.Abstractions.AES;

public class HubNorth {
	
	//North
	public JPanel getTopPanel() {
		return northPanel();
	}
	
	private GridBagConstraints c = new GridBagConstraints();
	
	private JPanel northPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLACK);
		northPanel.setLayout(new BorderLayout());
		northPanel.add(north(), BorderLayout.NORTH);
		northPanel.add(center(), BorderLayout.CENTER);
		return northPanel;
	}
	
	private JPanel north() {
		JPanel north = new JPanel();
		north.setBackground(null);
		north.setLayout(new GridBagLayout());
		north.add(title(), c);
		return north;
	}
	
	private JLabel title() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10,10,10,10);
		JLabel title = new JLabel("Page Collector");
		AES.setFont(title, "Constantia", 2, 35, Color.WHITE);
		return title;
	}
	
	private JPanel center() {
		JPanel center = new JPanel();
		center.setBackground(null);
		center.setLayout(new GridBagLayout());
		center.add(newButton(), c);
		center.add(viewButton(), c);
		center.add(howButton(), c);
		return center;
	}
	
	private JButton newButton;
	private JButton newButton() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10,10,20,10);
		newButton = new JButton("New Collection");
		AES.setFont(newButton, "Consolas", 0, 12, Color.GREEN);
		AES.setButton(newButton, Color.GREEN);
		return newButton;
	}
	
	private JButton viewButton;
	private JButton viewButton() {
		c.gridx = 1;
		c.gridy = 0;
		viewButton = new JButton("View Collection");
		AES.setFont(viewButton, "Consolas", 0, 12, Color.GREEN);
		AES.setButton(viewButton, Color.GREEN);
		return viewButton;
	}
	
	private JButton howButton;
	private JButton howButton() {
		c.gridx = 2;
		c.gridy = 0;
		howButton = new JButton("How");
		AES.setFont(howButton, "Consolas", 0, 12, Color.GREEN);
		AES.setButton(howButton, Color.GREEN);
		return howButton;
	}
	
	private ArrayList<JButton> buttonList = new ArrayList<>();
	
	
	public void addButtonListener(ActionListener l) {
		newButton.addActionListener(l);
		viewButton.addActionListener(l);
		howButton.addActionListener(l);
	}

	public JButton getButton(int index) {
		buttonList.add(newButton);
		buttonList.add(viewButton);
		buttonList.add(howButton);
		return buttonList.get(index);
	}
}
