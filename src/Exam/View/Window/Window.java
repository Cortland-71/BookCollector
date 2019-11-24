package Exam.View.Window;

import javax.swing.JFrame;

import Exam.View.ViewObj;
import Exam.View.Hub.Hub;

public class Window extends JFrame {

	
	private Hub hub;
	
	public Window() {
		this.hub = ViewObj.getNewHub();
		this.setSize(1000,750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Page Collector");
		this.setContentPane(hub.getTopPanel());
	}
	
	public Hub getTop() {
		return hub;
	}

}
