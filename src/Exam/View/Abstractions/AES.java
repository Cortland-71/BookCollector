package Exam.View.Abstractions;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

public interface AES {
	
	static void setFont(JComponent c, String font, int type, int size, Color fg) {
		c.setFont(new Font(font, type, size));
		c.setForeground(fg);
	}	
	
	static void setButton(JButton b, Color borderColor) {
		b.setFocusPainted(false);
		b.setPreferredSize(new Dimension(150,27));
		b.setBackground(new Color(20,20,20));
		b.setBorder(BorderFactory.createLineBorder(borderColor));
	}
	

}
