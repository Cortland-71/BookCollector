package Exam.View.Hub;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import Exam.View.ViewObj;

public class Hub {
	
	
	private HubNorth hubNorth;
	private HubCenter hubCenter;
	
	public Hub() {
		this.hubNorth = ViewObj.getNewHubNorth();
		this.hubCenter = ViewObj.getNewHubCenter();
	}

	public JPanel getTopPanel() {
		return hubPanel();
	}
	
	private JPanel hubPanel() {
		JPanel hubPanel = new JPanel();
		hubPanel.setLayout(new BorderLayout());
		hubPanel.setBackground(Color.BLACK);
		hubPanel.add(hubNorth.getTopPanel(), BorderLayout.NORTH);
		hubPanel.add(hubCenter.getTopPanel(), BorderLayout.CENTER);
		return hubPanel;
	}
	
	public HubNorth getHubNorth() {
		return hubNorth;
	}
	public HubCenter getHubCenter() {
		return hubCenter;
	}
	
}
