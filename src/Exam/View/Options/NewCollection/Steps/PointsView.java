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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Exam.View.Abstractions.AES;

public class PointsView {

	private GridBagConstraints c = new GridBagConstraints();

	// Center
	public JPanel center() {
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		center.setBackground(null);
		center.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		center.add(nc(), BorderLayout.NORTH);
		center.add(cc(), BorderLayout.CENTER);
		center.add(sc(), BorderLayout.SOUTH);
		return center;
	}

	private JPanel nc() {
		JPanel nc = new JPanel();
		nc.setBackground(null);
		nc.setLayout(new GridBagLayout());
		nc.add(infoLabel2(), c);
		return nc;
	}

	private JLabel infoLabel2() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20, 0, 10, 0);
		JLabel infoLabel = new JLabel();
		infoLabel
				.setText("<html><center>Next, open and place the book you want to capture behind this window. "
						+ "Click the \"Capture Points\" button. Click and drag a section<br/>"
						+ "of the screen you want to capture. Once you release the mouse, this window will "
						+ "populated with the coordanace you selected.</html>");
		AES.setFont(infoLabel, "Consolas", 0, 12, Color.GRAY);
		return infoLabel;
	}

	private JPanel cc() {
		JPanel cc = new JPanel();
		cc.setBackground(null);
		cc.setLayout(new GridBagLayout());
		cc.add(CapturePointsButton(), c);
		return cc;
	}

	private JButton capturePointsButton;

	private JButton CapturePointsButton() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 0, 0);
		capturePointsButton = new JButton("Capture Points");
		AES.setFont(capturePointsButton, "Constantia", 2, 15, Color.ORANGE);
		AES.setButton(capturePointsButton, Color.ORANGE);
		return capturePointsButton;
	}

	private JPanel sc() {
		JPanel sc = new JPanel();
		sc.setBackground(null);
		sc.setLayout(new GridBagLayout());
		sc.add(Label(), c);
		sc.add(XLabel(), c);
		sc.add(XField(), c);
		sc.add(YLabel(), c);
		sc.add(YField(), c);

		sc.add(dimLabel(), c);
		sc.add(dimWLabel(), c);
		sc.add(dimWField(), c);
		sc.add(dimHLabel(), c);
		sc.add(dimHField(), c);
		return sc;
	}

	// Top
	private JLabel Label() {
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 10, 20);
		c.anchor = GridBagConstraints.EAST;
		JLabel Label = new JLabel("Coordinance");
		AES.setFont(Label, "Consolas", 2, 12, Color.GREEN);
		return Label;
	}

	private JLabel XLabel() {
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 10, 5);
		JLabel XLabel = new JLabel("x:");
		AES.setFont(XLabel, "Consolas", 2, 15, Color.GREEN);
		return XLabel;
	}

	private JTextField XField;

	private JTextField XField() {
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 10, 20);
		XField = new JTextField();
		XField.setEditable(false);
		AES.setFont(XField, "Constantia", 2, 15, Color.ORANGE);
		XField.setCaretColor(Color.ORANGE);
		XField.setBackground(Color.BLACK);
		XField.setHorizontalAlignment(JTextField.CENTER);
		XField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		XField.setPreferredSize(new Dimension(60, 25));
		return XField;
	}

	private JLabel YLabel() {
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 10, 5);
		JLabel YLabel = new JLabel("y:");
		AES.setFont(YLabel, "Consolas", 2, 15, Color.GREEN);
		return YLabel;
	}

	private JTextField YField;

	private JTextField YField() {
		c.gridx = 4;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 10, 0);
		YField = new JTextField();
		YField.setEditable(false);
		AES.setFont(YField, "Constantia", 2, 15, Color.ORANGE);
		YField.setCaretColor(Color.ORANGE);
		YField.setBackground(Color.BLACK);
		YField.setHorizontalAlignment(JTextField.CENTER);
		YField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		YField.setPreferredSize(new Dimension(60, 25));
		return YField;
	}

	// Total
	private JLabel dimLabel() {
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(0, 0, 20, 20);
		getClass();
		JLabel dimLabel = new JLabel("Dimension");
		AES.setFont(dimLabel, "Consolas", 2, 12, Color.GREEN);
		return dimLabel;
	}

	private JLabel dimWLabel() {
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(0, 0, 20, 5);
		JLabel dimWLabel = new JLabel("w:");
		AES.setFont(dimWLabel, "Consolas", 2, 15, Color.GREEN);
		return dimWLabel;
	}

	private JTextField dimWField;

	private JTextField dimWField() {
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(0, 0, 20, 20);
		dimWField = new JTextField();
		dimWField.setEditable(false);
		AES.setFont(dimWField, "Constantia", 2, 15, Color.ORANGE);
		dimWField.setCaretColor(Color.ORANGE);
		dimWField.setBackground(Color.BLACK);
		dimWField.setHorizontalAlignment(JTextField.CENTER);
		dimWField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		dimWField.setPreferredSize(new Dimension(60, 25));
		return dimWField;
	}

	private JLabel dimHLabel() {
		c.gridx = 3;
		c.gridy = 1;
		c.insets = new Insets(0, 0, 20, 5);
		JLabel dimHLabel = new JLabel("h:");
		AES.setFont(dimHLabel, "Consolas", 2, 15, Color.GREEN);
		return dimHLabel;
	}

	private JTextField dimHField;

	private JTextField dimHField() {
		c.gridx = 4;
		c.gridy = 1;
		c.insets = new Insets(0, 0, 20, 0);
		dimHField = new JTextField();
		dimHField.setEditable(false);
		AES.setFont(dimHField, "Constantia", 2, 15, Color.ORANGE);
		dimHField.setCaretColor(Color.ORANGE);
		dimHField.setBackground(Color.BLACK);
		dimHField.setHorizontalAlignment(JTextField.CENTER);
		dimHField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		dimHField.setPreferredSize(new Dimension(60, 25));
		return dimHField;
	}

	private ArrayList<JTextField> pointFieldList = new ArrayList<>();

	private void createFieldList() {
		pointFieldList.add(XField);
		pointFieldList.add(YField);
		pointFieldList.add(dimWField);
		pointFieldList.add(dimHField);
	}

	public JTextField getPointField(int index) {
		createFieldList();
		return pointFieldList.get(index);
	}

	public void addButtonListener(ActionListener l) {
		capturePointsButton.addActionListener(l);
	}
}
