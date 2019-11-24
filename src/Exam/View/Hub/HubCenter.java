package Exam.View.Hub;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import Exam.View.ViewObj;
import Exam.View.Options.How.How;
import Exam.View.Options.NewCollection.NewColTopView.NewCollectionsView;
import Exam.View.Options.ViewCollection.ViewCollectionsView;

public class HubCenter {
	
	private NewCollectionsView nColView;
	private ViewCollectionsView vColView;
	private How howView;
	
	public HubCenter() {
		nColView = ViewObj.getNColView();
		vColView = ViewObj.getVColView();
		howView = ViewObj.getHowView();
		
	}
	
	private final CardLayout cl = new CardLayout();
	
	private JPanel centerPanel;
	private JPanel centerPanel() {
		centerPanel = new JPanel();
		centerPanel.setLayout(cl);
		centerPanel.add(nColView.getTopPanel(), "new");
		centerPanel.add(vColView.getTopPanel(), "view");
		centerPanel.add(howView.getTopPanel(), "how");
		centerPanel.setBackground(Color.BLACK);
		return centerPanel;
	}
	
	public void changePanel(String name) {
		cl.show(centerPanel, name);
	}
	
	public JPanel getTopPanel() {
		return centerPanel();
	}
	
	public ViewCollectionsView getVColView() {
		return vColView;
	}
	
	public NewCollectionsView getNColView() {
		return nColView;
	}
	
}
