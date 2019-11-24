package Exam.View.Options;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Exam.View.Abstractions.AES;

public class FullScreen extends JFrame  implements AES{
	
	private static final long serialVersionUID = 1L;
	public FullScreen() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setBackground(Color.PINK);
		this.setContentPane(screenShotLabel());
	}
	
	private JLabel screenShotLabel;
	private JLabel screenShotLabel() {
		screenShotLabel = new JLabel();
		
		return screenShotLabel;
	}
	public void setScreenShotLabel(BufferedImage i) {
		screenShotLabel.setIcon(new ImageIcon(i));
	}
	
	public void addLabelMouseListener(MouseListener m) {
		screenShotLabel.addMouseListener(m);
	}
}
